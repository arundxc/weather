package com.weather.test.dagger;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Arun on 06/04/19.
 */
@Module
public class ServiceResponseModal {

    @Named("weather")
    @Provides
    public String weatherResponse(){
        return "30f";
    }

}
