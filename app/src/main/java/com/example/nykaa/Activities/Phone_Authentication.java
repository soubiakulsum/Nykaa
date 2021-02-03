package com.example.nykaa.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.nykaa.R;
import com.hbb20.CountryCodePicker;

public class Phone_Authentication extends AppCompatActivity {

    EditText mEtNumber;

    Button mEtGetOTP;

    CountryCodePicker ccp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone__authentication);

        mEtNumber=findViewById(R.id.etNumber);

        mEtGetOTP=findViewById(R.id.GetOTP);

        ccp=findViewById(R.id.ccp);

        ccp.registerCarrierNumberEditText(mEtNumber);

        mEtGetOTP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent= new Intent(Phone_Authentication.this, Verification_OTP.class);

                intent.putExtra("mobile",ccp.getFullNumberWithPlus().replace(" ", ""));

                startActivity(intent);
            }
        });
    }
}