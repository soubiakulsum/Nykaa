package com.example.nykaa.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.nykaa.Data.homeData.ChildrenItem;
import com.example.nykaa.R;
import com.example.nykaa.ViewHolders.ItemSlidingWidgetRecyclerViewHolder;
import com.example.nykaa.clickListener.RecyclerViewClickListener;

import java.util.List;

public class ItemSlidingWidgetRecyclerViewAdapter extends RecyclerView.Adapter<ItemSlidingWidgetRecyclerViewHolder> {

    private List<ChildrenItem> list;
    private RecyclerViewClickListener recyclerViewClickListener;

    public ItemSlidingWidgetRecyclerViewAdapter(List<ChildrenItem> list, RecyclerViewClickListener recyclerViewClickListener) {
        this.list = list;
        this.recyclerViewClickListener = recyclerViewClickListener;
    }

    @NonNull
    @Override
    public ItemSlidingWidgetRecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_sliding_widget, parent, false);
        return new ItemSlidingWidgetRecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemSlidingWidgetRecyclerViewHolder holder, int position) {
        holder.SetData(list.get(position), recyclerViewClickListener);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
