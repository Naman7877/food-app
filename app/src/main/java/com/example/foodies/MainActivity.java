package com.example.foodies;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.time.Instant;

public class MainActivity extends AppCompatActivity {

    Button login,register;
    TextView skip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        );

        getSupportActionBar().hide();
        login=findViewById(R.id.login);
        register=findViewById(R.id.register);
        skip=findViewById(R.id.skip);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "click to log in ", Toast.LENGTH_LONG).show();
                Intent intent=new Intent(MainActivity.this , sing_in.class);
                startActivity(intent);
            }
        });
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "click to register (new user) ", Toast.LENGTH_LONG).show();
                Intent intent=new Intent(MainActivity.this,sign_up.class);
                startActivity(intent);
            }
        });
        skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "start app with out log in ", Toast.LENGTH_SHORT).show();

            }
        });


         new AlertDialog.Builder(MainActivity.this)
                 .setIcon(R.drawable.ic_baseline_check_24)
                 .setMessage("welcome")
                 .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                     @Override
                     public void onClick(DialogInterface dialog, int which) {
                         Toast.makeText(MainActivity.this, "Starting", Toast.LENGTH_SHORT).show();
                         dialog.dismiss();
                     }
                 })
                 .show();





    }
}