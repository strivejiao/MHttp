package com.mobile.platform.mhttp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.mobile.platform.mhttplibrary.http.VHttp;
import com.mobile.platform.mhttplibrary.http.callback.ACallback;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        Button bt_main = findViewById(R.id.bt_main);
        bt_main.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.bt_main) {

            getNetData();
        }

    }

    private void getNetData() {

        VHttp.GET("wxarticle/chapters/json").request(new ACallback<Object>() {
            @Override
            public void onSuccess(Object data) {
                if (data != null) {

                }

            }

            @Override
            public void onFail(int errCode, String errMsg) {

            }
        });


//        Map<String, String> map = new HashMap<>();
//        map.put("id", "110");
//        map.put("name", "baidu");
//        map.put("link", "https://www.baidu.com/");
//        VHttp.POST("https://www.wanandroid.com/lg/collect/updatetool/json");
    }
}
