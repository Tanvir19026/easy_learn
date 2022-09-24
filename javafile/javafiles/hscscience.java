package com.example.easylearn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class hscscience extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.class_11_12_science);
        b1=(Button) findViewById(R.id.hscphysics1st);
        b2=(Button) findViewById(R.id.hscphysics2nd);
        b3=(Button) findViewById(R.id.hscchemistry1st);
        b4=(Button) findViewById(R.id.hscchemistry2nd);
        b5=(Button) findViewById(R.id.hscbiology1st);
        b6=(Button) findViewById(R.id.hscbiology2nd);
        b7=(Button) findViewById(R.id.hschighermath1st);
        b8=(Button) findViewById(R.id.hschighermath2nd);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(hscscience.this,hscphysics1st.class);
                startActivity(intent);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(hscscience.this,hscphysics2nd.class);
                startActivity(intent);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(hscscience.this,hscchemistry1st.class);
                startActivity(intent);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(hscscience.this,hscchemistry2nd.class);
                startActivity(intent);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(hscscience.this,hscbiology1st.class);
                startActivity(intent);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(hscscience.this,hscbiology2nd.class);
                startActivity(intent);
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(hscscience.this,hschighermath1st.class);
                startActivity(intent);
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(hscscience.this,hschighermath2nd.class);
                startActivity(intent);
            }
        });

        RelativeLayout home=(RelativeLayout) findViewById(R.id.homeMain);
        RelativeLayout pro=(RelativeLayout) findViewById(R.id.proMain);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(hscscience.this,activityone.class);
                startActivity(intent);
            }
        });
        pro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(hscscience.this,newProfile.class);
                startActivity(intent);
            }
        });


    }
}