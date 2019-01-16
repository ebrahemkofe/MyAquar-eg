package com.myaquar.inventure.myaquareg.fargment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.myaquar.inventure.myaquareg.R;
import com.myaquar.inventure.myaquareg.adapter.ImageAdapter;
import com.myaquar.inventure.myaquareg.adapter.new_adapter_text_imag;

public class project_omarat extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
      View v= inflater.inflate(R.layout.fragment_project_omarat, container, false);


        int[] Images = new int[]{
                R.drawable.comp1,R.drawable.comp11,R.drawable.comp12,R.drawable.comp13,R.drawable.comp6
        };
        String [] text_image= new String[]{"one","two","three","four","five"};
        ViewPager viewPager=v.findViewById(R.id.ViewPager_omarat);
        new_adapter_text_imag adapter= new new_adapter_text_imag(getContext(),Images,text_image);        viewPager.setAdapter(adapter);
      return v;
    }

public project_omarat(){}

}
