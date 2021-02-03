package com.example.nykaa.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.nykaa.Data.constants.CategoryConstant;
import com.example.nykaa.Data.listItemsData.JsonMember1Item;
import com.example.nykaa.R;
import com.example.nykaa.ViewHolders.ItemListViewHolder;
import com.example.nykaa.ViewHolders.SpecialItemListViewHolder;
import com.example.nykaa.clickListener.RecyclerViewClickListener;

import java.util.List;

public class ItemListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<JsonMember1Item> list;
    private RecyclerViewClickListener recyclerViewClickListener;

    public ItemListAdapter(List<JsonMember1Item> list, RecyclerViewClickListener recyclerViewClickListener) {
        this.list = list;
        this.recyclerViewClickListener = recyclerViewClickListener;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (viewType == CategoryConstant.NORMAL_ITEM_VIEW) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_layout, parent, false);
            return new ItemListViewHolder(view);
        }
        if (viewType == CategoryConstant.SPECIAL_ITEM_VIEW) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.special_item_list_layout, parent, false);
            return new SpecialItemListViewHolder(view);
        }

        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof ItemListViewHolder) {
            ((ItemListViewHolder) holder).setData(list.get(position), recyclerViewClickListener);
        }

        if (holder instanceof SpecialItemListViewHolder) {
            ((SpecialItemListViewHolder) holder).setData(list.get(position), recyclerViewClickListener);
        }
    }

    @Override
    public int getItemViewType(int position) {

        if (list.get(position).getGridImageUrl() != null) {
            return CategoryConstant.SPECIAL_ITEM_VIEW;
        }
        return CategoryConstant.NORMAL_ITEM_VIEW;
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
