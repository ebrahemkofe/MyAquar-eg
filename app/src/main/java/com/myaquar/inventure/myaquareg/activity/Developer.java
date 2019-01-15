package com.myaquar.inventure.myaquareg.activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import com.myaquar.inventure.myaquareg.R;

import java.util.ArrayList;

public class Developer extends AppCompatActivity {
    ArrayList<module>mlist=new ArrayList<>();
    GridView list ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainaa);
        list =findViewById(R.id.list);
        mlist.add(new module(R.drawable.user,"des1"));
        mlist.add(new module(R.drawable.user,"des1"));
        mlist.add(new module(R.drawable.user,"des1"));
        mlist.add(new module(R.drawable.user,"des1"));
        mlist.add(new module(R.drawable.user,"des1"));
        mlist.add(new module(R.drawable.user,"des1"));
        mlist.add(new module(R.drawable.user,"des1"));

        Adapter listViewAdapter=new Adapter (getApplicationContext(),R.layout.listitem,  mlist);
        list.setAdapter(listViewAdapter);


    }
}

