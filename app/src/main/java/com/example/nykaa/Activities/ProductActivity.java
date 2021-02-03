package com.example.nykaa.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.example.nykaa.Adapters.ProductPagerAdapter;
import com.example.nykaa.R;
import com.google.android.material.tabs.TabLayout;

public class ProductActivity extends AppCompatActivity implements TabLayout.OnTabSelectedListener {

    private ViewPager2 mViewPager;
    private TabLayout tabLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);
        initViews();
        setViewPagerAdapter();
    }

    private void setViewPagerAdapter() {

        ProductPagerAdapter productPagerAdapter = new ProductPagerAdapter();
    }

    private void initViews() {
        mViewPager = findViewById(R.id.viewPager);
        tabLayout = findViewById(R.id.tabLayout);
        tabLayout.addOnTabSelectedListener(this);

    }

    @Override
    public void onTabSelected(TabLayout.Tab tab) {

    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {

    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {

    }
}