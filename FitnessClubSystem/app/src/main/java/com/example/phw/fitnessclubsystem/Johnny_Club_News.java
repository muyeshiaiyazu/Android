package com.example.phw.fitnessclubsystem;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;

public class Johnny_Club_News extends Fragment {
    private Johnny_News_Adapter adapter = null;
    private List list;
    private ListView listView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Classinit();
        View view = inflater.inflate(R.layout.club_news, container, false);
        listView = (ListView) view.findViewById(R.id.list_news);
        adapter = new Johnny_News_Adapter(getActivity(), R.layout.news_list_item, list);
        listView.setAdapter(adapter);
        return view;
    }

    public void Classinit() {//后续在这个函数里改变初始值
        list = new ArrayList<News>();
        News news1 = new News();
        news1.setTitle("news1");
        news1.setContent("newsContent1");
        news1.setTime("07:30");
        news1.setImgSrc(R.mipmap.head);
        list.add(news1);
        News news2 = new News();
        news2.setTitle("news2");
        news2.setContent("newsContent2");
        news2.setTime("08:30");
        news2.setImgSrc(R.mipmap.head);
        list.add(news2);
        News news3 = new News();
        news3.setTitle("news3");
        news3.setContent("newsContent3");
        news3.setTime("09:30");
        news3.setImgSrc(R.mipmap.head);
        list.add(news3);
        News news4 = new News();
        news4.setTitle("news4");
        news4.setContent("newsContent4");
        news4.setTime("10:30");
        news4.setImgSrc(R.mipmap.head);
        list.add(news4);
        News news5 = new News();
        news5.setTitle("news5");
        news5.setContent("newsContent5");
        news5.setTime("11:30");
        news5.setImgSrc(R.mipmap.head);
        list.add(news5);
        News news6 = new News();
        news6.setTitle("news6");
        news6.setContent("newsContent6");
        news6.setTime("12:30");
        news6.setImgSrc(R.mipmap.head);
        list.add(news6);
        News news7 = new News();
        news7.setTitle("news7");
        news7.setContent("newsContent7");
        news7.setTime("2018/12/08/13:30");
        news7.setImgSrc(R.mipmap.head);
        list.add(news7);
        News news8 = new News();
        news8.setTitle("news8");
        news8.setContent("newsContent8");
        news8.setTime("14:30");
        news8.setImgSrc(R.mipmap.head);
        list.add(news8);
        News news9 = new News();
        news9.setTitle("news9");
        news9.setContent("newsContent9");
        news9.setTime("15:30");
        news9.setImgSrc(R.mipmap.head);
        list.add(news9);
    }
}

