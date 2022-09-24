package com.example.easylearn;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import com.example.easylearn.*;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class QuizResults extends AppCompatActivity {
    public static int chk=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_results);

        final AppCompatButton startNewBtn=findViewById(R.id.startNewQuiz);
        final TextView correctAnswer=findViewById(R.id.correctAnswer);
        final TextView incorrectAnswer=findViewById(R.id.incorrectAnswer);

        final int getCorrectAnswers=getIntent().getIntExtra("correct",0);
        final int getInCorrectAnswers=getIntent().getIntExtra("incorrect",0);

        correctAnswer.setText("Correct Answer  : "+String.valueOf(getCorrectAnswers));
        incorrectAnswer.setText("Wrong Answer  : "+String.valueOf(getInCorrectAnswers));

        startNewBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chk=1;
            //    startActivity(new Intent(QuizResults.this,quizFirst.class));
                finish();
            }
        });

    }
}