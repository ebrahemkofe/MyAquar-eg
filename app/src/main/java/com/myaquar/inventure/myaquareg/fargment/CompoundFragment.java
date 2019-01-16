package com.myaquar.inventure.myaquareg.fargment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.myaquar.inventure.myaquareg.adapter.ImageAdapter;
import com.myaquar.inventure.myaquareg.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class CompoundFragment extends Fragment {


    public CompoundFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
         View view =  inflater.inflate(R.layout.fragment_compound, container, false);

        int[] Images = new int[]{

                R.drawable.in6,

        };


        ViewPager viewPager=view.findViewById(R.id.ViewPager_CompFrag);
        ImageAdapter adapter= new ImageAdapter(getContext(),Images);
        viewPager.setAdapter(adapter);

         return view;
    }

}
