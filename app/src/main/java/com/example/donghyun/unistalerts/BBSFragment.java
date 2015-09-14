package com.example.donghyun.unistalerts;

import android.os.Bundle;
import android.widget.ListView;

/**
 * Created by Donghyun on 2015-08-05.
 */
public class BBSFragment extends MainActivity{
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_bbs);

        listView = (ListView)findViewById(R.id.lv_bbs);
        listview.setAdapter()
    }
}
