package com.example.phw.fitnessclubsystem;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class Member_Course_Info extends AppCompatActivity implements View.OnClickListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.member_course_info);
        View decorView = getWindow().getDecorView();
        int option = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(option);
        Button enterCourse = (Button) findViewById ( R.id.button_enter_course);
        ImageView back = (ImageView) findViewById(R.id.img_back);
        enterCourse.setOnClickListener(this);          //触发事件
        back.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.button_enter_course:
                Toast.makeText(Member_Course_Info.this, "加入成功!", Toast.LENGTH_LONG).show();
                break;
            case R.id.img_back:
                Intent intent = new Intent(Member_Course_Info.this,Member_Main_Activity.class);
                intent.putExtra("flag", 2);
                startActivity(intent);
                finish();
                break;
        }
    }
}