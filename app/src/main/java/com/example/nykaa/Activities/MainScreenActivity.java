package com.example.nykaa.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.nykaa.Fragments.AccountFragment;
import com.example.nykaa.R;

public class MainScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);
        launchAccountFragment();
    }

    private void launchAccountFragment() {

       getSupportFragmentManager().beginTransaction().add(R.id.flContainer,new AccountFragment()).commit();
    }
}