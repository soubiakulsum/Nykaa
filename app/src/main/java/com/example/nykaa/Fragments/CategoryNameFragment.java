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
//        nameModelClassList.add(new NameModelClass("Just In",1,NameModelClass.TEXT_TYPE));
//        nameModelClassList.add(new NameModelClass("New Brands",1,NameModelClass.TEXT_TYPE));
//        nameModelClassList.add(new NameModelClass("",R.drawable.levislogo,R.drawable.indyalogo));
//        nameModelClassList.add(new NameModelClass("",R.drawable.forever21logo,R.drawable.jockey_logo));
//        nameModelClassList.add(new NameModelClass("",R.drawable.global_logo,R.drawable.gap_logo));
//        nameModelClassList.add(new NameModelClass("",R.drawable.aerp_logo,R.drawable.w_logo));
//        nameModelClassList.add(new NameModelClass(R.drawable.modelaprolabel,"Aaprolabel",R.drawable.korakari,"Korakari"));
//        nameModelClassList.add(new NameModelClass(R.drawable.model_magre,"Magre",R.drawable.model_klas,"Klas"));
//        nameModelClassList.add(new NameModelClass(R.drawable.model_trndydivva,"Trendy Divva",R.drawable.isu_model,"IS.U"));
//        nameModelClassList.add(new NameModelClass(R.drawable.modelaprolabel));
//        nameModelClassList.add(new NameModelClass(R.drawable.mono_model,R.drawable.tshirt_model));
//        nameModelClassList.add(new NameModelClass(R.drawable.jewellery_model,R.drawable.dress_model));
//        nameModelClassList.add(new NameModelClass(R.drawable.winter_model,R.drawable.bridal_model));


        nameModelClassList.add(new NameModelClass("Just In",1,"",0,0,0,"",0,"",0,0,0,NameModelClass.TEXT_TYPE));
        nameModelClassList.add(new NameModelClass("New Brands",1,"",0,0,0,"",0,"",0,0,0,NameModelClass.TEXT_TYPE));
        nameModelClassList.add(new NameModelClass("",0,"",R.drawable.levislogo,R.drawable.indyalogo,0,"",0,"",0,0,0,NameModelClass.IMAGE_STYLES));
        nameModelClassList.add(new NameModelClass("",0,"",R.drawable.forever21logo,R.drawable.jockey_logo,0,"",0,"",0,0,0,NameModelClass.IMAGE_STYLES));
        nameModelClassList.add(new NameModelClass("",0,"",R.drawable.global_logo,R.drawable.gap_logo,0,"",0,"",0,0,0,NameModelClass.IMAGE_STYLES));
        nameModelClassList.add(new NameModelClass("",0,"",R.drawable.aerp_logo,R.drawable.w_logo,0,"",0,"",0,0,0,NameModelClass.IMAGE_STYLES));
        nameModelClassList.add(new NameModelClass("",0,"",0,0,R.drawable.modelaprolabel,"Aaprobel",R.drawable.korakari,"Korakari",0,0,0,NameModelClass.IMAGE_JUSTIN));
        nameModelClassList.add(new NameModelClass("",0,"",0,0,R.drawable.model_magre,"Magre",R.drawable.model_klas,"Klas",0,0,0,NameModelClass.IMAGE_JUSTIN));
        nameModelClassList.add(new NameModelClass("",0,"",0,0,R.drawable.model_trndydivva,"Trendy Divva",R.drawable.isu_model,"IS.U",0,0,0,NameModelClass.IMAGE_JUSTIN));
        nameModelClassList.add(new NameModelClass("",0,"",0,0,0,"",0,"",R.drawable.flag_papua_new_guinea,0,0,NameModelClass.IMAGE_SHOPNEW));
        nameModelClassList.add(new NameModelClass("",0,"",0,0,0,"",0,"",0,R.drawable.mono_model,R.drawable.tshirt_model,NameModelClass.IMAGE_TRENDS));
        nameModelClassList.add(new NameModelClass("",0,"",0,0,0,"",0,"",0,R.drawable.jewellery_model,R.drawable.dress_model,NameModelClass.IMAGE_TRENDS));
        nameModelClassList.add(new NameModelClass("",0,"",0,0,0,"",0,"",0,R.drawable.bridal_model,R.drawable.winter_model,NameModelClass.IMAGE_TRENDS));





    }

    private void initViews(View view) {
        NameRecyclerView = view.findViewById(R.id.NameRecyclerView);
    }
}