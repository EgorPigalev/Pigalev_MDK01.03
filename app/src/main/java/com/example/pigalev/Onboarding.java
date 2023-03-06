package com.example.pigalev;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Onboarding extends AppCompatActivity {

    final static String userVariableKey = "USER_VARIABLE";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboarding);
    }
    // получение ранее сохраненного состояния


    public void nextRegistrarion(View v)
    {
        startActivity(new Intent(this, Register.class));
    }

    public void nextLogin(View v)
    {
        startActivity(new Intent(this, Login.class));
    }
}