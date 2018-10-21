package com.example.bryan.hereheroemergency;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class TsunamiActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private TsunamiSlider adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tsunami);
        viewPager = (ViewPager) findViewById(R.id.viewPager_Tsunami);
        adapter = new TsunamiSlider(this);
        viewPager.setAdapter(adapter);
    }
}
