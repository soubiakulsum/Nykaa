package com.example.nykaa.Fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.nykaa.Data.ModelClass.NameModelClass;
import com.example.nykaa.R;

import java.util.ArrayList;
import java.util.List;


public class CategoryNameFragment extends Fragment {

    private RecyclerView NameRecyclerView;
    private List<NameModelClass>nameModelClassList = new ArrayList<>();


    public CategoryNameFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_category_name, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initViews(view);
    }


    private void initViews(View view) {
        NameRecyclerView = view.findViewById(R.id.NameRecyclerView);
    }
}