package com.example.nykaa.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.example.nykaa.Data.constants.IntentConstants;
import com.example.nykaa.Fragments.AccountFragment;
import com.example.nykaa.Fragments.BrandsFragment;
import com.example.nykaa.Fragments.CategoriesFragment;
import com.example.nykaa.Fragments.HomeFragment;
import com.example.nykaa.Fragments.ListOfItemsFragment;
import com.example.nykaa.Fragments.SalesFragment;
import com.example.nykaa.Fragments.ShopFragment;
import com.example.nykaa.R;

public class MainScreenActivity extends AppCompatActivity {
    private FragmentManager fragmentManager;
    private ImageView imageView3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);
        imageView3 = findViewById(R.id.imageView3);
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navi1.setImageResource(R.drawable.ic_nykaa_logo);
                navi2.setImageResource(R.drawable.ic_sale);
                navi3.setImageResource(R.drawable.ic_shop_selected);
                navi4.setImageResource(R.drawable.ic_account);
                naviText1.setTextColor(Color.parseColor("#A9A9A9"));
                naviText2.setTextColor(Color.parseColor("#A9A9A9"));
                naviText3.setTextColor(Color.parseColor("#FB7880"));
                naviText4.setTextColor(Color.parseColor("#A9A9A9"));
                LaunchBrandFragment();

            }

        });
        launchAccountFragment();
        launchBrandFragment();
    }

//    private void launchCategoriesFragment() {
//        fragmentManager = getSupportFragmentManager();
//        CategoriesFragment categoriesFragment = CategoriesFragment.newInstance();
//        FragmentTransaction fragmentTransaction =fragmentManager.beginTransaction();
//        fragmentTransaction.replace(R.id.shopContainer, categoriesFragment, "Categories").commit();
//    }

    private void launchBrandFragment() {
        fragmentManager = getSupportFragmentManager();
        BrandsFragment brandsFragment = BrandsFragment.newInstance();
        FragmentTransaction fragmentTransaction =fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.flContainer, brandsFragment, "brands").commit();

        // launchAccountFragment();
        initView();



        if (getIntent() != null && getIntent().getExtras() != null) {
            LaunchListItemFragment(getIntent().getStringExtra(IntentConstants.SEARCH_STUFF));
            Log.d("thing", getIntent().getStringExtra(IntentConstants.SEARCH_STUFF));
        } else {

            HomeScreenFragment();
        }


    }

    private ImageView navi1;
    private ImageView navi2;
    private ImageView navi3;
    private ImageView navi4;
    private TextView naviText1;
    private TextView naviText2;
    private TextView naviText3;
    private TextView naviText4;
    private CardView constraintLayout;
    private CardView actionBar;

    private void initView() {
        navi1 = findViewById(R.id.navi1);
        navi2 = findViewById(R.id.navi2);
        navi3 = findViewById(R.id.navi3);
        navi4 = findViewById(R.id.navi4);
        naviText1 = findViewById(R.id.naviText1);
        naviText2 = findViewById(R.id.naviText2);
        naviText3 = findViewById(R.id.naviText3);
        naviText4 = findViewById(R.id.naviText4);
        constraintLayout = findViewById(R.id.constraintLayout);
        actionBar = findViewById(R.id.actionBar);

        setListeners();
    }


    private void setListeners() {
        navi1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navi1.setImageResource(R.drawable.ic_nykaa_logo_selected);
                navi2.setImageResource(R.drawable.ic_sale);
                navi3.setImageResource(R.drawable.ic_shop);
                navi4.setImageResource(R.drawable.ic_account);
                naviText1.setTextColor(Color.parseColor("#FB7880"));
                naviText2.setTextColor(Color.parseColor("#A9A9A9"));
                naviText3.setTextColor(Color.parseColor("#A9A9A9"));
                naviText4.setTextColor(Color.parseColor("#A9A9A9"));
                HomeScreenFragment();
            }
        });

        navi2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navi1.setImageResource(R.drawable.ic_nykaa_logo);
                navi2.setImageResource(R.drawable.ic_sale_selected);
                navi3.setImageResource(R.drawable.ic_shop);
                navi4.setImageResource(R.drawable.ic_account);
                naviText1.setTextColor(Color.parseColor("#A9A9A9"));
                naviText2.setTextColor(Color.parseColor("#FB7880"));
                naviText3.setTextColor(Color.parseColor("#A9A9A9"));
                naviText4.setTextColor(Color.parseColor("#A9A9A9"));
                LaunchSaleFragment();
            }
        });

        navi3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navi1.setImageResource(R.drawable.ic_nykaa_logo);
                navi2.setImageResource(R.drawable.ic_sale);
                navi3.setImageResource(R.drawable.ic_shop_selected);
                navi4.setImageResource(R.drawable.ic_account);
                naviText1.setTextColor(Color.parseColor("#A9A9A9"));
                naviText2.setTextColor(Color.parseColor("#A9A9A9"));
                naviText3.setTextColor(Color.parseColor("#FB7880"));
                naviText4.setTextColor(Color.parseColor("#A9A9A9"));
                LaunchBrandFragment();
            }
        });

        navi4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navi1.setImageResource(R.drawable.ic_nykaa_logo);
                navi2.setImageResource(R.drawable.ic_sale);
                navi3.setImageResource(R.drawable.ic_shop);
                navi4.setImageResource(R.drawable.ic_account_selected);
                naviText1.setTextColor(Color.parseColor("#A9A9A9"));
                naviText2.setTextColor(Color.parseColor("#A9A9A9"));
                naviText3.setTextColor(Color.parseColor("#A9A9A9"));
                naviText4.setTextColor(Color.parseColor("#FB7880"));
                launchAccountFragment();
            }
        });


    }

    private void launchAccountFragment() {
        getSupportFragmentManager().beginTransaction().replace(R.id.flContainer, new AccountFragment()).commit();
    }

    private void HomeScreenFragment() {
        constraintLayout.setVisibility(View.VISIBLE);
        actionBar.setVisibility(View.VISIBLE);
        getSupportFragmentManager().beginTransaction().replace(R.id.flContainer, new HomeFragment()).commit();
    }

    private void LaunchSaleFragment() {

        getSupportFragmentManager().beginTransaction().replace(R.id.flContainer, new SalesFragment()).commit();
    }

    private void LaunchBrandFragment() {
        getSupportFragmentManager().beginTransaction().replace(R.id.flContainer, new BrandsFragment()).commit();
    }

    public void LaunchListItemFragment(String fileName) {
        constraintLayout.setVisibility(View.GONE);
        actionBar.setVisibility(View.GONE);
        getSupportFragmentManager().beginTransaction().replace(R.id.flContainer, ListOfItemsFragment.newInstance(fileName)).addToBackStack("listItem").commit();
    }

    public void LaunchSearchActivity() {
        Intent intent = new Intent(MainScreenActivity.this, SearchActivity.class);
        startActivity(intent);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        constraintLayout.setVisibility(View.VISIBLE);
        actionBar.setVisibility(View.VISIBLE);
    }




    public void LaunchProductDetailActivity(String url) {
        Intent intent = new Intent(MainScreenActivity.this, ProductActivity.class);
        intent.putExtra(IntentConstants.PRODUCT_DETAIL, url);
        startActivity(intent);

    }


}