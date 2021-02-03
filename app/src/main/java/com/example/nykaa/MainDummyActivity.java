package com.example.nykaa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.example.nykaa.Fragments.HomeFragment;
import com.example.nykaa.Fragments.ListOfItemsFragment;
import com.example.nykaa.Fragments.SalesFragment;

public class MainDummyActivity extends AppCompatActivity {

    FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_dummy);
        fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        SalesFragment homeFragment = SalesFragment.newInstance();
        fragmentTransaction.replace(R.id.container, homeFragment, "aa").commit();
    }
}