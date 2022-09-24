package com.example.easylearn;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;


public class signup extends AppCompatActivity {

    private FirebaseAuth mAuth;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.signup);
            // Initialize Firebase Auth
            mAuth = FirebaseAuth.getInstance();
            if (mAuth.getCurrentUser() != null) {
                finish();
                return;
            }

            Button btnRegister = findViewById(R.id.btnRegister);
            btnRegister.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    registerUser();
                }
            });

            TextView textViewSwitchToLogin = findViewById(R.id.tvSwitchToLogin);
            textViewSwitchToLogin.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    switchToLogin();
                }
            });
        }

        private void registerUser() {
            EditText etFirstName = findViewById(R.id.etFirstName);
            EditText etLastName = findViewById(R.id.etLastName);
            EditText etRegisterEmail = findViewById(R.id.etRegisterEmail);
            EditText etRegisterPassword = findViewById(R.id.etRegisterPassword);
            EditText etphone = findViewById(R.id.phoneNumber);

            String userName = etFirstName.getText().toString();
            String fullName = etLastName.getText().toString();
            String email = etRegisterEmail.getText().toString();
            String password = etRegisterPassword.getText().toString();
            String phone = etphone.getText().toString();

            if (userName.isEmpty()  || fullName.isEmpty() || email.isEmpty() && email.matches("^[\\w!#$%&’*+/=?`{|}~^-]+(?:\\.[\\w!#$%&’*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$\"")
                    ||password.isEmpty()|| phone.isEmpty() && phone.matches("^\\d{11}$")) {
                Toast.makeText(this, "Please fill all fields", Toast.LENGTH_LONG).show();
                return;
            }

            else if( password.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$"))
            {
                mAuth.createUserWithEmailAndPassword(email, password)
                        .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if (task.isSuccessful()) {
                                    User user = new User(userName, fullName, email,phone);
                                    FirebaseDatabase.getInstance().getReference("users")
                                            .child(FirebaseAuth.getInstance().getCurrentUser().getUid())
                                            .setValue(user).addOnCompleteListener(new OnCompleteListener<Void>() {
                                                @Override
                                                public void onComplete(@NonNull Task<Void> task) {
                                                    showMainActivity();
                                                }
                                            });
                                } else {
                                    Toast.makeText(signup.this, "Authentication failed.",
                                            Toast.LENGTH_LONG).show();
                                }
                            }
                        });
            }

        }

        private void showMainActivity() {
            Intent intent = new Intent(this, newProfile.class);
            startActivity(intent);

        }

        private void switchToLogin() {
            Intent intent = new Intent(this, login.class);
            startActivity(intent);

        }
    }








