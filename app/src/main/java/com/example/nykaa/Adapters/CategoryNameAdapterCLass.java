package com.example.nykaa.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.nykaa.Data.ModelClass.NameModelClass;
import com.example.nykaa.R;
import com.example.nykaa.ViewHolders.CategoryArrivalsViewHolder;
import com.example.nykaa.ViewHolders.CategoryBrandsViewHolder;
import com.example.nykaa.ViewHolders.CategoryNewStylesViewHolder;
import com.example.nykaa.ViewHolders.CategoryNewTrendsViewHolder;
import com.example.nykaa.ViewHolders.CategoryShopViewHolder;

import java.util.List;

public class CategoryNameAdapterCLass extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    List<NameModelClass> nameModelClassList;

    public CategoryNameAdapterCLass(List<NameModelClass> nameModelClassList) {
        this.nameModelClassList = nameModelClassList;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        switch (viewType) {
            case NameModelClass.TEXT_TYPE:
                View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.text_item_layout, parent, false);
                return new CategoryArrivalsViewHolder(view);

            case NameModelClass.IMAGE_STYLES:
                View stylesview = LayoutInflater.from(parent.getContext()).inflate(R.layout.newstyles_item_layout, parent, false);
                return new CategoryNewStylesViewHolder(stylesview);

            case NameModelClass.IMAGE_JUSTIN:
                View justInView = LayoutInflater.from(parent.getContext()).inflate(R.layout.top_item_layout, parent, false);
                return new CategoryBrandsViewHolder(justInView);

            case NameModelClass.IMAGE_SHOPNEW:
                View ShopNewview = LayoutInflater.from(parent.getContext()).inflate(R.layout.shopnew_item_layout, parent, false);
                return new CategoryShopViewHolder(ShopNewview);

            case NameModelClass.IMAGE_TRENDS:
                View TrendsView = LayoutInflater.from(parent.getContext()).inflate(R.layout.newbrands_item_layout, parent, false);
                return new CategoryNewTrendsViewHolder(TrendsView);
        }

        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        int viewType = nameModelClassList.get(position).getItemViewType();
        NameModelClass nameModelClass = nameModelClassList.get(position);

        switch (viewType) {
            case NameModelClass.TEXT_TYPE:

                if (holder instanceof CategoryArrivalsViewHolder){
                    ((CategoryArrivalsViewHolder) holder).setArrivalsData(nameModelClass);
                }
                break;

            case NameModelClass.IMAGE_STYLES:
                if (holder instanceof CategoryNewStylesViewHolder){
                    ((CategoryNewStylesViewHolder) holder).setNewStylesData(nameModelClass);
                }
                break;

            case NameModelClass.IMAGE_JUSTIN:

                if (holder instanceof CategoryBrandsViewHolder){
                    ((CategoryBrandsViewHolder) holder).setBrandsData(nameModelClass);
                }
                break;

            case NameModelClass.IMAGE_TRENDS:

                if (holder instanceof CategoryNewTrendsViewHolder){
                    ((CategoryNewTrendsViewHolder) holder).setTrendsData(nameModelClass);
                }
                break;
        }
    }

    @Override
    public int getItemCount() {
        return nameModelClassList.size();
    }

    @Override
    public int getItemViewType(int position) {
        int ViewType = nameModelClassList.get(position).getItemViewType();
        return ViewType;
    }
}
