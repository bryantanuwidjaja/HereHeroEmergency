package com.example.bryan.hereheroemergency;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class EarthquakeActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private EarthquakeSlider adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_earthquake);
        viewPager = (ViewPager) findViewById(R.id.viewPager_Earthquake);
        adapter = new EarthquakeSlider(this);
        viewPager.setAdapter(adapter);
    }
}
