package com.example.bryan.hereheroemergency;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;

public class SirenActivity extends AppCompatActivity {
    private static final String TAG = "SirenActivity";
    MediaPlayer mySound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_siren);
        Switch switch_OnOff = findViewById(R.id.switch_SirenActivity_OnOff);
        switch_OnOff.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked == true){
                    play();
                }else
                {
                    stop();
                }
            }
        });

    }

    public void play(){
        mySound = MediaPlayer.create(this, R.raw.siren);
        mySound.setLooping(true);
        mySound.start();
        Log.d(TAG, "onCreate: In");
    }
    public void stop(){
        if (mySound != null) {
            mySound.release();
            mySound = null;
            Log.d(TAG, "onCreate: out");
        }
    }

}
