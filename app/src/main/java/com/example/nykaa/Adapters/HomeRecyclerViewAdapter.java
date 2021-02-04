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
import com.example.nykaa.ViewHolders.DummyViewHolder;
import com.example.nykaa.ViewHolders.HomeImageTypeViewHolder;
import com.example.nykaa.ViewHolders.HouseOfNykaaViewHolder;
import com.example.nykaa.ViewHolders.InFocusViewHolder;
import com.example.nykaa.ViewHolders.SlidingWidgetRecyclerViewHolder;
import com.example.nykaa.clickListener.RecyclerViewClickListener;

import java.util.List;

public class HomeRecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private RecyclerViewClickListener recyclerViewClickListener;
    private List<LandingpageDataItem> list;

    public HomeRecyclerViewAdapter(RecyclerViewClickListener recyclerViewClickListener, List<LandingpageDataItem> list) {
        this.recyclerViewClickListener = recyclerViewClickListener;
        this.list = list;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        if (viewType == 0) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.category_recycler_view, parent, false);
            return new CategoryRecyclerViewHolder(view);
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

        if (viewType == CategoryConstant.HOUSE_OF_NYKAA) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.house_of_nykaa_layout, parent, false);
            return new HouseOfNykaaViewHolder(view);
        }

        if (viewType == CategoryConstant.IN_FOCUS_VIEW_HOLDER) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.in_focus_layout, parent, false);
            return new InFocusViewHolder(view);
        }
        if (viewType == -1) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.dummy_layout, parent, false);
            return new DummyViewHolder(view);
        }

        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if (position == 0) {
            if (holder instanceof CategoryRecyclerViewHolder) {
                ((CategoryRecyclerViewHolder) holder).setData(selectedCategory,recyclerViewClickListener);
            }
        }
        if (holder instanceof HomeImageTypeViewHolder) {
            ((HomeImageTypeViewHolder) holder).setData(list.get(position - 1), recyclerViewClickListener);
        }
        if (holder instanceof SlidingWidgetRecyclerViewHolder) {
            ((SlidingWidgetRecyclerViewHolder) holder).setData(list.get(position - 1), recyclerViewClickListener);
        }
        if (holder instanceof ColumnGridRecyclerViewHolder) {
            ((ColumnGridRecyclerViewHolder) holder).setData(list.get(position - 1), recyclerViewClickListener);
        }
        if (holder instanceof ColumnGridTopCateViewHolder) {
            ((ColumnGridTopCateViewHolder) holder).setData(list.get(position - 1), recyclerViewClickListener);
        }
        if (holder instanceof HouseOfNykaaViewHolder) {
            ((HouseOfNykaaViewHolder) holder).setData(list.get(position - 1), recyclerViewClickListener);
        }
        if (holder instanceof InFocusViewHolder) {
            ((InFocusViewHolder) holder).setData(list.get(position - 1), recyclerViewClickListener);
        }
        if (holder instanceof DummyViewHolder) {

        }
    }

    @Override
    public int getItemViewType(int position) {
        if (position == 0) {
            return 0;
        }

        Log.d("nott", position + "");
        if (list.get(position - 1).getWidgetData().getWtype().equals(CategoryConstant.CAROUSEL)) {
            if (list.get(position - 1).getWidgetData().getChildren().get(0).getWtype().equals(CategoryConstant.CAROUSEL_CHILD)) {
                if (list.get(position - 1).getWidgetData().getChildren().get(0).getChildren().get(0).getWtype().equals(CategoryConstant.IMAGE)) {
                    return CategoryConstant.IMAGE_VIEW_HOLDER;
                }
            }
        }
        if (list.get(position - 1).getWidgetData().getWtype().equals(CategoryConstant.SLIDING_WIDGET)) {
            if (list.get(position - 1).getWidgetData().getChildren().get(0).getWtype().equals(CategoryConstant.BANNER)) {
                if (list.get(position - 1).getWidgetData().getChildren().get(0).getChildren().get(0).getWtype().equals(CategoryConstant.IMAGE)) {
                    return CategoryConstant.SLIDING_WIDGET_BANNER_IMAGE_VIEW_HOLDER;
                }
            }
        }

        if (list.get(position - 1).getWidgetData().getWtype().equals(CategoryConstant.COLUMN_GRID)) {
            if (list.get(position - 1).getWidgetData().getChildren().get(0).getWtype().equals(CategoryConstant.BANNER)) {
                if (list.get(position - 1).getWidgetData().getChildren().get(0).getChildren().get(0).getWtype().equals(CategoryConstant.IMAGE)) {
                    if (list.get(position - 1).getInventoryName().equals("hp.top-category")) {
                        return CategoryConstant.COLUMN_GRID_BANNER_IMAGE_VIEW_HOLDER_4;
                    }
                    if (list.get(position - 1).getInventoryName().equals("hp.house-of-nykaa")) {
                        return CategoryConstant.HOUSE_OF_NYKAA;
                    }
                    if (list.get(position - 1).getInventoryName().equals("hp.best-selling-brands")) {
                        return CategoryConstant.HOUSE_OF_NYKAA;
                    }
                    if (list.get(position - 1).getInventoryName().equals("hp.sporty-selects") || list.get(position - 1).getInventoryName().equals("hp.watch-out")) {
                        return CategoryConstant.HOUSE_OF_NYKAA;
                    }
                    if (list.get(position - 1).getWidgetData().getParameters().getNo_of_cols() != null && list.get(position - 1).getWidgetData().getParameters().getNo_of_cols().equals("2")) {
                        return CategoryConstant.HOUSE_OF_NYKAA;
                    }
                    if (list.get(position - 1).getWidgetData().getParameters().getNo_of_cols() != null && list.get(position - 1).getWidgetData().getParameters().getNo_of_cols().equals("3")) {
                        return -1;
                    }

                    return CategoryConstant.COLUMN_GRID_BANNER_IMAGE_VIEW_HOLDER;
                }
            }
        }
        if (list.get(position - 1).getWidgetData().getWtype().equals(CategoryConstant.IN_FOCUS)) {
            if (list.get(position - 1).getWidgetData().getChildren().get(0).getWtype().equals(CategoryConstant.BANNER)) {
                if (list.get(position - 1).getWidgetData().getChildren().get(0).getChildren().get(0).getWtype().equals(CategoryConstant.IMAGE)) {
                    return CategoryConstant.IN_FOCUS_VIEW_HOLDER;
                }
            }
        }

        return -1;
    }

    @Override
    public int getItemCount() {
        return list.size() + 1;
    }

    private int selectedCategory = CategoryConstant.WOMEN;

    public void UpdataData(int selectedCategory, List<LandingpageDataItem> list) {
        this.selectedCategory = selectedCategory;
        this.list = list;
        notifyDataSetChanged();
    }

    //TAGGED_SLIDING_WIDGET
}
