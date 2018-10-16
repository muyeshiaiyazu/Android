package com.example.phw.fitnessclubsystem;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Johnny_New_Project extends Fragment {
    View view;
    private Johnny_Course_Adapter adapter = null;
    private List list;
    private ListView listView;
    private ImageView add;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Classinit();
        view = inflater.inflate(R.layout.johnny_new_project, container, false);
        listView = (ListView) view.findViewById(R.id.list_course3);
        adapter = new Johnny_Course_Adapter(getActivity(), R.layout.johnny_course_list_item, list);
        listView.setAdapter(adapter);
        return view;
    }


    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        add = (ImageView)view.findViewById(R.id.img_add_course);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //进入新建课程界面
                Intent intent = new Intent(getActivity(),Add_Course.class);
                startActivity(intent);
                Activity activity = (Activity)getActivity();
                activity.finish();
            }
        });
    }
    public void Classinit() {//后续在这个函数里改变初始值
        list = new ArrayList<Course>();
        Course course1 = new Course();
        course1.setTitle("course1");
        course1.setContent("courseContent1");
        course1.setTime("每周一19:00，持续12周");
        course1.setInstructor("冉教练");
        course1.setPayment("¥2000");
        course1.setImgSrc(R.mipmap.head);
        list.add(course1);
        Course course2 = new Course();
        course2.setTitle("course2");
        course2.setContent("courseContent2");
        course2.setTime("每周二08:30");
        course2.setInstructor("薛教练");
        course2.setPayment("¥5000");
        course2.setImgSrc(R.mipmap.head);
        list.add(course2);
        Course course3 = new Course();
        course3.setTitle("course3");
        course3.setContent("courseContent3");
        course3.setTime("每周三20:30");
        course3.setInstructor("彭教练");
        course3.setPayment("¥1500");
        course3.setImgSrc(R.mipmap.head);
        list.add(course3);
        Course course4 = new Course();
        course4.setTitle("course4");
        course4.setContent("courseContent4");
        course4.setTime("每周四，周六10:30");
        course4.setInstructor("潘教练");
        course4.setPayment("¥8000");
        course4.setImgSrc(R.mipmap.head);
        list.add(course4);
    }
}
