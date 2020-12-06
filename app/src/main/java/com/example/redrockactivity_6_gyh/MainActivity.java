package com.example.redrockactivity_6_gyh;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private List<View> list = new ArrayList<>();
    private List<String> mTitle = new ArrayList<>();
    public RVAdapter rvAdapter = new RVAdapter(list,mTitle);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);
        viewPager = findViewById(R.id.vp_demo);

        mTitle.add("页面一");
        mTitle.add("页面二");
        mTitle.add("页面三");
        list.add(LayoutInflater.from(this).inflate(
                R.layout.fragment_blank1,null,false));
        list.add(LayoutInflater.from(this).inflate(
                R.layout.fragment_blank2,null,false));
        list.add(LayoutInflater.from(this).inflate(
                R.layout.fragment_blank3,null,false));
        viewPager.setAdapter(rvAdapter);
    }
}