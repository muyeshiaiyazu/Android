package com.example.phw.fitnessclubsystem;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.List;

public class Johnny_Course_Adapter extends ArrayAdapter {
    private int resource;

    public Johnny_Course_Adapter(Context context, int resource, List objects) {
        super(context, resource, objects);
        // TODO Auto-generated constructor stub
        this.resource = resource;//resource为listView的每个子项的布局id
    }

    //getView为listView的每个子项的布局设置内容
    //convertView用于将之前加载好的布局进行缓存
    //设置一个viewHolder对控件进行缓存
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view;
        ViewHolder viewHolder;
        final Course course = (Course) getItem(position);//获得实例
        if (convertView == null) {
            view = LayoutInflater.from(getContext()).inflate(resource, null);
            viewHolder = new ViewHolder();
            viewHolder.courseImage = (ImageView) view.findViewById(R.id.img_member_course);
            viewHolder.courseTitle = (TextView) view.findViewById(R.id.member_course_title);
            viewHolder.coursePayment = (TextView) view.findViewById(R.id.member_course_payment);
            viewHolder.courseRead = (ImageView) view.findViewById(R.id.img_course_read);
            view.setTag(viewHolder);
            viewHolder.courseImage.setImageResource(course.getImgSrc());
            viewHolder.courseTitle.setText(course.getTitle());
            viewHolder.coursePayment.setText(course.getPayment());
            viewHolder.courseRead.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {                        // TODO Auto-generated method stub
                    //进入课程详情界面
                    Intent intent = new Intent(getContext(),Johnny_Course_Info.class);
                    getContext().startActivity(intent);
                    Activity activity = (Activity)getContext();
                    activity.finish();
                }
            });
        } else {
            view = convertView;
            viewHolder = (ViewHolder) view.getTag();
        }
        return view;
    }

    class ViewHolder {
        ImageView courseImage;
        TextView courseTitle;
        ImageView courseRead;
        TextView coursePayment;
    }
}
