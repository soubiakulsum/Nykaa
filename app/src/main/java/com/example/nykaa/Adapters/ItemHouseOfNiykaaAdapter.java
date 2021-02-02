package com.example.nykaa.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.nykaa.Data.homeData.ChildrenItem;
import com.example.nykaa.R;
import com.example.nykaa.ViewHolders.ItemHouseOfNykaaViewHolder;
import com.example.nykaa.clickListener.RecyclerViewClickListener;

import java.util.List;

public class ItemHouseOfNiykaaAdapter extends RecyclerView.Adapter<ItemHouseOfNykaaViewHolder> {

    private List<ChildrenItem> list;
    private RecyclerViewClickListener recyclerViewClickListener;

    public ItemHouseOfNiykaaAdapter(List<ChildrenItem> list, RecyclerViewClickListener recyclerViewClickListener) {
        this.list = list;
        this.recyclerViewClickListener = recyclerViewClickListener;
    }

    @NonNull
    @Override
    public ItemHouseOfNykaaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_house_of_nykka_layout, parent, false);
        return new ItemHouseOfNykaaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemHouseOfNykaaViewHolder holder, int position) {
        holder.setData(list.get(position), recyclerViewClickListener);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
