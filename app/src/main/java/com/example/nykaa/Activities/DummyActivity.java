package com.example.nykaa.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.example.nykaa.Fragments.AccountFragment;
import com.example.nykaa.Fragments.BrandsFragment;
import com.example.nykaa.Fragments.HomeFragment;
import com.example.nykaa.Fragments.SalesFragment;
import com.example.nykaa.R;

public class DummyActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dummy);


        getSupportFragmentManager().beginTransaction().add(R.id.container,new AccountFragment()).commit();


    }
}