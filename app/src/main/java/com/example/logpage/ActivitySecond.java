package com.example.logpage;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.github.barteksc.pdfviewer.PDFView;

public class ActivitySecond extends AppCompatActivity {

    PDFView mpdf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // Step 1: pdf viewer to open files
        mpdf = (PDFView) findViewById(R.id.pdf);
        mpdf.fromAsset("regis.pdf").load();
    }
}
