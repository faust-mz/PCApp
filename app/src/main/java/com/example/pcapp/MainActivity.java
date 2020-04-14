package com.example.pcapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private static final String LOG_TAG =
            MainActivity.class.getSimpleName(); //information for debugger--> name of APP
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("test one0one debug", "Hello Debugger!"); //Salute debugger
    }





    public void launchSecondActivity(View view) {
        Intent intent= new Intent (this, Resultado.class);
        startActivity(intent);
    }
}
