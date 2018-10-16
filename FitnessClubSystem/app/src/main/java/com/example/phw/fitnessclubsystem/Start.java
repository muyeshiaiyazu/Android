package com.example.phw.fitnessclubsystem;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Start extends AppCompatActivity implements View.OnClickListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start);
        View decorView = getWindow().getDecorView();
        int option = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(option);
        Button loginButton = (Button) findViewById ( R.id.start_button_login);
        loginButton.setOnClickListener(this);          //触发事件
        Button registerButton = (Button) findViewById ( R.id.start_button_register);
        registerButton.setOnClickListener(this);          //触发事件
    }
    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.start_button_login:
                Intent intent = new Intent(Start.this,Login.class);
                startActivity(intent);
                break;
            case R.id.start_button_register:
                Intent intent2 = new Intent(Start.this,Register.class);
                startActivity(intent2);
                break;
        }
    }
}
