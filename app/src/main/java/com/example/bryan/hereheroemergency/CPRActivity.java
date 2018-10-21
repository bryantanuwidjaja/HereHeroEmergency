package com.example.bryan.hereheroemergency;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class CPRActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private CPRSlider adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cpr);
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        adapter = new CPRSlider(this);
        viewPager.setAdapter(adapter);
    }
}
