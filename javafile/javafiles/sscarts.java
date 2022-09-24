package com.example.easylearn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class sscarts extends AppCompatActivity {
private Button b1,b2,b3,b4,b5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.class_9_10_arts);
        b1=(Button) findViewById(R.id.sscitihas);
        b2=(Button) findViewById(R.id.sscvugol);
        b3=(Button) findViewById(R.id.ssceconomics);
        b4=(Button) findViewById(R.id.sscagri);
        b5=(Button) findViewById(R.id.sscbiggan);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(sscarts.this,sscitihas.class);
                startActivity(intent);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(sscarts.this,sscvugol.class);
                startActivity(intent);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(sscarts.this,ssceconomics.class);
                startActivity(intent);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(sscarts.this,ssckrisi.class);
                startActivity(intent);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(sscarts.this,sscbiggan.class);
                startActivity(intent);
            }
        });

        RelativeLayout home=(RelativeLayout) findViewById(R.id.homeMain);
        RelativeLayout pro=(RelativeLayout) findViewById(R.id.proMain);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(sscarts.this,activityone.class);
                startActivity(intent);
            }
        });
        pro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(sscarts.this,newProfile.class);
                startActivity(intent);
            }
        });
    }
}