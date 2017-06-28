package com.example.xu.xinxin2017summer;

import android.app.Application;

import com.example.xu.xinxin2017summer.util.UtilLog;

/**
 * Created by xu on 6/19/17.
 */

public class XinxinApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        UtilLog.setIsLog(true);
    }
}
