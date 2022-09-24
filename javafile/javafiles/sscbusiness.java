package com.example.easylearn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class sscbusiness extends AppCompatActivity {
private Button b1,b2,b3,b4,b5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.class_9_10_commerce);
        b1=(Button) findViewById(R.id.sschisab);
        b2=(Button) findViewById(R.id.sscfinance);
        b3=(Button) findViewById(R.id.sscbebsa);
        b4=(Button) findViewById(R.id.sscagric);
        b5=(Button) findViewById(R.id.sscbigganc);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(sscbusiness.this,sschisab.class);
                startActivity(intent);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(sscbusiness.this,sscfinance.class);
                startActivity(intent);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(sscbusiness.this,sscbebsa.class);
                startActivity(intent);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(sscbusiness.this,ssckrisi.class);
                startActivity(intent);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(sscbusiness.this,sscbiggan.class);
                startActivity(intent);
            }
        });

        RelativeLayout home=(RelativeLayout) findViewById(R.id.homeMain);
        RelativeLayout pro=(RelativeLayout) findViewById(R.id.proMain);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(sscbusiness.this,activityone.class);
                startActivity(intent);
            }
        });
        pro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(sscbusiness.this,newProfile.class);
                startActivity(intent);
            }
        });
    }
}