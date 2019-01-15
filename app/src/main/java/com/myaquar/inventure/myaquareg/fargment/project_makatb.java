package com.myaquar.inventure.myaquareg.fargment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.myaquar.inventure.myaquareg.R;
import com.myaquar.inventure.myaquareg.adapter.ImageAdapter;

public class project_makatb extends Fragment {

    LinearLayout gallery;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View v= inflater.inflate(R.layout.fragment_project_makatb, container, false);

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
        ViewPager viewPager=v.findViewById(R.id.ViewPager_makteb);
        ImageAdapter adapter= new ImageAdapter(getContext(),Images);
        viewPager.setAdapter(adapter);

       return v;
    }


    public project_makatb(){}
}
