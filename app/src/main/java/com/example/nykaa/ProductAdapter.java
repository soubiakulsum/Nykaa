package com.example.nykaa;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<ProductViewHolder> {

    private List<ProductModelClass>productModelClassList;

    public ProductAdapter(List<ProductModelClass> productModelClassList) {
        this.productModelClassList = productModelClassList;
    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.product_item_layout,parent,false);
        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {
        ProductModelClass productModelClass = productModelClassList.get(position);
        holder.setData(productModelClass);

    }

    @Override
    public int getItemCount() {
        return productModelClassList.size();
    }
}
