package com.example.easylearn;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import org.jitsi.meet.sdk.JitsiMeetActivity;
import org.jitsi.meet.sdk.JitsiMeetConferenceOptions;

import java.net.MalformedURLException;
import java.net.URL;

public class liveclass extends AppCompatActivity {

    Button demoBtn,join;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.liveclass);
        EditText editText = findViewById(R.id.codeBox);
        join = (Button) findViewById(R.id.joinBtn);

       join.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (editText.getText().toString().isEmpty()) {
                    Toast.makeText(liveclass.this, "Please enter a room id", Toast.LENGTH_SHORT).show();
                } else {
                    try {
                        JitsiMeetConferenceOptions options = new JitsiMeetConferenceOptions.Builder()
                                .setServerURL(new URL("https://meet.jit.si"))
                                .setRoom(editText.getText().toString())
                                .setAudioOnly(true)

                                .build();
                        JitsiMeetActivity.launch(liveclass.this, options);

                    } catch (MalformedURLException e) {
                        e.printStackTrace();
                    }
                }

            }
        });
    }
}
