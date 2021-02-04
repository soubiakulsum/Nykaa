package com.example.nykaa.Activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.example.nykaa.Adapters.ProductPagerAdapter;
import com.example.nykaa.ProductAdapter;
import com.example.nykaa.ProductModelClass;
import com.example.nykaa.R;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.kingfisher.easyviewindicator.RecyclerViewIndicator;

import java.util.ArrayList;
import java.util.List;

public class ProductActivity extends AppCompatActivity  {

    private List<ProductModelClass>productModelClassList = new ArrayList<>();
    private RecyclerView ProductRecyclerVIew;
    private RecyclerViewIndicator recyclerViewIndicator;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);
        initViews();
        buildData();
        setViewPagerAdapter();
    }

    private void buildData() {
        productModelClassList.add(new ProductModelClass(R.drawable.product1));
        productModelClassList.add(new ProductModelClass(R.drawable.product2));
        productModelClassList.add(new ProductModelClass(R.drawable.product3));
        productModelClassList.add(new ProductModelClass(R.drawable.product4));
    }

    private void initViews() {
        ProductRecyclerVIew = findViewById(R.id.ProductRecyclerVIew);
        recyclerViewIndicator = findViewById(R.id.recyclerViewIndicator);


    }

    private void setViewPagerAdapter() {

//        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(1,LinearLayoutManager.HORIZONTAL);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        ProductRecyclerVIew.setLayoutManager(linearLayoutManager);
        recyclerViewIndicator.setRecyclerView(ProductRecyclerVIew);
        ProductAdapter productAdapter = new ProductAdapter(productModelClassList);
        ProductRecyclerVIew.setAdapter(productAdapter);

        PagerSnapHelper snapHelper = new PagerSnapHelper();
        snapHelper.attachToRecyclerView(ProductRecyclerVIew);




    }
}