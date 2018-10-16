package com.example.phw.fitnessclubsystem;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class Add_Course extends AppCompatActivity implements View.OnClickListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.johnny_add_course);
        View decorView = getWindow().getDecorView();
        int option = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(option);
        Button addCourse = (Button) findViewById ( R.id.button_add_course);
        ImageView back = (ImageView) findViewById(R.id.img_back);
        addCourse.setOnClickListener(this);          //触发事件
        back.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.button_add_course:
                Toast.makeText(Add_Course.this, "新建成功!", Toast.LENGTH_LONG).show();
                break;
            case R.id.img_back:
                Intent intent = new Intent(Add_Course.this,Johnny_Main_Activity.class);
                intent.putExtra("flag", 2);
                startActivity(intent);
                finish();
                break;
        }
    }
}
