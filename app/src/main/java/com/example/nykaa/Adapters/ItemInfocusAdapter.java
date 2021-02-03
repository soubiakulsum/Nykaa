package com.example.nykaa.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.nykaa.Data.homeData.ChildrenItem;
import com.example.nykaa.R;
import com.example.nykaa.ViewHolders.ItemInFocusViewHolder;
import com.example.nykaa.clickListener.RecyclerViewClickListener;

import java.util.List;

public class ItemInfocusAdapter extends RecyclerView.Adapter<ItemInFocusViewHolder> {

    private List<ChildrenItem> list;
    private RecyclerViewClickListener recyclerViewClickListener;

    public ItemInfocusAdapter(List<ChildrenItem> list, RecyclerViewClickListener recyclerViewClickListener) {
        this.list = list;
        this.recyclerViewClickListener = recyclerViewClickListener;
    }

    @NonNull
    @Override
    public ItemInFocusViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_in_focus_layout, parent, false);
        return new ItemInFocusViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemInFocusViewHolder holder, int position) {
        holder.setData(list.get(position+1), recyclerViewClickListener);
    }

    @Override
    public int getItemCount() {
        return list.size()-1;
    }
}
