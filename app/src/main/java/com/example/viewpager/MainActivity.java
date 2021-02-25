package com.example.viewpager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    int[] img_resource={R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.d};
    CustomAdapter customAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager=findViewById(R.id.viewpager);
        customAdapter= new CustomAdapter(this,img_resource);
        viewPager.setAdapter(customAdapter);
    }
}