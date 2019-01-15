package com.myaquar.inventure.myaquareg.activity;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.myaquar.inventure.myaquareg.fargment.BlankFragment;
import com.myaquar.inventure.myaquareg.fargment.CompoundFragment;
import com.myaquar.inventure.myaquareg.fargment.OutsideFragment;
import com.myaquar.inventure.myaquareg.R;

public class MainActivity extends AppCompatActivity {

   long backPressedTime ;
    
    private Button inside , outside , Compound ;
    private FrameLayout frameLayout;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.structure:
                    Intent intent = new Intent(getApplicationContext(), struct_activity.class);
                    startActivity(intent);

                    return true;
                case R.id.location:
                    String geoUri = "http://maps.google.com/maps?q=loc:" + 30.145305 + "," + 31.630784 + " ("+"Shourok"+")";
                    Intent map = new Intent(Intent.ACTION_VIEW, Uri.parse(geoUri));
                    startActivity(map);
                    return true;
                case R.id.contact_us:
                    Intent contact = new Intent(Intent.ACTION_DIAL);
                    contact.setData(Uri.parse("tel:01095488883"));
                    startActivity(contact);
                    return true;
                case R.id.about_us :
                    Intent intent2 = new Intent(getApplicationContext(), AboutUs_Activity.class);
                    startActivity(intent2);
                return true ;
                case R.id.logout :

                    return true ;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        frameLayout=findViewById(R.id.frame);
        inside = findViewById(R.id.inside);
        Compound = findViewById(R.id.Compound);
        outside = findViewById(R.id.outside);




        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);



         StartingActivity();


        inside.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Fragment f =new BlankFragment();
                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                ft.replace(R.id.frame,f,"fra");
                ft.commit();

                inside.setBackgroundResource(R.drawable.backgroundonclick);
                Compound.setBackgroundResource(R.drawable.back_button);
                outside.setBackgroundResource(R.drawable.back_button);

                inside.setTextColor(Color.parseColor("#ffffff"));
                Compound.setTextColor(Color.parseColor("#990707"));
                outside.setTextColor(Color.parseColor("#990707"));


            }
        });
        Compound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Compound.setBackgroundResource(R.drawable.backgroundonclick);
                inside.setBackgroundResource(R.drawable.back_button);
                outside.setBackgroundResource(R.drawable.back_button);

                Compound.setTextColor(Color.parseColor("#ffffff"));
                inside.setTextColor(Color.parseColor("#990707"));
                outside.setTextColor(Color.parseColor("#990707"));





                Fragment f =new CompoundFragment();

                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();

                ft.replace(R.id.frame,f,"Compound");

                ft.commit();
            }
        });
        outside.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Fragment f =new OutsideFragment();
                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                ft.replace(R.id.frame,f,"outside");
                ft.commit();

                outside.setBackgroundResource(R.drawable.backgroundonclick);
                inside.setBackgroundResource(R.drawable.back_button);
                Compound.setBackgroundResource(R.drawable.back_button);

                outside.setTextColor(Color.parseColor("#ffffff"));
                inside.setTextColor(Color.parseColor("#990707"));
                Compound.setTextColor(Color.parseColor("#990707"));
            }
        });


    }
    private void StartingActivity(){


        Fragment f =new BlankFragment();
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.frame,f,"fra");
        ft.commit();

        inside.setBackgroundResource(R.drawable.backgroundonclick);
        Compound.setBackgroundResource(R.drawable.back_button);
        outside.setBackgroundResource(R.drawable.back_button);

        inside.setTextColor(Color.parseColor("#ffffff"));
        Compound.setTextColor(Color.parseColor("#990707"));
        outside.setTextColor(Color.parseColor("#990707"));
    }
    @Override
    public void onBackPressed() {
        if (backPressedTime + 2000 > System.currentTimeMillis()) {
            finishAffinity();
        } else {
            Toast.makeText(this, "press again to exit ", Toast.LENGTH_SHORT).show();
        }

        backPressedTime = System.currentTimeMillis();
    }

}
