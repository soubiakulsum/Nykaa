package com.example.nykaa.Activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.nykaa.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseException;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthProvider;

import java.util.concurrent.TimeUnit;

public class Verification_OTP extends AppCompatActivity {

    EditText mEt1;

    String phonenumber;

    String otpid;

    FirebaseAuth mAuth;

    Button bt1;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verification__o_t_p);
        mEt1 = findViewById(R.id.et1);

        bt1 = findViewById(R.id.ResendOTP);

        //Bundle bundle = new Bundle();

        phonenumber = getIntent().getStringExtra("mobile").toString();


        mAuth = FirebaseAuth.getInstance();

        initiateOtp();

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (mEt1.getText().toString().isEmpty())
                    Toast.makeText(getApplicationContext(), "Blank Field can not be processed", Toast.LENGTH_LONG).show();
                else if (mEt1.getText().toString().length() != 6)
                    Toast.makeText(getApplicationContext(), "Invalid OTP", Toast.LENGTH_LONG).show();
                else {
                    PhoneAuthCredential credential = PhoneAuthProvider.getCredential(otpid, mEt1.getText().toString());
                    signInWithPhoneAuthCredential(credential);
                }
            }

        });

    }



    private void initiateOtp() {

        PhoneAuthProvider.getInstance().verifyPhoneNumber(
                phonenumber,        // Phone number to verify
                60,                 // Timeout duration
                TimeUnit.SECONDS,   // Unit of timeout
                this,               // Activity (for callback binding)
                new PhoneAuthProvider.OnVerificationStateChangedCallbacks()
                {
                    @Override
                    public void onCodeSent(String s, PhoneAuthProvider.ForceResendingToken forceResendingToken)
                    {
                        otpid=s;
                    }

                    @Override
                    public void onVerificationCompleted(PhoneAuthCredential phoneAuthCredential)
                    {
                        signInWithPhoneAuthCredential(phoneAuthCredential);
                    }

                    @Override
                    public void onVerificationFailed(FirebaseException e) {
                        Toast.makeText(getApplicationContext(),e.getMessage(),Toast.LENGTH_LONG).show();
                    }
                });        // OnVerificationStateChangedCallbacks

    }


    private void signInWithPhoneAuthCredential(PhoneAuthCredential credential) {
        mAuth.signInWithCredential(credential)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful())
                        {
                            startActivity(new Intent(Verification_OTP.this, Dashboard_Activity.class));
                            finish();

                        } else {
                            Toast.makeText(getApplicationContext(),"Signin Code Error",Toast.LENGTH_LONG).show();
                        }
                    }
                });
    }

}
