package com.fixelcloud.deathsecret.Activities;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.fixelcloud.deathsecret.DashboardActivity;
import com.fixelcloud.deathsecret.R;

public class SplashActivity extends RootActivity {
    long SPLASH_TIME_OUT = 3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
            startActivity(new Intent(SplashActivity.this, LoginActivity.class));
            }
        }, SPLASH_TIME_OUT);
    }
}
