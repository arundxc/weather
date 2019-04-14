package com.weather.test

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.weather.test.databinding.ActivityMainBinding
import com.weather.test.pojo.Temp
import com.weather.test.pojo.WeatherModule
import javax.inject.Inject
import javax.inject.Named
import com.weather.test.dagger.MyApplication



class MainActivity : AppCompatActivity() {


    //lateinit var binding : ActivityMainBinding
    lateinit var binding : ActivityMainBinding

     //val applicaiton = null

    @field:[Inject Named("weather")]
    lateinit var eggs: String



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)


        (application as MyApplication).getAppComponent().inject(this)


       Log.d("MainActivity", "Eggs-------->" + eggs + " " + eggs)


        var weatherModule = WeatherModule()
        binding.weather=(weatherModule)

        var arun = Temp()
        binding.arun=(arun)


    }
}


