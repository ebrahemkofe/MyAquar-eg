package com.myaquar.inventure.myaquareg.fargment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.myaquar.inventure.myaquareg.adapter.new_adapter_text_imag;
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
R.drawable.comp1,R.drawable.comp11,R.drawable.comp12,R.drawable.comp13,R.drawable.comp6
        };
        String [] text_image= new String[]{"one","two","three","four","five"};

        ViewPager viewPager=v.findViewById(R.id.ViewPager_makteb);
     new_adapter_text_imag    adapter= new new_adapter_text_imag(getContext(),Images,text_image);
        viewPager.setAdapter(adapter);

       return v;
    }


    public project_makatb(){}
}
