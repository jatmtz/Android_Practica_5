package com.example.android_practica_51;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.os.CountDownTimer;


public class MainActivity extends AppCompatActivity {
    TextView mTextField;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextField = (TextView) findViewById(R.id.mTextField);

        CountDownTimer CountDownTimer = new CountDownTimer(5000,1000) {
            @Override
            public void onTick(long milliUntilFinish) {
                mTextField.setText("" + milliUntilFinish /1000);
            }
            @Override
            public void onFinish() {

                    Intent i = new Intent(MainActivity.this, Principal.class);
                    startActivity(i);
                    finish();

            }

        }.start();



    }



}