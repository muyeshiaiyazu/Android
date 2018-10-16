package com.example.phw.fitnessclubsystem;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.List;

public class Member_Main_Activity extends AppCompatActivity implements View.OnClickListener{
    //声明ViewPager
    private ViewPager mViewPager;
    //适配器
    private FragmentPagerAdapter mAdapter;
    //装载Fragment的集合
    private List<Fragment> mFragments;

    //四个Tab对应的布局
    private LinearLayout mTabNews;
    private LinearLayout mTabProject;
    private LinearLayout mTabMine;

    //四个Tab对应的ImageButton
    private ImageButton mImgNews;
    private ImageButton mImgProject;
    private ImageButton mImgMine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.member_main);
        View decorView = getWindow().getDecorView();
        int option = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(option);
        initViews();//初始化控件
        initEvents();//初始化事件
        initDatas();//初始化数据
        Intent intent = getIntent();
        int id = intent.getIntExtra("flag", 0);
        if (id > 0) {
            //fragment的切换采用的是viewpage的形式,然后1是指底部第2个Fragment
            mViewPager.setCurrentItem(1);
        }
    }

    private void initDatas() {
        mFragments = new ArrayList<>();
        //将四个Fragment加入集合中
        mFragments.add(new Member_Club_News());
        mFragments.add(new Member_New_Project());
        mFragments.add(new Member_Mine());
        //初始化适配器
        mAdapter = new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {//从集合中获取对应位置的Fragment
                return mFragments.get(position);
            }

            @Override
            public int getCount() {//获取集合中Fragment的总数
                return mFragments.size();
            }

        };
        //不要忘记设置ViewPager的适配器
        mViewPager.setAdapter(mAdapter);
        //设置ViewPager的切换监听
        mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            //页面滚动事件
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            //页面选中事件
            @Override
            public void onPageSelected(int position) {
                //设置position对应的集合中的Fragment
                mViewPager.setCurrentItem(position);
                resetImgs();
                selectTab(position);
            }

            @Override
            //页面滚动状态改变事件
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    private void initEvents() {
        //设置三个Tab的点击事件
        mTabNews.setOnClickListener(this);
        mTabProject.setOnClickListener(this);
        mTabMine.setOnClickListener(this);
    }

    //初始化控件
    private void initViews() {
        mViewPager = (ViewPager) findViewById(R.id.id_viewpager);

        mTabNews = (LinearLayout) findViewById(R.id.id_tab_news);
        mTabProject = (LinearLayout) findViewById(R.id.id_tab_project);
        mTabMine = (LinearLayout) findViewById(R.id.id_tab_mine);

        mImgNews = (ImageButton) findViewById(R.id.id_tab_news_img);
        mImgProject = (ImageButton) findViewById(R.id.id_tab_project_img);
        mImgMine = (ImageButton) findViewById(R.id.id_tab_mine_img);
    }

    @Override
    public void onClick(View v) {
        //先将四个ImageButton置为灰色
        resetImgs();

        //根据点击的Tab切换不同的页面及设置对应的ImageButton为绿色
        switch (v.getId()) {
            case R.id.id_tab_news:
                selectTab(0);
                break;
            case R.id.id_tab_project:
                selectTab(1);
                break;
            case R.id.id_tab_mine:
                selectTab(2);
                break;
        }
    }

    private void selectTab(int i) {
        //根据点击的Tab设置对应的ImageButton为蓝色
        switch (i) {
            case 0:
                mImgNews.setImageResource(R.mipmap.tab_news_blue);
                break;
            case 1:
                mImgProject.setImageResource(R.mipmap.tab_project_blue);
                break;
            case 2:
                mImgMine.setImageResource(R.mipmap.tab_mine_blue);
                break;
        }
        //设置当前点击的Tab所对应的页面
        mViewPager.setCurrentItem(i);
    }

    //将四个ImageButton设置为灰色
    private void resetImgs() {
        mImgNews.setImageResource(R.mipmap.tab_news_black);
        mImgProject.setImageResource(R.mipmap.tab_project_black);
        mImgMine.setImageResource(R.mipmap.tab_mine_black);
    }
}

