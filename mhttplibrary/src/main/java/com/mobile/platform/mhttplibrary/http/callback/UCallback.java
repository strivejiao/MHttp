package com.mobile.platform.mhttplibrary.http.callback;

/**
 * @Description : 上传/下载 进度回调
 * @Author : StriveJiao
 * @Date : 2020/2/4 15:29
 */

public interface UCallback {
    void onProgress(long currentLength, long totalLength, float percent);

    void onFail(int errCode, String errMsg);
}
