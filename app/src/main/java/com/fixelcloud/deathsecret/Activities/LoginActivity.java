package com.fixelcloud.deathsecret.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import com.fixelcloud.deathsecret.R;

public class LoginActivity extends RootActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        //hideKeyboardB(this);

    }



    public void signUp(View view) {
        startActivity(new Intent(this, SignUpActivity.class));
    }
}
