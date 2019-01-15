package com.myaquar.inventure.myaquareg.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.myaquar.inventure.myaquareg.R;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    public void Confirm(View view) {
        Toast.makeText(this, "Done..!", Toast.LENGTH_SHORT).show();
    }
}
