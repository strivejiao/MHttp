package com.mobile.platform.mhttplibrary.http.callback;

/**
 * @Description : 请求接口回调
 * @Author : StriveJiao
 * @Date : 2020/2/4 15:29
 */

public abstract class ACallback<T> {
    public abstract void onSuccess(T data);

    public abstract void onFail(int errCode, String errMsg);
}
