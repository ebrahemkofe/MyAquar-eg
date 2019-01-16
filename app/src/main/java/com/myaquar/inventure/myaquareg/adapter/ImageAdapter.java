package com.myaquar.inventure.myaquareg.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.myaquar.inventure.myaquareg.R;

public class ImageAdapter  extends PagerAdapter {
    private Context context;
    private LayoutInflater layoutInflater;
    private int[] Images;

    public ImageAdapter(Context context, int[] imags) {
        this.context = context;
        this.Images=imags;
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return Images.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view == (o);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        View itemView = LayoutInflater.from(context).inflate(R.layout.image_item, container, false);

        ImageView imageView = itemView.findViewById(R.id.ImageView_Compound);

        imageView.setImageResource(Images[position]);

        container.addView(itemView);

        return itemView;
    }
    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }
}
