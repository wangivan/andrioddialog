package com.apple.rongclound;

import android.app.Application;

import io.rong.imkit.RongIM;

/**
 * Created by apple on 16/6/5.
 */
public class InitRongCloud extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
        RongIM.init(this);
    }
}
