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

import com.example.nykaa.Adapters.CategoryNameAdapterCLass;
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

    public static CategoryNameFragment newInstance(String s) {

        CategoryNameFragment fragment = new CategoryNameFragment();
        return fragment;
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
        buildNameData();
        setRecyclerNameData();
    }

    private void setRecyclerNameData() {

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        NameRecyclerView.setLayoutManager(linearLayoutManager);
        CategoryNameAdapterCLass categoryNameAdapterCLass = new CategoryNameAdapterCLass(nameModelClassList);
        NameRecyclerView.setAdapter(categoryNameAdapterCLass);

    }

    private void buildNameData() {
        nameModelClassList.add(new NameModelClass("Just In",1));
        nameModelClassList.add(new NameModelClass("New Brands",1));
        nameModelClassList.add(new NameModelClass("",R.drawable.levislogo,R.drawable.indyalogo));
        nameModelClassList.add(new NameModelClass("",R.drawable.forever21logo,R.drawable.jockey_logo));
        nameModelClassList.add(new NameModelClass("",R.drawable.global_logo,R.drawable.gap_logo));
        nameModelClassList.add(new NameModelClass("",R.drawable.aerp_logo,R.drawable.w_logo));
        nameModelClassList.add(new NameModelClass(R.drawable.modelaprolabel,"",R.drawable.korakari,""));
        nameModelClassList.add(new NameModelClass(R.drawable.model_magre,"",R.drawable.model_klas,""));
        nameModelClassList.add(new NameModelClass(R.drawable.model_trndydivva,"",R.drawable.isu_model,""));
        nameModelClassList.add(new NameModelClass(R.drawable.modelaprolabel));
        nameModelClassList.add(new NameModelClass(R.drawable.mono_model,R.drawable.tshirt_model));
        nameModelClassList.add(new NameModelClass(R.drawable.jewellery_model,R.drawable.dress_model));
        nameModelClassList.add(new NameModelClass(R.drawable.winter_model,R.drawable.bridal_model));

    }

    private void initViews(View view) {
        NameRecyclerView = view.findViewById(R.id.NameRecyclerView);
    }
}