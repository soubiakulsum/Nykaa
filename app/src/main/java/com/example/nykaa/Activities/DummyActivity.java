package com.example.nykaa.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.example.nykaa.Fragments.HomeFragment;
import com.example.nykaa.Fragments.SalesFragment;
import com.example.nykaa.R;

public class DummyActivity extends AppCompatActivity {

    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dummy);

        fragmentManager = getSupportFragmentManager();
        SalesFragment salesFragment = SalesFragment.newInstance();
        FragmentTransaction fragmentTransaction =fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.container, salesFragment, "sales").commit();

    }
}