package com.example.nykaa.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.example.nykaa.Fragments.AccountFragment;
import com.example.nykaa.Fragments.BrandsFragment;
import com.example.nykaa.R;

public class MainScreenActivity extends AppCompatActivity {
    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);
        launchAccountFragment();

        launchBrandFragment();
    }

    private void launchBrandFragment() {
        fragmentManager = getSupportFragmentManager();
        BrandsFragment brandsFragment = BrandsFragment.newInstance();
        FragmentTransaction fragmentTransaction =fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.flContainer, brandsFragment, "brands").commit();

    }

    private void launchAccountFragment() {


    }
}