package com.example.a10119216latihan2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import java.util.Objects;

public class AlmostThereActivity extends AppCompatActivity {
    Button verifyBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_almost_there);
        Objects.requireNonNull(getSupportActionBar()).hide();

        verifyBtn = findViewById(R.id.verify);

        verifyBtn.setOnClickListener((v)->{
            Intent intent = new Intent(this, VerifyActivity.class);
            startActivity(intent);
        });

    }
}