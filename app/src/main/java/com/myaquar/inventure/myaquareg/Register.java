package com.myaquar.inventure.myaquareg;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Register extends AppCompatActivity {
//l'k'lkmklmljlkm
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    public void Confirm(View view) {
        Toast.makeText(this, "Done..!", Toast.LENGTH_SHORT).show();
    }
}
