package com.example.bryan.hereheroemergency;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class TerroristActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private TerroristSlider adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terrorist);
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        adapter = new TerroristSlider(this);
        viewPager.setAdapter(adapter);
    }
}
