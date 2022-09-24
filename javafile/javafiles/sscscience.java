package com.example.easylearn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class sscscience extends AppCompatActivity {
private Button b1,b2,b3,b4,b5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.class_9_10_science);
        b1=(Button) findViewById(R.id.sscphysics);
        b2=(Button) findViewById(R.id.sscchemistry);
        b3=(Button) findViewById(R.id.sscbiology);
        b4=(Button) findViewById(R.id.sschighermath);
        b5=(Button) findViewById(R.id.sscsomaj);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(sscscience.this,sscphysics.class);
                startActivity(intent);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(sscscience.this,sscchemistry.class);
                startActivity(intent);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(sscscience.this,sscbiology.class);
                startActivity(intent);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(sscscience.this,sschighermath.class);
                startActivity(intent);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(sscscience.this,sscsomaj.class);
                startActivity(intent);
            }
        });

        RelativeLayout home=(RelativeLayout) findViewById(R.id.homeMain);
        RelativeLayout pro=(RelativeLayout) findViewById(R.id.proMain);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(sscscience.this,activityone.class);
                startActivity(intent);
            }
        });
        pro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(sscscience.this,newProfile.class);
                startActivity(intent);
            }
        });
        
        
    }
}