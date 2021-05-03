package com.example.monitory;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

//Tanggal : 03 Mei 2021
//NIM     : 10118063
//Nama    : Naufal Asha
//Kelas   : IF-2

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toVerif(View view) {
        Intent intent = new Intent(this, com.example.monitory.VerifyActivity.class);
        startActivity(intent);
    }
}