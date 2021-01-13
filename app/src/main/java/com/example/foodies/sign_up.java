package com.example.foodies;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class sign_up extends AppCompatActivity {

    Button res;
    TextView textaccount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        getSupportActionBar().setTitle("sign up");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        res=findViewById(R.id.res);
        textaccount=findViewById(R.id.textaccount);
        textaccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(sign_up.this,sing_in.class);
                startActivity(intent);
            }
        });


    }
}