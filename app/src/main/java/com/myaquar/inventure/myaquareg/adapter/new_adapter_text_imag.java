package com.myaquar.inventure.myaquareg.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.myaquar.inventure.myaquareg.R;

public class new_adapter_text_imag extends PagerAdapter {
    private Context context;
    private LayoutInflater layoutInflater;
    private int[] Images;
    private String[] text_imag;
    public new_adapter_text_imag(Context context, int[] imags,String [] text_imag) {
        this.context = context;
        this.Images=imags;
        this.text_imag=text_imag;
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return Images.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return false;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        View itemView = LayoutInflater.from(context).inflate(R.layout.image_item, container, false);

        ImageView imageView = itemView.findViewById(R.id.ImageView_Compound);

        imageView.setImageResource(Images[position]);
        TextView textView=itemView.findViewById(R.id.text_id_imag);
        textView.setText(text_imag[position]);
        container.addView(itemView);

        return itemView;
    }
    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }

}
