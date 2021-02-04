package com.example.nykaa.Fragments;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.nykaa.Activities.HelpCenterActivity;
import com.example.nykaa.Activities.Logout_Activity;
import com.example.nykaa.Activities.Privacy_Activity;
import com.example.nykaa.Activities.Responsible_Activity;
import com.example.nykaa.Activities.Shipping_Activity;
import com.example.nykaa.Activities.Terms_Activity;
import com.example.nykaa.R;

public class AccountFragment extends Fragment implements View.OnClickListener {

    Button mBtnHelpCenter;
    Button mBtnResponsible;
    Button mBtnShippingPolicy;
    Button mBtnTerms;
    Button mBtnPrivacy;
    Button mBtnRate;
    Button mBtnLogout;


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

        mBtnHelpCenter=view.findViewById(R.id.btnHelpCenter);
        mBtnResponsible=view.findViewById(R.id.btnResponsible);
        mBtnShippingPolicy=view.findViewById(R.id.btnShippingPolicy);
        mBtnTerms=view.findViewById(R.id.btnTerms);
        mBtnPrivacy=view.findViewById(R.id.btnPrivacy);
        mBtnRate=view.findViewById(R.id.btnRate);
        mBtnLogout=view.findViewById(R.id.btnLogout);

        mBtnHelpCenter.setOnClickListener(this);
        mBtnResponsible.setOnClickListener(this);
        mBtnShippingPolicy.setOnClickListener(this);
        mBtnTerms.setOnClickListener(this);
        mBtnPrivacy.setOnClickListener(this);
        mBtnRate.setOnClickListener(this);
        mBtnLogout.setOnClickListener(this);


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

                Intent i = new Intent(android.content.Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://play.google.com/store?utm_source=apac_med&utm_medium=hasem&utm_content=Jan0421&utm_campaign=Evergreen&pcampaignid=MKT-EDR-apac-in-1003227-med-hasem-py-Evergreen-Jan0421-Text_Search_BKWS-BKWS%7cONSEM_kwid_43700058914955321_creativeid_480977427755_device_c&gclid=CjwKCAiAsOmABhAwEiwAEBR0Zkkr7UNJG4iuTfe8UN_RmwPCG6NRR4w-EPMKNRNgD7MSM0PGrqI37RoCgFAQAvD_BwE&gclsrc=aw.ds "));
                startActivity(i);

            case R.id.btnLogout:

                Intent intent6 = new Intent(getContext(), Logout_Activity.class);
                startActivity(intent6);
                break;



        }

    }
}