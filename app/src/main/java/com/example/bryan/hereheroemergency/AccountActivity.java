package com.example.bryan.hereheroemergency;

import android.app.DatePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;


public class AccountActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    private static final String TAG = "AccountActivity";

    String nameSP;
    String dateSP;
    String addressSP;
    int phoneSP;
    EditText editText_name;
    EditText editText_address;
    EditText editText_phone;


    TextView textView_DiplayDate;
    DatePickerDialog.OnDateSetListener mDateSetListener;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);

        textView_DiplayDate = (TextView) findViewById(R.id.datepicker_TextView);

        editText_name = findViewById(R.id.name_EditText);
        editText_address = findViewById(R.id.address_EditText);
        editText_phone = findViewById(R.id.phone_EditText);
        Button cancelButton = findViewById(R.id.cancel_Button);
        Button saveButton = findViewById(R.id.save_Button);


        final Spinner spinner = findViewById(R.id.bloodtype_Spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.bloodtype, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);


        //SharedPref Load Item.
        SharedPreferences prefs = getSharedPreferences("mydata",MODE_PRIVATE);
        String nameDBdefault = prefs.getString("Full Name","");
        editText_name.setText(nameDBdefault);
        String dateDBdefault = prefs.getString("Date of Birth","Date of Birth");
        textView_DiplayDate.setText(dateDBdefault);
        String addressDBdefault = prefs.getString("Address","");
        editText_address.setText(addressDBdefault);
        spinner.setSelection(prefs.getInt("spinnerSelection",0));
        int phoneDBdefault = prefs.getInt("Phone Number",0);
        int container = (prefs.getInt("Phone Number",0));
        Log.d(TAG, "container : " + container);
        if(container == 0){
            editText_phone.setText("");
        }
        else{
            editText_phone.setText(Integer.toString(container));
        }


        cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }

        });

        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nameSP = editText_name.getText().toString();
                dateSP = textView_DiplayDate.getText().toString();
                addressSP = editText_address.getText().toString();
                int selectedPosition = spinner.getSelectedItemPosition();
                phoneSP = Integer.parseInt(editText_phone.getText().toString());

                SharedPreferences prefs = getSharedPreferences("mydata",MODE_PRIVATE);
                SharedPreferences.Editor editor = prefs.edit();

                editor.putString("Full Name",nameSP);
                editor.putString("Date of Birth",dateSP);
                editor.putString("Address",addressSP);
                editor.putInt("spinnerSelection", selectedPosition);
                editor.putInt("Phone Number", phoneSP);
                editor.apply();
                Toast.makeText(AccountActivity.this, "Data Saved", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);


            }
        });

        textView_DiplayDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar cal = Calendar.getInstance();
                int year = cal.get(Calendar.YEAR);
                int month = cal.get(Calendar.MONTH);
                int day = cal.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog dialog = new DatePickerDialog(
                        AccountActivity.this,
                        android.R.style.Theme_Holo_Light_Dialog_MinWidth,
                        mDateSetListener,
                        year,month,day);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();



            }
        });

        mDateSetListener= new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                Log.d(TAG, "onDateSet: date: "+year +"/" +month +"/" +dayOfMonth);

                String date = dayOfMonth + "/" + month + "/" +year;
                textView_DiplayDate.setText(date);
            }
        };

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
