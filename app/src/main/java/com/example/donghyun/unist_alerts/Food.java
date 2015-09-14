package com.example.donghyun.unist_alerts;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by Donghyun on 2015-09-08.
 */
public class Food extends Fragment {

    public Food newInstance(){
        Food food = new Food();
        return food;
    }


    public Food() {

// Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

// Inflate the layout for this fragment
        return inflater.inflate(R.layout.food, container, false);
    }
/*
    private Button btn;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.food, container, false);
    }

    private void findallViews(){
        btn = (Button)getView().findViewById(R.id.button);//findViewById(R.id.button);
    }

    private void setAllListeners(){
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
                    public void onClick(View v){
            Toast.makeText(getActivity(),"WoW",Toast.LENGTH_LONG).show();
        }
        });
    }*/
}
