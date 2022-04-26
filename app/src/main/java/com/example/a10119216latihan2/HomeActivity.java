package com.example.a10119216latihan2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.Objects;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Objects.requireNonNull(getSupportActionBar()).hide();
    }
}

//NIM    : 10119216-->
//Nama   : Muhammad Syarifuddin Rahiman-->
//Kelas  : IF-6-->
//Tanggal Pengerjaan : 26-04-2022-->