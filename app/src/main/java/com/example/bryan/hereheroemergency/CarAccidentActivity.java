package com.example.bryan.hereheroemergency;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class CarAccidentActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private CarAccidentSlider adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_accident);
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        adapter = new CarAccidentSlider(this);
        viewPager.setAdapter(adapter);
    }
}
