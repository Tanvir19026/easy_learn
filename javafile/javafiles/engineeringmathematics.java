package com.example.easylearn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class engineeringmathematics extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_engineeringmathematics);
        PDFView pdfView = findViewById(R.id.pdfview);
        pdfView.fromAsset("engmath.pdf").load();
    }
}