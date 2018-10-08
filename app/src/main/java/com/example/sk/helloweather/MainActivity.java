package com.example.sk.helloweather;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {
    @Override
    protected void onCreate (Bundle savedInstanceStates){
        super.onCreate(savedInstanceStates);
        setContentView(R.layout.weather_info);
    }
}
