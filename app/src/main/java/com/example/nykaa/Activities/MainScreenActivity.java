package com.example.nykaa.Activities;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.nykaa.Fragments.AccountFragment;
import com.example.nykaa.Fragments.HomeFragment;
import com.example.nykaa.Fragments.ListOfItemsFragment;
import com.example.nykaa.R;

public class MainScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);
        // launchAccountFragment();
        HomeScreenFragment();
    }

    private void launchAccountFragment() {
        getSupportFragmentManager().beginTransaction().add(R.id.flContainer, new AccountFragment()).commit();
    }

    private void HomeScreenFragment() {
        getSupportFragmentManager().beginTransaction().add(R.id.flContainer, new HomeFragment()).commit();
    }

    public void LaunchListItemFragment(String fileName) {
        getSupportFragmentManager().beginTransaction().replace(R.id.flContainer, ListOfItemsFragment.newInstance(fileName)).addToBackStack("listItem").commit();
    }
}