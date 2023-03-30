package com.cookandroid.termproject;


import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;

@SuppressWarnings("deprecation")

public class SecondMainActivity extends TabActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_main);

        //첫 번째 탭
        TabHost tabhost = getTabHost();
        TabHost.TabSpec spec;
        Intent intent = new Intent().setClass(this, IntroActivity.class);

        spec = tabhost.newTabSpec("intro").setIndicator("소개").setContent(intent);
        tabhost.addTab(spec);

        //두 번째 탭
        intent = new Intent().setClass(this, PosterActivity.class);
        spec = tabhost.newTabSpec("poster").setIndicator("포스터").setContent(intent);
        tabhost.addTab(spec);

        //세 번째 탭
        intent = new Intent().setClass(this, ReviewActivity.class);
        spec = tabhost.newTabSpec("review").setIndicator("평가/리뷰").setContent(intent);
        tabhost.addTab(spec);


        //네 번째 탭
        intent = new Intent().setClass(this, AddActivity.class);
        spec = tabhost.newTabSpec("add").setIndicator("부가정보").setContent(intent);
        tabhost.addTab(spec);



    }



}