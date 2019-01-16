package com.myaquar.inventure.myaquareg.activity;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import com.myaquar.inventure.myaquareg.R;
import com.myaquar.inventure.myaquareg.fargment.project_makatb;
import com.myaquar.inventure.myaquareg.fargment.project_omarat;
import com.myaquar.inventure.myaquareg.fargment.project_sacnee;
import com.myaquar.inventure.myaquareg.fargment.project_tbee;
import com.myaquar.inventure.myaquareg.fargment.project_vell;

public class show_detales_for_one_project extends AppCompatActivity {
FrameLayout frameLayout;
Button tbee,omarat,sacnee,vell,makatb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_detales_for_one_project);
        frameLayout=findViewById(R.id.frame);
        tbee=(Button)findViewById(R.id.tbee_id);
        omarat=(Button)findViewById(R.id.omarat_id);
        sacnee=(Button)findViewById(R.id.sacnee_id);
        vell=(Button)findViewById(R.id.vell_id);
        makatb=(Button)findViewById(R.id.mkateb_id);


        Fragment f =new project_makatb();
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.frame,f,"p_m");
        ft.commit();

        tbee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Fragment f =new project_tbee();

                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();

                ft.replace(R.id.frame,f,"fra");

                ft.commit();


            }
        });

        omarat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment f =new project_omarat();

                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();

                ft.replace(R.id.frame,f,"fra");

                ft.commit();


            }
        });

sacnee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment f =new project_sacnee();

                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();

                ft.replace(R.id.frame,f,"fra");

                ft.commit();


            }
        });
vell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment f =new project_vell();

                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();

                ft.replace(R.id.frame,f,"fra");

                ft.commit();


            }
        });
makatb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment f =new project_makatb();

                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();

                ft.replace(R.id.frame,f,"fra");

                ft.commit();


            }
        });

    }



}
