package com.myaquar.inventure.myaquareg.fargment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.ShareActionProvider;
import android.widget.TextView;

import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.BaseSliderView;
import com.daimajia.slider.library.SliderTypes.TextSliderView;
import com.myaquar.inventure.myaquareg.R;
import com.myaquar.inventure.myaquareg.activity.Panorama;

/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment {

    ScrollView sv;
    TextView t,Life_Txt;
    String textDes ,textLP;
    Button go360;
    Button b, BTN_Share;
    boolean n = true;
    SliderLayout sl;
    ShareActionProvider mShareActionProvider;
    int[] images = {
            R.drawable.in1,
            R.drawable.in2,
            R.drawable.in4,
            R.drawable.in5,
            R.drawable.in6

    };



    public BlankFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view =   inflater.inflate(R.layout.fragment_blank2, container, false);

        go360 = view.findViewById(R.id.go360);
        BTN_Share = view.findViewById(R.id.BTN_Share);
        b = view.findViewById(R.id.go_translate);
        t = view.findViewById(R.id.Description_text);
        Life_Txt = view.findViewById(R.id.Life_Txt);
        textDes = getResources().getString(R.string.Description);
        textLP=Life_Txt.getText().toString();
        SetColor(textDes, textLP);
        sv = view.findViewById(R.id.scroll);
        sl = view.findViewById(R.id.slider);

        go360.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(),Panorama.class);
                startActivity(i);

            }
        });
        BTN_Share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent share = new Intent();
                share.setAction(Intent.ACTION_SEND);
                share.putExtra(Intent.EXTRA_TEXT,
                        "https://play.google.com/store/apps/details?id=com.youssef.maggy.aqartest");
                share.setType("textDes/plain");
                startActivity(share);
            }
        });

        for (int i = 0; i < images.length; i++) {

            TextSliderView textSliderView = new TextSliderView(this.getContext());
            textSliderView.setScaleType(BaseSliderView.ScaleType.CenterCrop);
            textSliderView.image(images[i]);
            sl.addSlider(textSliderView);
        }
        if (container != null) container.removeAllViews();

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (n) {
                    textDes =getResources().getString(R.string.arbic_des);
                    textLP="لايف بارك";
                    SetColor(textDes,textLP);
                    n = false;
                } else {
                    textDes = getResources().getString(R.string.Description);
                    textLP=Life_Txt.getText().toString();
                    SetColor(textDes, textLP);
                    n = true;
                }
            }
        });




        return view ;
    }
    private void setShareIntent(Intent shareIntent) {
        if (mShareActionProvider != null) {
            mShareActionProvider.setShareIntent(shareIntent);
        }

    }
    private void SetColor(String text, String textLP){

        String concat="<b>"+textLP+"</b>"+" "+ text;
        Spannable spannable=new SpannableString(Html.fromHtml(concat));

        spannable.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.LPColor))
                ,0,textLP.length(),Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        t.setText(spannable,TextView.BufferType.SPANNABLE);
    }


}
