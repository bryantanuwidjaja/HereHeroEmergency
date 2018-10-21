package com.example.bryan.hereheroemergency;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class HouseFireActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private HouseFireSlider adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_house_fire);
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        adapter = new HouseFireSlider(this);
        viewPager.setAdapter(adapter);
    }
}
