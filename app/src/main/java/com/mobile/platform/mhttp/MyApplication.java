package com.mobile.platform.mhttp;

import android.app.Application;

import com.mobile.platform.mhttplibrary.http.VHttp;
import com.mobile.platform.mhttplibrary.http.interceptor.HttpLogInterceptor;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: jiaochenguang
 * @CreateTime： 2020/3/10 16:51
 * @Description：
 */
public class MyApplication extends Application {
    private String baseUrl = "https://www.wanandroid.com";

    @Override
    public void onCreate() {
        super.onCreate();
        init();
    }

    private void init() {
        Map<String, String> headers = new HashMap<>();
        headers.put("mKey", "mobile");
        headers.put("version", "V1.0%281%29");
        headers.put("imei", "351670062419259");

        VHttp.init(this);
        VHttp.CONFIG()
                .baseUrl(baseUrl)
                .log(true)
                .interceptor(new HttpLogInterceptor().setLevel(HttpLogInterceptor.Level.BODY));
    }
}
