package com.example.dummyproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.v("Oncreate", "OnCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v("onStart", "onStart");
    }



    @Override
    protected void onResume() {
        super.onResume();
        Log.v("onResume", "onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.v("onRestart", "onRestart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v("onPause", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v("onStop", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v("onDestroy", "onDestroy");
    }







}
