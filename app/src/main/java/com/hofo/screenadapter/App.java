package com.hofo.screenadapter;

import android.app.Application;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ScreenAdapter.setup(this);
        ScreenAdapter.register(this,200,ScreenAdapter.MATCH_BASE_WIDTH,ScreenAdapter.MATCH_UNIT_DP);
    }
}
