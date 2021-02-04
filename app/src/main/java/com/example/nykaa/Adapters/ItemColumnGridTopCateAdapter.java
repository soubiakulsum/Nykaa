package com.example.nykaa.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.nykaa.Data.homeData.ChildrenItem;
import com.example.nykaa.R;
import com.example.nykaa.ViewHolders.ItemColumnGridTopCateViewHolder;
import com.example.nykaa.clickListener.RecyclerViewClickListener;

import java.util.List;

public class ItemColumnGridTopCateAdapter extends RecyclerView.Adapter<ItemColumnGridTopCateViewHolder> {

    private RecyclerViewClickListener recyclerViewClickListener;
    List<ChildrenItem> list;

    public ItemColumnGridTopCateAdapter(RecyclerViewClickListener recyclerViewClickListener, List<ChildrenItem> list) {
        this.recyclerViewClickListener = recyclerViewClickListener;
        this.list = list;
    }

    @NonNull
    @Override
    public ItemColumnGridTopCateViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_colum_grid_top_cate_layout, parent, false);
        return new ItemColumnGridTopCateViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemColumnGridTopCateViewHolder holder, int position) {
        holder.setData(list.get(position), recyclerViewClickListener);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
