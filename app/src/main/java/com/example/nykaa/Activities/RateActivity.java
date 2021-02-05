package com.example.nykaa.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

import com.example.nykaa.R;

public class RateActivity extends AppCompatActivity {

    RatingBar ratingBar;

    Button btSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rate);

        ratingBar = findViewById(R.id.rating_bar);
        btSubmit= findViewById(R.id.bt_submit);

        btSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String s= String.valueOf(ratingBar.getRating());

                Toast.makeText(RateActivity.this, s+"Star", Toast.LENGTH_SHORT).show();

            }
        });
    }
}