package com.example.jesse.jiaxiao.activity;

import android.os.Bundle;

import com.example.jesse.jiaxiao.fragment.FragmentMain;
import com.example.jesse.jiaxiao.fragment.FragmentMenu;
import com.zhuoxin.slidingmenulib.SlidingMenuActivity;

public class MainActivity extends SlidingMenuActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FragmentMain fragmentMain = new FragmentMain();
        FragmentMenu fragmentMenu = new FragmentMenu();
        initFragments(fragmentMain, fragmentMenu);

    }
}
