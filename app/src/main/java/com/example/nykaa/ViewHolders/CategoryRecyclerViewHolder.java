package com.example.nykaa.ViewHolders;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.nykaa.Adapters.CategoryItemRecyclerViewAdapter;
import com.example.nykaa.Data.categoryData.CategoryDataModel;
import com.example.nykaa.Data.constants.CategoryConstant;
import com.example.nykaa.R;
import com.example.nykaa.clickListener.RecyclerViewClickListener;

import java.util.ArrayList;
import java.util.List;

public class CategoryRecyclerViewHolder extends RecyclerView.ViewHolder {

    public CategoryRecyclerViewHolder(@NonNull View itemView) {
        super(itemView);
        initView(itemView);
    }

    private RecyclerView categoryRecyclerView;

    private View itemVIew;
    private LinearLayoutManager linearLayoutManager;

    private void initView(View itemView) {
        itemVIew = itemView;
        categoryRecyclerView = itemView.findViewById(R.id.categoryRecyclerView);
        linearLayoutManager = new LinearLayoutManager(itemView.getContext(), LinearLayoutManager.HORIZONTAL, false);

    }

    public void setData(int selectedCategory, RecyclerViewClickListener recyclerViewClickListener) {
        if (selectedCategory == CategoryConstant.WOMEN) {
            BuildData();
        } else if (selectedCategory == CategoryConstant.MEN) {
            BuildDataMen();
        }else if (selectedCategory == CategoryConstant.KIDS) {
            BuildDataKid();
        }else if (selectedCategory == CategoryConstant.LUXE) {
            BuildDataLuxe();
        }

        CategoryItemRecyclerViewAdapter categoryItemRecyclerViewAdapter = new CategoryItemRecyclerViewAdapter(recyclerViewClickListener, list);
        categoryRecyclerView.setLayoutManager(linearLayoutManager);
        categoryRecyclerView.setAdapter(categoryItemRecyclerViewAdapter);
    }

    private List<CategoryDataModel> list = new ArrayList<>();

    private void BuildData() {
        list = new ArrayList<>();
        list.add(new CategoryDataModel(R.drawable.women, CategoryConstant.WOMEN));
        list.add(new CategoryDataModel(R.drawable.men, CategoryConstant.MEN));
        list.add(new CategoryDataModel(R.drawable.kids, CategoryConstant.KIDS));
        list.add(new CategoryDataModel(R.drawable.luxe, CategoryConstant.LUXE));
    }

    private void BuildDataMen() {
        list = new ArrayList<>();
        list.add(new CategoryDataModel(R.drawable.men_high, CategoryConstant.MEN));
        list.add(new CategoryDataModel(R.drawable.women_nrml, CategoryConstant.WOMEN));
        list.add(new CategoryDataModel(R.drawable.kids, CategoryConstant.KIDS));
        list.add(new CategoryDataModel(R.drawable.luxe, CategoryConstant.LUXE));
    }
    private void BuildDataKid() {
        list = new ArrayList<>();
        list.add(new CategoryDataModel(R.drawable.kids, CategoryConstant.KIDS));
        list.add(new CategoryDataModel(R.drawable.women_nrml, CategoryConstant.WOMEN));
        list.add(new CategoryDataModel(R.drawable.men, CategoryConstant.MEN));
        list.add(new CategoryDataModel(R.drawable.luxe, CategoryConstant.LUXE));
    }
    private void BuildDataLuxe() {
        list = new ArrayList<>();
        list.add(new CategoryDataModel(R.drawable.luxe_high, CategoryConstant.LUXE));
        list.add(new CategoryDataModel(R.drawable.women_nrml, CategoryConstant.WOMEN));
        list.add(new CategoryDataModel(R.drawable.men, CategoryConstant.MEN));
        list.add(new CategoryDataModel(R.drawable.kids, CategoryConstant.KIDS));

    }
}
