package com.example.easylearn;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class jobActivity extends AppCompatActivity {
    Button bcs,ielts,bank,b4,b5;
    CardView cardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_job);

        bcs=findViewById(R.id.jobBcs);
        bank=findViewById(R.id.jobBank1);
        ielts=findViewById(R.id.jobIelts);
        b4=findViewById(R.id.jobInterview);
        b5=findViewById(R.id.jobPrimary);

        bcs.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent=new Intent(jobActivity.this,jobBcs.class);
                jobActivity.this.startActivity(intent);
            }
        });
        bank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(jobActivity.this,JobBank1.class);
                startActivity(intent);
            }
        });

        ielts.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent=new Intent(jobActivity.this,jobIelts.class);
                jobActivity.this.startActivity(intent);
            }
        });
        b4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent=new Intent(jobActivity.this,jobInterview.class);
                jobActivity.this.startActivity(intent);
            }
        });
        b5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent=new Intent(jobActivity.this,primaryniyog.class);
                jobActivity.this.startActivity(intent);
            }
        });

        RelativeLayout home=(RelativeLayout) findViewById(R.id.homeMain);
        RelativeLayout pro=(RelativeLayout) findViewById(R.id.proMain);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(jobActivity.this,activityone.class);
                startActivity(intent);
            }
        });
        pro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(jobActivity.this,newProfile.class);
                startActivity(intent);
            }
        });

    }
}