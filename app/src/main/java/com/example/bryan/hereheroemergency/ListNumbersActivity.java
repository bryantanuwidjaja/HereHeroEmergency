package com.example.bryan.hereheroemergency;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.support.design.widget.TabLayout;


public class ListNumbersActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        

        ListNumber number1 = new ListNumber ("USA","911","911","911",R.drawable.ic_person);
        arrayListNumbers.add(number1);
        ListNumber number2 = new ListNumber ("Canada","911","911","911",R.drawable.ic_person);
        arrayListNumbers.add(number2);
        ListNumber number3 = new ListNumber ("Mexico","066","066","066",R.drawable.ic_person);
        arrayListNumbers.add(number3);
        ListNumber number4 = new ListNumber ("China","110","120","119",R.drawable.ic_person);
        arrayListNumbers.add(number4);
        ListNumber number5 = new ListNumber ("India","100","102","101",R.drawable.ic_person);
        arrayListNumbers.add(number5);
        ListNumber number6 = new ListNumber ("Indonesia","110","118","113",R.drawable.ic_person);
        arrayListNumbers.add(number6);
        ListNumber number7 = new ListNumber ("Iran","110","115","125",R.drawable.ic_person);
        arrayListNumbers.add(number7);
        ListNumber number8 = new ListNumber ("Malaysia","999","999","999",R.drawable.ic_person);
        arrayListNumbers.add(number8);
        ListNumber number9 = new ListNumber ("Singapore","999","995","995",R.drawable.ic_person);
        arrayListNumbers.add(number9);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);
        setupViewPager(viewPager);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        tabLayout.setupWithViewPager(viewPager);//setting tab over viewpager
    }

    //Setting View Pager
    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFrag(new ListNumberPoliceFragment(), "Police");
        adapter.addFrag(new ListNumberMedicalFragment(), "Medical");
        adapter.addFrag(new ListNumberFireFragment(), "Fire");
        viewPager.setAdapter(adapter);
    }


}
