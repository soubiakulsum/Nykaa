package com.example.nykaa.Adapters;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.nykaa.Data.constants.CategoryConstant;
import com.example.nykaa.Data.homeData.LandingpageDataItem;
import com.example.nykaa.R;
import com.example.nykaa.ViewHolders.CategoryRecyclerViewHolder;
import com.example.nykaa.ViewHolders.ColumnGridRecyclerViewHolder;
import com.example.nykaa.ViewHolders.ColumnGridTopCateViewHolder;
import com.example.nykaa.ViewHolders.ExploreHolder;
import com.example.nykaa.ViewHolders.HomeImageTypeViewHolder;
import com.example.nykaa.ViewHolders.HouseOfNykaaViewHolder;
import com.example.nykaa.ViewHolders.SlidingWidgetRecyclerViewHolder;
import com.example.nykaa.clickListener.RecyclerViewClickListener;

import java.util.List;

public class SalesAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private RecyclerViewClickListener recyclerViewClickListener;
    private List<LandingpageDataItem> list;

    public SalesAdapter(RecyclerViewClickListener recyclerViewClickListener, List<LandingpageDataItem> list) {
        this.recyclerViewClickListener = recyclerViewClickListener;
        this.list = list;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        if (viewType == CategoryConstant.HOUSE_OF_NYKAA) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.house_of_nykaa_layout, parent, false);
            return new HouseOfNykaaViewHolder(view);
        }
        if (CategoryConstant.IMAGE_VIEW_HOLDER == viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.home_item_type_image, parent, false);
            return new HomeImageTypeViewHolder(view);
        }
        if (viewType == CategoryConstant.SLIDING_WIDGET_BANNER_IMAGE_VIEW_HOLDER) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.sliding_widget_layout, parent, false);
            return new SlidingWidgetRecyclerViewHolder(view);
        }
        if (viewType == CategoryConstant.COLUMN_GRID_BANNER_IMAGE_VIEW_HOLDER) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.column_grid_view_layout, parent, false);
            return new ColumnGridRecyclerViewHolder(view);
        }
        if (viewType == CategoryConstant.COLUMN_GRID_BANNER_IMAGE_VIEW_HOLDER_4) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.column_grid_top_cate_layout, parent, false);
            return new ColumnGridTopCateViewHolder(view);
        }

        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {


        if (holder instanceof HouseOfNykaaViewHolder) {
            ((HouseOfNykaaViewHolder) holder).setData(list.get(position), recyclerViewClickListener);
        }

        if (holder instanceof HomeImageTypeViewHolder) {
            ((HomeImageTypeViewHolder) holder).setData(list.get(position), recyclerViewClickListener);
        }
        if (holder instanceof SlidingWidgetRecyclerViewHolder) {
            ((SlidingWidgetRecyclerViewHolder) holder).setData(list.get(position), recyclerViewClickListener);
        }
        if (holder instanceof ColumnGridRecyclerViewHolder) {
            ((ColumnGridRecyclerViewHolder) holder).setData(list.get(position), recyclerViewClickListener);
        }
        if (holder instanceof ColumnGridTopCateViewHolder) {
            ((ColumnGridTopCateViewHolder) holder).setData(list.get(position), recyclerViewClickListener);
        }

    }

    @Override
    public int getItemViewType(int position) {

        Log.d("nott", position + "");
        if (list.get(position).getWidgetData().getWtype().equals(CategoryConstant.CAROUSEL)) {
            if (list.get(position).getWidgetData().getChildren().get(0).getWtype().equals(CategoryConstant.CAROUSEL_CHILD)) {
                if (list.get(position).getWidgetData().getChildren().get(0).getChildren().get(0).getWtype().equals(CategoryConstant.IMAGE)) {
                    return CategoryConstant.IMAGE_VIEW_HOLDER;
                }
            }
        }
        if (list.get(position).getWidgetData().getWtype().equals(CategoryConstant.SLIDING_WIDGET)) {
            if (list.get(position).getWidgetData().getChildren().get(0).getWtype().equals(CategoryConstant.BANNER)) {
                if (list.get(position).getWidgetData().getChildren().get(0).getChildren().get(0).getWtype().equals(CategoryConstant.IMAGE)) {
                    return CategoryConstant.SLIDING_WIDGET_BANNER_IMAGE_VIEW_HOLDER;
                }
            }
        }

        if (list.get(position).getWidgetData().getWtype().equals(CategoryConstant.COLUMN_GRID)) {
            if (list.get(position).getWidgetData().getChildren().get(0).getWtype().equals(CategoryConstant.BANNER)) {
                if (list.get(position).getWidgetData().getChildren().get(0).getChildren().get(0).getWtype().equals(CategoryConstant.IMAGE)) {
                    if (list.get(position).getInventoryName().equals("hp.top-category")) {
                        return CategoryConstant.COLUMN_GRID_BANNER_IMAGE_VIEW_HOLDER_4;
                    }
                    if (list.get(position).getInventoryName().equals("hp.house-of-nykaa")) {
                        return CategoryConstant.HOUSE_OF_NYKAA;
                    }
                    if (list.get(position).getInventoryName().equals("hp.best-selling-brands")) {
                        return CategoryConstant.HOUSE_OF_NYKAA;
                    }
                    return CategoryConstant.COLUMN_GRID_BANNER_IMAGE_VIEW_HOLDER;
                }
            }
        }

        return CategoryConstant.COLUMN_GRID_BANNER_IMAGE_VIEW_HOLDER;

    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
