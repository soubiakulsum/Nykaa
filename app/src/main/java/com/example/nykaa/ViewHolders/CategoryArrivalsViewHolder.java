package com.example.nykaa.ViewHolders;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.nykaa.Data.ModelClass.NameModelClass;
import com.example.nykaa.R;

public class CategoryArrivalsViewHolder extends RecyclerView.ViewHolder {

    private TextView tvNewBrands;
    private View vLineTextBrand;

    public CategoryArrivalsViewHolder(@NonNull View itemView) {
        super(itemView);
        initViews(itemView);
    }

    private void initViews(View itemView) {
        tvNewBrands = itemView.findViewById(R.id.tvNewBrands);
        vLineTextBrand = itemView.findViewById(R.id.vLineTextBrand);
    }

    public void setArrivalsData(NameModelClass nameModelClass){
        tvNewBrands.setText(nameModelClass.getArrivals());



    }
}
