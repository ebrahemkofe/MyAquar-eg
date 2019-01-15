package com.myaquar.inventure.myaquareg.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.myaquar.inventure.myaquareg.R;

public class AboutUs_Activity extends AppCompatActivity {
    TextView Header_txt,Content_txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us_);

        Header_txt=findViewById(R.id.Header_txt);
        Content_txt=findViewById(R.id.Content_txt);
    }
}
