package com.example.donghyun.unist_alerts;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Donghyun on 2015-09-08.
 *//*
public class BBS extends Fragment {
    /*@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bbs);
    }*/
/*
    public static BBS newInstance() {
        BBS fragment = new BBS();

        return fragment;
    }
}*/
public class BBS extends Fragment {

    public BBS newInstance() {
        BBS bbs = new BBS();
        return bbs;
    }


    public BBS() {

// Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

// Inflate the layout for this fragment
        return inflater.inflate(R.layout.bbs, container, false);
    }
}