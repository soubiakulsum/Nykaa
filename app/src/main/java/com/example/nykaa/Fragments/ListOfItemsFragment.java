package com.example.nykaa.Fragments;

import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.nykaa.Activities.MainScreenActivity;
import com.example.nykaa.Adapters.ItemListAdapter;
import com.example.nykaa.Data.listItemsData.JsonMember1Item;
import com.example.nykaa.Data.listItemsData.ListItemsResponseModel;
import com.example.nykaa.R;
import com.example.nykaa.clickListener.RecyclerViewClickListener;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class ListOfItemsFragment extends Fragment implements RecyclerViewClickListener {

    public ListOfItemsFragment() {
        // Required empty public constructor
    }

    public static ListOfItemsFragment newInstance(String fileName) {
        ListOfItemsFragment fragment = new ListOfItemsFragment();
        Bundle args = new Bundle();
        args.putString("fileName", fileName);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            fileName = getArguments().getString("fileName");
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
        Log.d("stuff", "working");
        initViews(view);
    }

    private View view;
    private TextView tvTitle;
    private ImageView search;

    private void initViews(View view) {
        this.view = view;
        handler = new Handler();
        recyclerView = view.findViewById(R.id.recyclerView);
        tvTitle = view.findViewById(R.id.textView4);
        search = view.findViewById(R.id.search);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainScreenActivity mainScreenActivity = (MainScreenActivity) getActivity();
                mainScreenActivity.LaunchSearchActivity();
            }
        });
        buildData();
    }

    private void buildData() {
        if (fileName.equals("bags.json") || fileName.equals("dress.json") || fileName.equals("shoes.json") || fileName.equals("watches.json")) {
            Thread thread = new Thread(runnable);
            thread.start();
        } else {
            Thread thread = new Thread(downloadRunnable);
            thread.start();
        }
    }

    private Runnable runnable = new Runnable() {
        @Override
        public void run() {
            loadJsonFromAsset();
        }
    };
    private String fileName;
    private Runnable downloadRunnable = new Runnable() {
        @Override
        public void run() {
            try {
                URL url = new URL("https://www.nykaafashion.com/catalogsearch/result/?q=" + fileName + "&searchType=Manual&internalSearchTerm=" + fileName);
                HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
                InputStream inputStream = urlConnection.getInputStream();

                int data = inputStream.read();
                StringBuilder stringBuilder = new StringBuilder();
                while (data != -1) {
                    char ch = (char) data;
                    stringBuilder.append(ch);
                    data = inputStream.read();
                }
                String results = stringBuilder.toString();

                String jsonResult = "";

                for (int index = results.indexOf("<script id=\"__PRELOADED_STATE__\" type=\"application/json\""); index >= 0; ) {

                    // Start Index
                    int startIndex = results.indexOf(">", index + 1);
                    ++startIndex;

                    // End Index
                    int indexOfEnd = results.indexOf("</script>", startIndex + 1);

                    String attributesString = results.substring(startIndex, indexOfEnd);
                    // Replace below line with desired logic with calling trim() on the String attributesString
                    jsonResult = attributesString;

                    // Next Address will be after the end of first address
                    index = results.indexOf("<address", indexOfEnd + 1);
                }

                String finalJsonResult = jsonResult;
                buildDataFromJson(finalJsonResult);
                inputStream.close();

            } catch (IOException e) {
                Toast.makeText(getActivity(), "Not working", Toast.LENGTH_SHORT).show();
                e.printStackTrace();
            }
        }
    };

    private void loadJsonFromAsset() {
        try {
            InputStream inputStream = getActivity().getAssets().open(fileName);

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
            Log.e("stufff", e.getMessage());
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
                tvTitle.setText(response.getListing().getTitle());
                GridLayoutManager gridLayoutManager = new GridLayoutManager(view.getContext(), 2, LinearLayoutManager.VERTICAL, false);
                ItemListAdapter itemListAdapter = new ItemListAdapter(listItemsData, ListOfItemsFragment.this);
                recyclerView.setLayoutManager(gridLayoutManager);
                recyclerView.setAdapter(itemListAdapter);
            }
        }, 1000);

    }

    @Override
    public void OnCategoryItemClicked(int item) {

    }

    @Override
    public void OnItemListClicked(String fileName) {

    }

    @Override
    public void OnProductItemClicked(String fileName) {
        MainScreenActivity mainScreenActivity = (MainScreenActivity) getActivity();
        mainScreenActivity.LaunchProductDetailActivity(fileName);
    }
}