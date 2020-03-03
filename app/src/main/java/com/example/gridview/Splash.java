package com.example.gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;

import java.util.Timer;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        SystemClock.sleep(TimeUnit.SECONDS.toMillis(2));
        finish();
        Intent mainActiivty = new Intent(this, MainActivity.class);
        startActivity(mainActiivty);
    }
}
