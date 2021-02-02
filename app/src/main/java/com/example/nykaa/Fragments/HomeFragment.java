package com.example.nykaa.Fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.nykaa.Adapters.HomeRecyclerViewAdapter;
import com.example.nykaa.Data.homeData.HomeResponseModel;
import com.example.nykaa.Data.homeData.LandingpageDataItem;
import com.example.nykaa.R;
import com.example.nykaa.clickListener.RecyclerViewClickListener;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.InputStream;
import java.lang.reflect.Type;
import java.util.List;


public class HomeFragment extends Fragment implements RecyclerViewClickListener {

    public HomeFragment() {
        // Required empty public constructor
    }

    public static HomeFragment newInstance() {
        return new HomeFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView(view);
    }

    private RecyclerView recyclerview;
    View view1;
    private Handler handler;

    private void initView(View view) {
        view1 = view;
        handler = new Handler();
        recyclerview = view.findViewById(R.id.recyclerview);
        buildData();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);
        recyclerview.setLayoutManager(linearLayoutManager);

    }

    @Override
    public void OnCategoryItemClicked(int item) {
        Toast.makeText(getActivity(), item + "", Toast.LENGTH_SHORT).show();
    }


    public void buildData() {
        Thread thread = new Thread(runnable);
        thread.start();
    }

    private Runnable runnable = new Runnable() {
        @Override
        public void run() {
            loadJsonFromAsset();
        }
    };

    private void loadJsonFromAsset() {
        try {
            InputStream inputStream = getActivity().getAssets().open("HomePageFile.json");
            int data = inputStream.read();
            StringBuilder stringBuilder = new StringBuilder();
            while (data != -1) {
                char ch = (char) data;
                stringBuilder.append(ch);
                data = inputStream.read();
            }
            buildDataFromJson(stringBuilder.toString());
        } catch (Exception e) {
            e.printStackTrace();
            Log.e("stuff", e.getMessage());
        }
    }

    private List<LandingpageDataItem> homeData;

    private void buildDataFromJson(String json) {

        Type type = new TypeToken<HomeResponseModel>() {
        }.getType();
        HomeResponseModel response = new Gson().fromJson(json, type);
        homeData = response.getLandingpage().getLandingpageData();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                HomeRecyclerViewAdapter homeRecyclerViewAdapter = new HomeRecyclerViewAdapter(HomeFragment.this, homeData);
                recyclerview.setAdapter(homeRecyclerViewAdapter);
            }
        }, 3000);


    }
}