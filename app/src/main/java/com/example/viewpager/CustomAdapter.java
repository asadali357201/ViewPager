package com.example.viewpager;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class CustomAdapter extends PagerAdapter {
    int[] img_resource;
    Context context;
    LayoutInflater layoutInflater;
    public CustomAdapter(MainActivity mainActivity, int[] img_resource) {
          this.img_resource=img_resource;
           this.context=mainActivity;
           layoutInflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount()
    {
        return img_resource.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem( ViewGroup container, int position) {
        View view= layoutInflater.inflate(R.layout.data,container,false);
        ImageView img=(ImageView) view.findViewById(R.id.imgid);
        img.setImageResource(img_resource[position]);
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout)object);
    }
}
