package com.myaquar.inventure.myaquareg.activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.myaquar.inventure.myaquareg.R;

import java.util.ArrayList;

public class Developer extends AppCompatActivity {
    ArrayList<module>mlist=new ArrayList<>();
    GridView list ;
    module m;
    public static String bosition=null ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainaa);
        list =findViewById(R.id.list);
       // mlist.add(new module(R.drawable.user,"des1"));


        Adapter listViewAdapter=new Adapter (getApplicationContext(),R.layout.listitem,  mlist);
        list.setAdapter(listViewAdapter);
list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        startActivity(new Intent(getApplicationContext(),show_detales_for_one_project.class));

    }
});

    }
}

