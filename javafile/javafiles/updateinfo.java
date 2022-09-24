package com.example.easylearn;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.easylearn.databinding.ActivityUpdateinfoBinding;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;


public class updateinfo extends AppCompatActivity {
    Button button,nextbtn;
    ActivityUpdateinfoBinding binding;
    DatabaseReference databaseReference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityUpdateinfoBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        button = findViewById(R.id.updateBtn);

        nextbtn = findViewById(R.id.nextpage);
        nextbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),activityone.class);
                startActivity(intent);
            }
        });

        binding.updateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userName = binding.userNameup.getText().toString();
                String FullName = binding.fullNameup.getText().toString();
                String Email = binding.emailup.getText().toString();
                String phone = binding.phoneup.getText().toString();
                String password= binding.passupdate.getText().toString();

                updatedata(userName,FullName,Email,phone,password);

                Intent intent = new Intent(getApplicationContext(),newProfile.class);
                startActivity(intent);

            }
        });





    }

    private void updatedata(String userName, String FullName, String Email, String phone,String password) {

        HashMap User = new HashMap();
        User.put("fullname",FullName);
        User.put("email",Email);
        User.put("phonenumber",phone);
        User.put("password",password);

        databaseReference = FirebaseDatabase.getInstance().getReference("datauser");
        databaseReference.child(userName).updateChildren(User).addOnCompleteListener(new OnCompleteListener() {
            @Override
            public void onComplete(@NonNull Task task) {
                if (task.isSuccessful()){

                    binding.userNameup.setText("");
                    binding.fullNameup.setText("");
                    binding.emailup.setText("");
                    binding.phoneup.setText("");
                    binding.passupdate.setText("");
                    Toast.makeText(updateinfo.this,"Successfully Updated",Toast.LENGTH_SHORT).show();

                }else {

                    Toast.makeText(updateinfo.this,"Failed to Update",Toast.LENGTH_SHORT).show();

                }

            }
        });


    }
    }
