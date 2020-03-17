package com.mobile.platform.mhttplibrary.http.log;

import android.util.Log;

import com.mobile.platform.mhttplibrary.http.common.VConfig;
import com.mobile.platform.mhttplibrary.http.config.HttpConfig;


/**
 * @Description : 日志输出类
 * @Author : StriveJiao
 * @Date : 2020/2/24 15:29
 */

public class VLog {

    public static void e(String message) {
        if (!HttpConfig.getInstance().getIsLog())
            return;
        Log.e(VConfig.TAG, message);
    }

    public static void i(String message) {
        if (!HttpConfig.getInstance().getIsLog())
            return;
        Log.i(VConfig.TAG, message);
    }

    public static void d(String message) {
        if (!HttpConfig.getInstance().getIsLog())
            return;
        Log.d(VConfig.TAG, message);
    }
}
