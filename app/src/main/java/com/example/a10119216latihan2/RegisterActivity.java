package com.example.a10119216latihan2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;

import java.util.Objects;

public class RegisterActivity extends AppCompatActivity {
    Button regButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Objects.requireNonNull(getSupportActionBar()).hide();

        regButton = findViewById(R.id.register2_btn);

        regButton.setOnClickListener((v)->{
            Intent intent = new Intent(this, AlmostThereActivity.class);
            startActivity(intent);
        });

    }

}