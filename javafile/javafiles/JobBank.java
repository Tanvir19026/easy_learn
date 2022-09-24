package com.example.easylearn;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

public class JobBank extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_onemathc2);

        RelativeLayout home=(RelativeLayout) findViewById(R.id.homeMain);
        RelativeLayout pro=(RelativeLayout) findViewById(R.id.proMain);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(JobBank.this,activityone.class);
                startActivity(intent);
            }
        });
        pro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(JobBank.this,newProfile.class);
                startActivity(intent);
            }
        });


    }
}