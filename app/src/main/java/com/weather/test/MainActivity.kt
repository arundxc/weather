package com.weather.test

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.weather.test.databinding.ActivityMainBinding
import com.weather.test.pojo.WeatherModule

class MainActivity : AppCompatActivity() {


    //lateinit var binding : ActivityMainBinding
    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        //var weatherModule = WeatherModule()
        //binding.weather=(weatherModule)


    }
}
