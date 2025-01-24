package com.example.youtubedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.youtubedemo.data.DataActivity;
import com.example.youtubedemo.video.VideoActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onTest1(View v) {
        startActivity(new Intent(this, DataActivity.class));
    }

    public void onTest2(View v) {
        startActivity(new Intent(this, VideoActivity.class));
    }



    String TimeUtilities.formatTime(float timeInSeconds)




}




