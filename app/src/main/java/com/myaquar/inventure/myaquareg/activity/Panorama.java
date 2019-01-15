package com.myaquar.inventure.myaquareg.activity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.myaquar.inventure.myaquareg.R;
import com.google.vr.sdk.widgets.pano.VrPanoramaView;

public class Panorama extends AppCompatActivity {


      private VrPanoramaView vrPanoramaView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_panorama);


        vrPanoramaView=findViewById(R.id.panorama);
        Bitmap icon = BitmapFactory.decodeResource(getResources(),R.drawable.newphoto);
        vrPanoramaView.loadImageFromBitmap(icon, new VrPanoramaView.Options());
        vrPanoramaView.setInfoButtonEnabled(false);

    }
}
