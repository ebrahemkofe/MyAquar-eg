package com.myaquar.inventure.myaquareg.fargment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.myaquar.inventure.myaquareg.R;
import com.myaquar.inventure.myaquareg.adapter.ImageAdapter;

public class project_vell extends Fragment {

    public project_vell() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View v= inflater.inflate(R.layout.fragment_project_vell, container, false);

        int[] Images = new int[]{

                R.drawable.comp7,

                R.drawable.comp9,
                R.drawable.comp10,
                R.drawable.comp11,
                R.drawable.comp12,
                R.drawable.comp13,
                R.drawable.comp3,
                R.drawable.comp4,
                R.drawable.comp5,
                R.drawable.comp6
        };
        String [] des = new String[] {"aaaaaaaa","aaaaaa","5","4","3","2","1","8","7","6"};



        ViewPager viewPager=v.findViewById(R.id.ViewPager_vell);
        ImageAdapter adapter= new ImageAdapter(getContext(),Images);
        viewPager.setAdapter(adapter);
       return  v;
    }

}
