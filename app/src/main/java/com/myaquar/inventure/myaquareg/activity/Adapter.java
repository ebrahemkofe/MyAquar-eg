package com.myaquar.inventure.myaquareg.activity;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.myaquar.inventure.myaquareg.R;

import java.util.ArrayList;

public class Adapter extends ArrayAdapter {
    ArrayList <module>mList;
    // constructor 2bl el2a5ir
    public Adapter(@NonNull Context context, int resource, @NonNull ArrayList objects) {
        super(context, resource, objects);
        mList=objects;
    }


    // ms2ola trsm el module
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater=(LayoutInflater)getContext().
                getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view= layoutInflater.inflate(R.layout.listitem,parent,false);
        TextView title=view.findViewById(R.id.txt);
        ImageView imageView=view.findViewById(R.id.image);
        title.setText(mList.get(position).getName());
        imageView.setImageResource(mList.get(position).getImg());
        return view;
        //return super.getView(position, convertView, parent);
    }
    @Override
    public int getCount() {
        return super.getCount();
    }
}

