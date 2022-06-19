package com.gsls.thermalremediation;

import android.app.Application;

import com.gsls.thermalremediation.util.FixDexUtil;

public class MyApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        FixDexUtil.startRepair( getApplicationContext(),"com.gsls.thermalremediation");//开启热修复
    }

}
