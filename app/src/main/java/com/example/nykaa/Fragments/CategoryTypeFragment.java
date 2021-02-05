package com.example.nykaa.Fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.nykaa.Adapters.TypeAdapterClass;
import com.example.nykaa.Data.ModelClass.TypeModelClass;
import com.example.nykaa.Interface.TypeClickListener;
import com.example.nykaa.R;

import java.util.ArrayList;
import java.util.List;


public class CategoryTypeFragment extends Fragment implements TypeClickListener {

    private List<TypeModelClass> typeModelClassList = new ArrayList<>();
    private RecyclerView recyclerView;

    public CategoryTypeFragment() {
        // Required empty public constructor
    }

    public CategoryTypeFragment newInstance(){
        CategoryTypeFragment categoryTypeFragment = new CategoryTypeFragment();
        return categoryTypeFragment;
    }

    public static CategoryTypeFragment newInstance(String s) {
        CategoryTypeFragment categoryTypeFragment = new CategoryTypeFragment();
        return categoryTypeFragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_category_type, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initViews(view);
        buildRecyclerData();
        setRecyclerData();
    }



    private void setRecyclerData() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        TypeAdapterClass typeAdapterClass = new TypeAdapterClass(typeModelClassList,this);
        recyclerView.setAdapter(typeAdapterClass);
    }

    private void initViews(View view) {
        recyclerView = view.findViewById(R.id.recyclerView);
    }

    private void buildRecyclerData() {

        typeModelClassList = new ArrayList<>();
        for (int i=0;i<100;i++){

            typeModelClassList.add(new TypeModelClass("What's New",1));
            typeModelClassList.add(new TypeModelClass("Western Wear",1));
            typeModelClassList.add(new TypeModelClass("Indian Wear",1));
            typeModelClassList.add(new TypeModelClass("Bags",1));
            typeModelClassList.add(new TypeModelClass("Foots Wear",1));
            typeModelClassList.add(new TypeModelClass("Jewellery",1));
            typeModelClassList.add(new TypeModelClass("Lingerie",1));
            typeModelClassList.add(new TypeModelClass("Winter Wear",1));
            typeModelClassList.add(new TypeModelClass("Sports Wear",1));
            typeModelClassList.add(new TypeModelClass("Sleep & Lounge",1));
            typeModelClassList.add(new TypeModelClass("Kids",1));
            typeModelClassList.add(new TypeModelClass("Men",1));
            typeModelClassList.add(new TypeModelClass("Accessories",1));
            typeModelClassList.add(new TypeModelClass("Style Inspiration",1));
            typeModelClassList.add(new TypeModelClass("The Gift Store",1));
            typeModelClassList.add(new TypeModelClass("LUXE",1));
            typeModelClassList.add(new TypeModelClass("SALE",1));

        }
    }

    @Override
    public void OnTypeClicked() {


    }
}