package com.myaquar.inventure.myaquareg.fargment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.myaquar.inventure.myaquareg.R;
import com.myaquar.inventure.myaquareg.adapter.ImageAdapter;

public class project_omarat extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
      View v= inflater.inflate(R.layout.fragment_project_omarat, container, false);


        int[] Images = new int[]{

        };
        ViewPager viewPager=v.findViewById(R.id.ViewPager_omarat);
        ImageAdapter adapter= new ImageAdapter(getContext(),Images);
        viewPager.setAdapter(adapter);
      return v;
    }

public project_omarat(){}

}
