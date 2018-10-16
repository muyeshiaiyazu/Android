package com.example.phw.fitnessclubsystem;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import java.util.ArrayList;
import java.util.List;

public class Register extends AppCompatActivity implements View.OnClickListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);
        View decorView = getWindow().getDecorView();
        int option = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(option);
        Spinner registerStatus = (Spinner) findViewById ( R.id.register_spinner_status);
        List<String> list = new ArrayList<String>();
        list.add("教练");
        list.add("学员");
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,list);
        registerStatus.setAdapter(adapter);
        Button registerButton = (Button) findViewById ( R.id.register_button_sure);
        registerButton.setOnClickListener(this);          //触发事件
    }
    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.register_button_sure:
                Intent intent = new Intent(Register.this,Johnny_Main_Activity.class);
                startActivity(intent);
                finish();
                break;
        }
    }
}
