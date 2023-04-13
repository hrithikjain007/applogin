package com.example.myapplication;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("message","oncreate");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("message","ondestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("message","onpause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("message","onRestart ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("message", "onResume: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("message", "onStop: ");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("message", "onStart: ");
    }
}