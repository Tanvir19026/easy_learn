package com.example.easylearn;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import androidx.appcompat.app.AppCompatActivity;


public class quizFirst extends AppCompatActivity {

    Button demoBtn, join;
    private String selectedTopicName="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_first);
        final LinearLayout english=findViewById(R.id.englishlayout);
        final LinearLayout bcs=findViewById(R.id.bcslayout);
        final LinearLayout bank=findViewById(R.id.banklayout);
        final LinearLayout primary=findViewById(R.id.primarylayout);


        final Button start=(Button) findViewById(R.id.quizstart);
        english.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedTopicName="English exam";
                english.setBackgroundResource(R.drawable.round_back_redstroke10);
                bcs.setBackgroundResource(R.drawable.round_back_white10);
                bank.setBackgroundResource(R.drawable.round_back_white10);
                primary.setBackgroundResource(R.drawable.round_back_white10);
            }
        });
        bcs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedTopicName="BCS exam";
                bcs.setBackgroundResource(R.drawable.round_back_redstroke10);
                english.setBackgroundResource(R.drawable.round_back_white10);
                bank.setBackgroundResource(R.drawable.round_back_white10);
                primary.setBackgroundResource(R.drawable.round_back_white10);
            }
        });
        bank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedTopicName="Bank exam";
                bank.setBackgroundResource(R.drawable.round_back_redstroke10);
                bcs.setBackgroundResource(R.drawable.round_back_white10);
                english.setBackgroundResource(R.drawable.round_back_white10);
                primary.setBackgroundResource(R.drawable.round_back_white10);

            }
        });
        primary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedTopicName="Primary exam";
                primary.setBackgroundResource(R.drawable.round_back_redstroke10);
                bcs.setBackgroundResource(R.drawable.round_back_white10);
                english.setBackgroundResource(R.drawable.round_back_white10);
                bank.setBackgroundResource(R.drawable.round_back_white10);
            }
        });
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(selectedTopicName.isEmpty()){
                    Toast.makeText(quizFirst.this,"Please select a subject",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Intent intent=new Intent(quizFirst.this, QuizActivity.class);
                    intent.putExtra("SelectedTopic",selectedTopicName);
                    startActivity(intent);
                }
            }
        });
    }

}
