package com.example.easylearn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {
   private Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_main);
       setContentView(R.layout.activity_start);
        button1=findViewById(R.id.startButton);
      getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

       Thread thread = new Thread(){
            public void run(){
                try {
                    sleep(3000);
                }
                catch(Exception e){
                    e.printStackTrace();
                }
                finally{
                    Intent intent = new Intent(MainActivity.this,dashboard.class);
                    startActivity(intent);

                }
            }
        };thread.start();


      /*  button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),activityone.class);
                startActivity(intent);
            }
        });
*/




    }


}
