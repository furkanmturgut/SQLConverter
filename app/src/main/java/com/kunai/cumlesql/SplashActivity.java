package com.kunai.cumlesql;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class SplashActivity extends AppCompatActivity {
    Button splashToHome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        splashToHome = findViewById(R.id.splashToHome);
        splashToHome.setOnClickListener(v -> startActivity(new Intent(getApplicationContext(),HomeActivity.class)));


    }
}