package com.example.nykaa.Fragments;

import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.nykaa.Adapters.ItemListAdapter;
import com.example.nykaa.Data.listItemsData.JsonMember1Item;
import com.example.nykaa.Data.listItemsData.ListItemsResponseModel;
import com.example.nykaa.R;
import com.example.nykaa.clickListener.RecyclerViewClickListener;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.InputStream;
import java.lang.reflect.Type;
import java.util.List;

public class ListOfItemsFragment extends Fragment implements RecyclerViewClickListener {

    public ListOfItemsFragment() {
        // Required empty public constructor
    }

    public static ListOfItemsFragment newInstance() {
        ListOfItemsFragment fragment = new ListOfItemsFragment();
        return fragment;
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

        return inflater.inflate(R.layout.fragment_list_of_items, container, false);
    }

    private RecyclerView recyclerView;
    private Handler handler;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.d("stuff","working");
        initViews(view);
    }

    private View view;

    private void initViews(View view) {
        this.view = view;
        handler = new Handler();
        recyclerView = view.findViewById(R.id.recyclerView);
        buildData();
    }

    private void buildData() {
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
            InputStream inputStream = getActivity().getAssets().open("shoes.json");
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

    private List<JsonMember1Item> listItemsData;

    private void buildDataFromJson(String json) {

        Type type = new TypeToken<ListItemsResponseModel>() {
        }.getType();
        ListItemsResponseModel response = new Gson().fromJson(json, type);
        listItemsData = response.getListing().getProducts().getJsonMember1();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                GridLayoutManager gridLayoutManager = new GridLayoutManager(view.getContext(), 2, LinearLayoutManager.VERTICAL, false);
                ItemListAdapter itemListAdapter = new ItemListAdapter(listItemsData, ListOfItemsFragment.this);
                recyclerView.setLayoutManager(gridLayoutManager);
                recyclerView.setAdapter(itemListAdapter);
            }
        }, 3000);

    }

    @Override
    public void OnCategoryItemClicked(int item) {

    }
}