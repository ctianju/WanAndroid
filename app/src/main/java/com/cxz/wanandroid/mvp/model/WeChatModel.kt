package com.cxz.wanandroid.mvp.model

import com.cxz.wanandroid.base.BaseModel
import com.cxz.wanandroid.http.RetrofitHelper
import com.cxz.wanandroid.mvp.model.bean.HttpResult
import com.cxz.wanandroid.mvp.model.bean.WXChapterBean
import com.cxz.wanandroid.rx.SchedulerUtils
import io.reactivex.Observable

/**
 * @author chenxz
 * @date 2018/10/28
 * @desc
 */
class WeChatModel : BaseModel() {

    fun getWXChapters(): Observable<HttpResult<MutableList<WXChapterBean>>> {
        return RetrofitHelper.service.getWXChapters()
                .compose(SchedulerUtils.ioToMain())
    }

}