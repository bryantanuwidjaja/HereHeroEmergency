package com.example.bryan.hereheroemergency;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationManager;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.UUID;

public class ReportActivity extends AppCompatActivity {
    private static final String TAG = "ReportActivity";
    static final int REQUEST_LOCATION = 1;
    LocationManager locationManager;
    double locationLongitude;
    double locationLatitude;
    String exactLocation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);

        final Spinner spinner_ListEmergency = findViewById(R.id.spinner_ReportActivity_ListEmergency);
        final EditText editText_Title = findViewById(R.id.editText_ReportActivity_Title);
        final EditText editText_Description = findViewById(R.id.editText_ReportActivity_Description);
        final EditText editText_Location = findViewById(R.id.editText_ReportActivity_Location);

        final Button button_Report = findViewById(R.id.button_ReportActivity_Report);
        final Button button_Cancel = findViewById(R.id.button_ReportActivity_Cancel);
        final Button button_Location = findViewById(R.id.button_ReportActivity_Location);

        locationManager= (LocationManager)getSystemService(Context.LOCATION_SERVICE);
        Location();

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.listEmergency,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_ListEmergency.setAdapter(adapter);
        //spinner_ListEmergency.setOnItemSelectedListener(this);

        button_Report.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int selectedPosition = spinner_ListEmergency.getSelectedItemPosition();
                if(selectedPosition == 0)
                {
                    Log.d(TAG, "onClick: OUT");
                    Toast.makeText(ReportActivity.this,"Please Choose one Emergency Type",Toast.LENGTH_LONG).show();
                }
                else
                {
                    Log.d(TAG, "onClick: IN");
                    String reportID = UUID.randomUUID().toString();
                    String emergency = (String) spinner_ListEmergency.getSelectedItem();
                    String title = editText_Title.getText().toString();
                    String location = editText_Location.getText().toString();
                    String description = editText_Description.getText().toString();

                    Report report = new Report(reportID,emergency,title,location,description);
                    addToDatabaseReport(reportID,report);

                }
            }
        });

        button_Cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });

        button_Location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String location = exactLocation;
                editText_Location.setText(location);
            }
        });

    }

    private void addToDatabaseReport(final String reportID,final Report report){
        FirebaseFirestore.getInstance().collection(Constants.REPORT)
                .document(reportID)
                .set(report)
                .addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void aVoid) {
                        Intent intent = new Intent(getApplicationContext(), RequestActivity.class);
                        startActivity(intent);
                        finish();
                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(ReportActivity.this,"Failed to send request", Toast.LENGTH_LONG).show();
                        Log.d(TAG, "onFailure: "+ e);
                    }
                });

    }

    void Location(){
        if(ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_FINE_LOCATION) !=
                PackageManager.PERMISSION_GRANTED)
        {
            ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.ACCESS_FINE_LOCATION},REQUEST_LOCATION);

        }else
        {
            Location location = locationManager.getLastKnownLocation(LocationManager.NETWORK_PROVIDER);
            if(location != null){
                locationLatitude = location.getLatitude();
                locationLongitude = location.getLongitude();
                exactLocation = locationLatitude+","+locationLongitude;
                Log.d(TAG, "getLatitude: " + locationLatitude);
                Log.d(TAG, "getLongitude: " + locationLongitude);
            }else
            {
                Toast.makeText(ReportActivity.this, "No Location was Found",Toast.LENGTH_LONG).show();
            }
        }

    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults)
    {
        super.onRequestPermissionsResult(requestCode,permissions,grantResults);
        switch (requestCode){
            case REQUEST_LOCATION:
                Location();
                break;

        }
    }

}
