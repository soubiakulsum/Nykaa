package com.example.nykaa.Fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.nykaa.Data.ModelClass.TypeModelClass;
import com.example.nykaa.R;

import java.util.ArrayList;
import java.util.List;


public class CategoriesFragment extends Fragment {



   public static CategoriesFragment newInstance(){
       CategoriesFragment categoriesFragment = new CategoriesFragment();
       return categoriesFragment;
   }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_categories, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }
}