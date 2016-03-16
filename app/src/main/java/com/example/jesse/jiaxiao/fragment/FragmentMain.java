package com.example.jesse.jiaxiao.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.jesse.jiaxiao.R;

/**
 * Created by Jesse on 2016/3/16.
 */
public class FragmentMain extends Fragment {

    private View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_main, null);
        return view;
    }
}
