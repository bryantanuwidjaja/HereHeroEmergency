package com.example.bryan.hereheroemergency;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class RequestActivity extends AppCompatActivity {

    TextView clickhere_Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request);
        Intent intent = getIntent();
        clickhere_Button = findViewById(R.id.clickherebutton);
        
    }

}
