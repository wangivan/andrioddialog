package com.apple.rongclound;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import io.rong.imkit.RongIM;
import io.rong.imlib.RongIMClient;

public class MainActivity extends Activity {

    private static final String token = "bYNbTchfUssn+Ndrjv/Vrf7KNyXUn/Wqk91CfcCGhVsXI6ia4hfb8jlEwBVPbvlDEjPMtSY6xhCqunOVpX102mWBchOTdywa";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RongIM.connect(token, new RongIMClient.ConnectCallback() {
            @Override
            public void onTokenIncorrect() {

                Log.e("onTokenIncorrect", "onTokenIncorrect: your Token Error!!!");

            }

            @Override
            public void onSuccess(String s) {
                Log.e("onsuccessful", "onSuccess: userId:"+s);
            }

            @Override
            public void onError(RongIMClient.ErrorCode errorCode) {
                Log.e("onError", "onError: errorCode"+ errorCode.getValue());
            }
        });

        //启动会话列表界面

        if (RongIM.getInstance()!= null){}
            RongIM.getInstance().startConversationList(this);
    }

}
