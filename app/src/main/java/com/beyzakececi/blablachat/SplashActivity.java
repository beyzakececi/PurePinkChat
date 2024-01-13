package com.beyzakececi.blablachat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.beyzakececi.blablachat.activities.SignInActivity;
import com.beyzakececi.blablachat.databinding.ActivitySplashBinding;

public class SplashActivity extends AppCompatActivity {

    // This is the first activity that is shown when the app is opened.
    // It is used to show the logo of the app.

    // This activity is not used in the app. It is just for the logo.
    //binding
    private ActivitySplashBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySplashBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
               Intent intent= new Intent(SplashActivity.this, SignInActivity.class);
                startActivity(intent);
                finish();
            }
        },3000);

    }
}