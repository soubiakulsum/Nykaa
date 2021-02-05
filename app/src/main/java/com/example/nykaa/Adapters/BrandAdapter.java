package com.example.nykaa.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.nykaa.Data.ModelClass.BrandsModels;
import com.example.nykaa.R;
import com.example.nykaa.ViewHolders.BrandsViewHolder;
import com.example.nykaa.clickListener.OnItemsClickListeners;

import java.util.List;

public class BrandAdapter extends RecyclerView.Adapter<BrandsViewHolder> {

    private List<BrandsModels> brandsModels;

    private  OnItemsClickListeners itemsClickListeners;

    public BrandAdapter(List<BrandsModels> brandsModels,OnItemsClickListeners itemsClickListeners) {
        this.brandsModels = brandsModels;
        this.itemsClickListeners=itemsClickListeners;

    }

    @NonNull
    @Override
    public BrandsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater =LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.brands_item_view,parent,false);
        return new BrandsViewHolder(view,itemsClickListeners);
    }

    @Override
    public void onBindViewHolder(@NonNull BrandsViewHolder holder, int position) {

        BrandsModels models = brandsModels.get(position);

        holder.SetData(models);


    }

    @Override
    public int getItemCount() {
        return brandsModels.size();
    }
}
