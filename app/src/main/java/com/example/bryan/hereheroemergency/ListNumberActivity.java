package com.example.bryan.hereheroemergency;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ListNumberActivity extends AppCompatActivity {
    private static final String TAG = "ListNumberActivity";

    ListView listView_ListNumber;
    private ArrayList<ListNumber> arrayListNumbers = new ArrayList<>();
    private ListNumberAdapter listNumberAdapter;
    String numberHolder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listnumber);
        listView_ListNumber = (ListView) findViewById(R.id.listView_ListNumberActivity_Numbers);
        listNumberAdapter = new ListNumberAdapter(ListNumberActivity.this,arrayListNumbers);
        final Button button_Back = findViewById(R.id.button_ListNumberActivity_Back);


        ListNumber number1 = new ListNumber ("USA","911",R.drawable.ic_person);
        arrayListNumbers.add(number1);
        ListNumber number2 = new ListNumber ("Canada","911",R.drawable.ic_person);
        arrayListNumbers.add(number2);
        ListNumber number3 = new ListNumber ("Mexico","066",R.drawable.ic_person);
        arrayListNumbers.add(number3);
        ListNumber number4 = new ListNumber ("China","999",R.drawable.ic_person);
        arrayListNumbers.add(number4);
        ListNumber number5 = new ListNumber ("India","102",R.drawable.ic_person);
        arrayListNumbers.add(number5);
        ListNumber number6 = new ListNumber ("Indonesia","118",R.drawable.ic_person);
        arrayListNumbers.add(number6);
        ListNumber number7 = new ListNumber ("Iran","112",R.drawable.ic_person);
        arrayListNumbers.add(number7);
        ListNumber number8 = new ListNumber ("Malaysia","999",R.drawable.ic_person);
        arrayListNumbers.add(number8);
        ListNumber number9 = new ListNumber ("Singapore","995",R.drawable.ic_person);
        arrayListNumbers.add(number9);


        listNumberAdapter = new ListNumberAdapter(ListNumberActivity.this,arrayListNumbers);
        listView_ListNumber.setAdapter(listNumberAdapter);

        button_Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });




    }
}
