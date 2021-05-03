package com.example.monitory;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

//Tanggal : 03 Mei 2021
//NIM     : 10118063
//Nama    : Naufal Asha
//Kelas   : IF-2

public class FormActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form_activity);
    }

    public static final String INPUT_NICKNAME = "com.example.monitory.INPUT_NICKNAME";

    public void actNext(View view) {
        EditText nickName = (EditText) findViewById(R.id.nickname);

        if(nickName.length() < 3) {
            Toast.makeText(this, "Nama panggilan harus diisi", Toast.LENGTH_SHORT).show();
            return;
        }

        Intent intent = new Intent(this, com.example.monitory.FinishActivity.class);
        intent.putExtra(INPUT_NICKNAME, nickName.getText().toString());
        startActivity(intent);
    }

    public void toFinish(View view) {
        EditText nickName = (EditText) findViewById(R.id.nickname);

        if(nickName.length() < 3) {
            Toast.makeText(this, "Nama panggilan harus diisi", Toast.LENGTH_SHORT).show();
            return;
        }

        Intent intent = new Intent(this, com.example.monitory.FinishActivity.class);
        intent.putExtra(INPUT_NICKNAME, nickName.getText().toString());
        startActivity(intent);
    }
}
