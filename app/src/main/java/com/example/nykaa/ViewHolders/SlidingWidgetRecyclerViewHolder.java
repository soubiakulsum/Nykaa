package com.example.nykaa.ViewHolders;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.nykaa.Adapters.ItemSlidingWidgetRecyclerViewAdapter;
import com.example.nykaa.Data.homeData.ChildrenItem;
import com.example.nykaa.Data.homeData.LandingpageDataItem;
import com.example.nykaa.R;
import com.example.nykaa.clickListener.RecyclerViewClickListener;

import java.util.List;

public class SlidingWidgetRecyclerViewHolder extends RecyclerView.ViewHolder {

    public SlidingWidgetRecyclerViewHolder(@NonNull View itemView) {
        super(itemView);
        initView(itemView);
    }

    private TextView textView;
    private RecyclerView recyclerview;
    private View view;

    private void initView(View itemView) {
        view = itemView;
        textView = itemView.findViewById(R.id.textView);
        recyclerview = itemView.findViewById(R.id.recyclerview);
    }

    public void setData(LandingpageDataItem landingpageDataItem, RecyclerViewClickListener recyclerViewClickListener) {
        textView.setText(landingpageDataItem.getWidgetData().getParameters().getTitle());

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(view.getContext(), LinearLayoutManager.HORIZONTAL, false);
        ItemSlidingWidgetRecyclerViewAdapter itemSlidingWidgetRecyclerViewAdapter = new ItemSlidingWidgetRecyclerViewAdapter(landingpageDataItem.getWidgetData().getChildren(), recyclerViewClickListener);
        recyclerview.setLayoutManager(linearLayoutManager);
        recyclerview.setAdapter(itemSlidingWidgetRecyclerViewAdapter);

    }
}
