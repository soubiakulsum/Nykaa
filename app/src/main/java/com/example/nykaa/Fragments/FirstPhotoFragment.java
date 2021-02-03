package com.example.nykaa.Fragments;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.nykaa.R;


public class FirstPhotoFragment extends Fragment {

    private static final String ARG_PARAM1 = "param1";
    private static final String TAG = FirstPhotoFragment.class.getSimpleName();
    private ImageView ivPhotoOne;



    public FirstPhotoFragment() {
        // Required empty public constructor
    }

    public static FirstPhotoFragment newInstance() {

        Bundle args = new Bundle();

        FirstPhotoFragment fragment = new FirstPhotoFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first_photo, container, false);
    }
}