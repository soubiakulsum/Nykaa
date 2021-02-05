package com.example.nykaa.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.nykaa.Activities.ChatWithUs;
import com.example.nykaa.Activities.HelpCenterActivity;
import com.example.nykaa.Activities.LoginActivity;
import com.example.nykaa.Activities.MyOrderActivity;
import com.example.nykaa.Activities.MyOrderGify;
import com.example.nykaa.Activities.MyWishListActivity;
import com.example.nykaa.Activities.Privacy_Activity;
import com.example.nykaa.Activities.RateActivity;
import com.example.nykaa.Activities.Responsible_Activity;
import com.example.nykaa.Activities.Shipping_Activity;
import com.example.nykaa.Activities.Terms_Activity;
import com.example.nykaa.R;

import java.util.Timer;
import java.util.TimerTask;

public class AccountFragment extends Fragment implements View.OnClickListener {

    Button mBtnHelpCenter;
    Button mBtnResponsible;
    Button mBtnShippingPolicy;
    Button mBtnTerms;
    Button mBtnPrivacy;
    Button mBtnRate;
    Button mBtnLogout;

    Button mtvMyOrder;

    Button mtvWishlist;

    Button mtvChat;


    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    public AccountFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_account, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        mtvMyOrder=view.findViewById(R.id.tvMyOrders);
        mtvWishlist=view.findViewById(R.id.tvMyWishlist);
        mBtnHelpCenter=view.findViewById(R.id.btnHelpCenter);
        mBtnResponsible=view.findViewById(R.id.btnResponsible);
        mBtnShippingPolicy=view.findViewById(R.id.btnShippingPolicy);
        mBtnTerms=view.findViewById(R.id.btnTerms);
        mBtnPrivacy=view.findViewById(R.id.btnPrivacy);
        mBtnRate=view.findViewById(R.id.btnRate);
        mBtnLogout=view.findViewById(R.id.btnLogout);
        mtvChat=view.findViewById(R.id.tvChatWithUs);

        mBtnHelpCenter.setOnClickListener(this);
        mBtnResponsible.setOnClickListener(this);
        mBtnShippingPolicy.setOnClickListener(this);
        mBtnTerms.setOnClickListener(this);
        mBtnPrivacy.setOnClickListener(this);
        mBtnRate.setOnClickListener(this);
        mBtnLogout.setOnClickListener(this);
        mtvMyOrder.setOnClickListener(this);
        mtvWishlist.setOnClickListener(this);
        mtvChat.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        switch(v.getId()){
            case R.id.btnHelpCenter:
                Intent intent = new Intent(getContext(), HelpCenterActivity.class);
                startActivity(intent);
                break;

            case R.id.btnResponsible:

                Intent intent1 = new Intent(getContext(), Responsible_Activity.class);
                startActivity(intent1);
                break;

            case R.id.btnShippingPolicy:

                Intent intent2 = new Intent(getContext(), Shipping_Activity.class);
                startActivity(intent2);
                break;

            case R.id.btnTerms:

                Intent intent3 = new Intent(getContext(), Terms_Activity.class);
                startActivity(intent3);
                break;

            case R.id.btnPrivacy:

                Intent intent4 = new Intent(getContext(), Privacy_Activity.class);
                startActivity(intent4);
                break;

            case R.id.btnRate:
                Intent intent5= new Intent(getContext(), RateActivity.class);
                startActivity(intent5);
                break;


            case R.id.btnLogout:

                Intent intent6 = new Intent(getContext(), LoginActivity.class);
                startActivity(intent6);


                break;

            case R.id.tvMyOrders:


                Intent intent7 = new Intent(getContext(), MyOrderGify.class);
                startActivity(intent7);
                break;




            case R.id.tvMyWishlist:

                Intent intent8 = new Intent(getContext(), MyWishListActivity.class);
                startActivity(intent8);
                break;

            case R.id.tvChatWithUs:

                Intent intent9= new Intent(getContext(), ChatWithUs.class);
                startActivity(intent9);
                break;



        }

    }
}