package com.example.a1795526.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    String tag  = "Message : ";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(tag, "This is from onCreate()");
        }

    @Override

    protected void onResume()  {
        super.onResume();
        Log.d(tag, "This is from onResume()");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(tag, "This is from onStart ()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(tag, "This is from onStop ()");

    }


    }


