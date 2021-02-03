package com.example.nykaa.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.nykaa.Data.categoryData.CategoryDataModel;
import com.example.nykaa.R;
import com.example.nykaa.ViewHolders.CategoryItemRecyclerViewHolder;
import com.example.nykaa.clickListener.RecyclerViewClickListener;

import java.util.List;

public class CategoryItemRecyclerViewAdapter extends RecyclerView.Adapter<CategoryItemRecyclerViewHolder> {

    private RecyclerViewClickListener recyclerViewClickListener;
    private List<CategoryDataModel> categoryDataModelList;

    public CategoryItemRecyclerViewAdapter(RecyclerViewClickListener recyclerViewClickListener, List<CategoryDataModel> categoryDataModelList) {
        this.recyclerViewClickListener = recyclerViewClickListener;
        this.categoryDataModelList = categoryDataModelList;
    }

    @NonNull
    @Override
    public CategoryItemRecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.category_item_layout, parent, false);
        return new CategoryItemRecyclerViewHolder(view, recyclerViewClickListener);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryItemRecyclerViewHolder holder, int position) {
        holder.SetData(categoryDataModelList.get(position));
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
