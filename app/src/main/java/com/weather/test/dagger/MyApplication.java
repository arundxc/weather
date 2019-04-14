package com.weather.test.dagger;

import android.app.Application;

/**
 * Created by Arun on 06/04/19.
 */

public class MyApplication extends Application {

    public AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();

       appComponent = DaggerAppComponent.builder().serviceResponseModal(new ServiceResponseModal()).build();

    }

    public AppComponent getAppComponent() {
        return appComponent;
    }
}

