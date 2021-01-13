package com.example.foodies;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class sing_in extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sing_in);
        getSupportActionBar().setTitle("sign in");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}