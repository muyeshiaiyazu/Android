package com.example.phw.fitnessclubsystem;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Login extends AppCompatActivity implements View.OnClickListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        View decorView = getWindow().getDecorView();
        int option = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(option);
        Button loginButton = (Button) findViewById ( R.id.login_button_sure);
        loginButton.setOnClickListener(this);          //触发事件
    }
    @Override
    public void onClick(View v) {
        switch(v.getId()){
//            case R.id.login_button_sure:
//                Intent intent = new Intent(Login.this,Johnny_main_activity.class);
//                startActivity(intent);
//                break;
            case R.id.login_button_sure:
                Intent intent2 = new Intent(Login.this,Member_Main_Activity.class);
                startActivity(intent2);
                finish();
                break;
        }
    }
}
