package com.example.easylearn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class marketing extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marketing);
        PDFView pdfView = findViewById(R.id.pdfview);
        pdfView.fromAsset("marketing.pdf").load();
    }
}