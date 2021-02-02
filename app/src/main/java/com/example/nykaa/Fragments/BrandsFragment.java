package com.example.nykaa.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.nykaa.R;


public class BrandsFragment extends Fragment {


    public static BrandsFragment newInstance(){

        BrandsFragment brandsFragment = new BrandsFragment();
        return brandsFragment;
    }


    public BrandsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_brands, container, false);
    }
}