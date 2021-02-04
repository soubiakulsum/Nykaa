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
        buildNameData();
        setRecyclerNameData();
        
    }

    private void setRecyclerNameData() {

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        NameRecyclerView.setLayoutManager(linearLayoutManager);


    }

    private void buildNameData() {

        nameModelClassList.add(new NameModelClass("Just In",0,1,"",2,NameModelClass.TEXT_TYPE));
        nameModelClassList.add(new NameModelClass("New Brands",0,1,"",2,NameModelClass.TEXT_TYPE));
        nameModelClassList.add(new NameModelClass("",R.drawable.levislogo,1,"",1,NameModelClass.IMAGE_STYLES));
        nameModelClassList.add(new NameModelClass("",R.drawable.indyalogo,1,"",1,NameModelClass.IMAGE_STYLES));
        nameModelClassList.add(new NameModelClass("",R.drawable.forever21logo,1,"",1,NameModelClass.IMAGE_STYLES));
        nameModelClassList.add(new NameModelClass("",R.drawable.jockey_logo,1,"",1,NameModelClass.IMAGE_STYLES));
        nameModelClassList.add(new NameModelClass("",R.drawable.global_logo,1,"",1,NameModelClass.IMAGE_STYLES));
        nameModelClassList.add(new NameModelClass("",R.drawable.gap_logo,1,"",1,NameModelClass.IMAGE_STYLES));
        nameModelClassList.add(new NameModelClass("",R.drawable.aerp_logo,1,"",1,NameModelClass.IMAGE_STYLES));
        nameModelClassList.add(new NameModelClass("",R.drawable.w_logo,1,"",1,NameModelClass.IMAGE_STYLES));
        nameModelClassList.add(new NameModelClass("",R.drawable.modelaprolabel,1,"",1,NameModelClass.IMAGE_JUSTIN));
        nameModelClassList.add(new NameModelClass("",R.drawable.korakari,1,"",1,NameModelClass.IMAGE_JUSTIN));
        nameModelClassList.add(new NameModelClass("",R.drawable.model_magre,1,"",1,NameModelClass.IMAGE_JUSTIN));
        nameModelClassList.add(new NameModelClass("",R.drawable.model_klas,1,"",1,NameModelClass.IMAGE_JUSTIN));
        nameModelClassList.add(new NameModelClass("",R.drawable.model_trndydivva,1,"",1,NameModelClass.IMAGE_JUSTIN));
        nameModelClassList.add(new NameModelClass("",R.drawable.isu_model,1,"",1,NameModelClass.IMAGE_JUSTIN));
        nameModelClassList.add(new NameModelClass("",1,1,"",R.drawable.mono_model,NameModelClass.IMAGE_TRENDS));
        nameModelClassList.add(new NameModelClass("",1,1,"",R.drawable.tshirt_model,NameModelClass.IMAGE_TRENDS));
        nameModelClassList.add(new NameModelClass("",1,1,"",R.drawable.jewellery_model,NameModelClass.IMAGE_TRENDS));
        nameModelClassList.add(new NameModelClass("",1,1,"",R.drawable.dress_model,NameModelClass.IMAGE_TRENDS));
        nameModelClassList.add(new NameModelClass("",1,1,"",R.drawable.winter_model,NameModelClass.IMAGE_TRENDS));
        nameModelClassList.add(new NameModelClass("",1,1,"",R.drawable.bridal_model,NameModelClass.IMAGE_TRENDS));

















    }


    private void initViews(View view) {
        NameRecyclerView = view.findViewById(R.id.NameRecyclerView);
    }
}