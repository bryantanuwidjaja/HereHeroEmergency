package com.example.bryan.hereheroemergency;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.support.design.widget.TabLayout;

import java.util.ArrayList;


public class ListNumbersActivity extends AppCompatActivity {
    private ArrayList<ListNumbers> arrayListNumbers = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listnumbers);



        ListNumbers number1 = new ListNumbers ("USA","911","911","911",R.drawable.ic_person);
        arrayListNumbers.add(number1);
        ListNumbers number2 = new ListNumbers ("Canada","911","911","911",R.drawable.ic_person);
        arrayListNumbers.add(number2);
        ListNumbers number3 = new ListNumbers ("Mexico","066","066","066",R.drawable.ic_person);
        arrayListNumbers.add(number3);
        ListNumbers number4 = new ListNumbers ("China","110","120","119",R.drawable.ic_person);
        arrayListNumbers.add(number4);
        ListNumbers number5 = new ListNumbers ("India","100","102","101",R.drawable.ic_person);
        arrayListNumbers.add(number5);
        ListNumbers number6 = new ListNumbers ("Indonesia","110","118","113",R.drawable.ic_person);
        arrayListNumbers.add(number6);
        ListNumbers number7 = new ListNumbers("Iran","110","115","125",R.drawable.ic_person);
        arrayListNumbers.add(number7);
        ListNumbers number8 = new ListNumbers ("Malaysia","999","999","999",R.drawable.ic_person);
        arrayListNumbers.add(number8);
        ListNumbers number9 = new ListNumbers ("Singapore","999","995","995",R.drawable.ic_person);
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
