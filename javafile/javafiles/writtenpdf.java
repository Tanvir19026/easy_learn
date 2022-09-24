package com.example.easylearn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class writtenpdf extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_writtenpdf);
        PDFView pdfView = findViewById(R.id.pdfview);
        pdfView.fromAsset("bcswrittenn.pdf").load();
    }
}