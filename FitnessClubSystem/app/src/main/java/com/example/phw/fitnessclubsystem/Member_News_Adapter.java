package com.example.phw.fitnessclubsystem;

import java.util.List;

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

public class Member_News_Adapter extends ArrayAdapter {
    private int resource;

    public Member_News_Adapter(Context context, int resource, List objects) {
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
        final News news = (News) getItem(position);//获得实例
        if (convertView == null) {
            view = LayoutInflater.from(getContext()).inflate(resource, null);
            viewHolder = new ViewHolder();
            viewHolder.newsImage = (ImageView) view.findViewById(R.id.img_news);
            viewHolder.newsTitle = (TextView) view.findViewById(R.id.news_title);
            viewHolder.newsContent = (TextView) view.findViewById(R.id.news_content);
            viewHolder.newsTime = (TextView) view.findViewById(R.id.news_publish_time);
            viewHolder.newsRead = (ImageView) view.findViewById(R.id.img_news_read);
            view.setTag(viewHolder);
            viewHolder.newsImage.setImageResource(news.getImgSrc());
            viewHolder.newsTitle.setText(news.getTitle());
            viewHolder.newsContent.setText(news.getContent());
            viewHolder.newsTime.setText(news.getTime());
            viewHolder.newsRead.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {                        // TODO Auto-generated method stub
                    //进入新闻详细信息界面
                    Intent intent = new Intent(getContext(),Member_News.class);
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
        TextView newsContent;
        ImageView newsImage;
        TextView newsTitle;
        TextView newsTime;
        ImageView newsRead;
    }
}
