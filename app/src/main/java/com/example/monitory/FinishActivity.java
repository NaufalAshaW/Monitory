package com.example.monitory;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

//Tanggal : 03 Mei 2021
//NIM     : 10118063
//Nama    : Naufal Asha
//Kelas   : IF-2

public class FinishActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.finish_activity);

        String nickName = getIntent().getStringExtra(FormActivity.INPUT_NICKNAME);

        String text = getString(R.string.finish_text).toString();
        TextView finishTextMessage = (TextView)findViewById(R.id.finished);

        finishTextMessage.setText(String.format(text, nickName).toString());
    }

    public void endApp(View view) {
        finishAffinity();
        finishAndRemoveTask();
    }

}
