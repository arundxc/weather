package com.weather.test.dagger;

import com.weather.test.MainActivity;

import dagger.Component;

/**
 * Created by Arun on 06/04/19.
 */
@Component(modules = ServiceResponseModal.class)
public interface AppComponent {

void inject(MainActivity mainActivity);


}
