package com.example.nykaa.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;

import com.example.nykaa.Data.ProductDetail.ProductDetailResponse;
import com.example.nykaa.Data.ProductDetail.ProductMediaItem;
import com.example.nykaa.Data.constants.IntentConstants;
import com.example.nykaa.HelperClass.GetJsonFile;
import com.example.nykaa.ProductAdapter;
import com.example.nykaa.ProductModelClass;
import com.example.nykaa.R;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.kingfisher.easyviewindicator.RecyclerViewIndicator;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class ProductActivity extends AppCompatActivity {

    private List<ProductModelClass> productModelClassList = new ArrayList<>();
    private RecyclerView ProductRecyclerVIew;
    private RecyclerViewIndicator recyclerViewIndicator;

    private String productURL;
    private Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);
        handler = new Handler();
        if (getIntent() != null && getIntent().getExtras() != null) {
            productURL = getIntent().getStringExtra(IntentConstants.PRODUCT_DETAIL);
        } else {
            productURL = "/kleio-black-quilted-vibrant-sling-bag/p/944618";
        }

        initViews();

        Thread thread = new Thread(getDetailRunnable);
        thread.start();
        buildData();
    }

    Runnable getDetailRunnable = new Runnable() {
        @Override
        public void run() {
            String json = GetJsonFile.getItemDetail(productURL);
            buildDataFromJson(json);
        }
    };

    private List<ProductMediaItem> listItemsData;
    private ProductDetailResponse response;
    private void buildDataFromJson(String json) {

        Type type = new TypeToken<ProductDetailResponse>() {
        }.getType();
         response = new Gson().fromJson(json, type);
        listItemsData = response.getDetails().getSkuData().getProduct().getProductMedia();

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                setViewPagerAdapter();
            }
        }, 1000);

    }


    private void buildData() {
        productModelClassList.add(new ProductModelClass(R.drawable.product1));
        productModelClassList.add(new ProductModelClass(R.drawable.product2));
        productModelClassList.add(new ProductModelClass(R.drawable.product3));
        productModelClassList.add(new ProductModelClass(R.drawable.product4));
    }
    private TextView tvJaipur;
    private TextView tvSharara;
    private TextView tvPrice;
    private TextView discount;
    private TextView tvInclusiveOfTaxes;
    private TextView tvDetails;
    private void initViews() {
        ProductRecyclerVIew = findViewById(R.id.ProductRecyclerVIew);
        recyclerViewIndicator = findViewById(R.id.recyclerViewIndicator);
        tvJaipur = findViewById(R.id.tvJaipur);
        tvSharara = findViewById(R.id.tvSharara);
        discount = findViewById(R.id.discount);
        tvPrice = findViewById(R.id.tvPrice);
        tvInclusiveOfTaxes = findViewById(R.id.tvInclusiveOfTaxes);
        tvDetails = findViewById(R.id.tvDetails);
    }

    private void setViewPagerAdapter() {

//        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(1,LinearLayoutManager.HORIZONTAL);
        tvJaipur.setText(response.getDetails().getSkuData().getProduct().getTitle());
        tvSharara.setText(response.getDetails().getSkuData().getProduct().getSubTitle());
        tvPrice.setText("₹"+response.getDetails().getSkuData().getProduct().getDiscountedPrice());
        discount.setText(response.getDetails().getSkuData().getProduct().getDiscount()+"% off");
        tvInclusiveOfTaxes.setText("MRP "+response.getDetails().getSkuData().getProduct().getPrice()+" Inclusive of all taxes");
        tvDetails.setText(response.getDetails().getSkuData().getProduct().getProductInfo().get(0).getValue());




        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        ProductRecyclerVIew.setLayoutManager(linearLayoutManager);
        recyclerViewIndicator.setRecyclerView(ProductRecyclerVIew);
        ProductAdapter productAdapter = new ProductAdapter(listItemsData);
        ProductRecyclerVIew.setAdapter(productAdapter);

        PagerSnapHelper snapHelper = new PagerSnapHelper();
        snapHelper.attachToRecyclerView(ProductRecyclerVIew);
    }

    public void ADDTOBAG(View view) {

        Intent intent = new Intent(ProductActivity.this,CardItemActivity.class);
        intent.putExtra("Jaipur",tvJaipur.getText().toString());
        startActivity(intent);

    }
}