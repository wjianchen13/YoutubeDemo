package com.example.youtubedemo.data;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.youtubedemo.R;

public class DataActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);
    }

    public void onTest1(View v) {
        startActivity(new Intent(this, TestActivity1.class));
    }



}



