package com.example.easylearn;

import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;


public class newProfile extends AppCompatActivity {

    Button nextPage;
    TextView tvFirstName, tvLastName, tvEmail,tvphone,registerSuccess;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_profile);

        // Initialize Firebase Auth
        FirebaseAuth auth = FirebaseAuth.getInstance();
        FirebaseUser currentUser = auth.getCurrentUser();
        if (currentUser == null) {
            Intent intent = new Intent(this, login.class);
            startActivity(intent);
            return;
        }

        nextPage =findViewById(R.id.btnnextpages);
        nextPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),activityone.class);
                startActivity(intent);
            }
        });


        tvFirstName = findViewById(R.id.tvFirstName);
        tvLastName = findViewById(R.id.tvLastName);
        tvEmail = findViewById(R.id.tvEmail);
        tvphone = findViewById(R.id.tvphone);
        registerSuccess = findViewById(R.id.tvregister);

        Button btnLogout = findViewById(R.id.btnLogout);
        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                logoutUser();
            }
        });

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference reference = database.getReference("users").child(currentUser.getUid());
        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                User user = snapshot.getValue(User.class);
                if (user != null) {

                    tvFirstName.setText("User Name : "+user.userName);
                    tvLastName.setText("Full Name : "+user.fullName);
                    tvEmail.setText("Email: " + user.email);
                    tvphone.setText("phone: "+user.phone);
                    registerSuccess.setText(user.userName +" is successfully enrolled. ");

                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
            }
        });


    }

    private void logoutUser() {

        FirebaseAuth.getInstance().signOut();

        Toast.makeText(this, "Logout Successfully", Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(this, dashboard.class);
        startActivity(intent);

    }
}