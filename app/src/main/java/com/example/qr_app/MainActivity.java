package com.example.qr_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    EditText qrvalue;
    Button generateBtn, scanBtn;
    ImageView qrImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        qrvalue = findViewById(R.id.qrInput);
        generateBtn = findViewById(R.id.generateBtn);
        scanBtn = findViewById(R.id.scanBtn);
        qrImage = findViewById(R.id.QRplaceholder);



    }
}