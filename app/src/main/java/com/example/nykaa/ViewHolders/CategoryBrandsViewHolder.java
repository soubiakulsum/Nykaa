package com.example.nykaa.ViewHolders;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.nykaa.Data.ModelClass.NameModelClass;
import com.example.nykaa.R;

public class CategoryBrandsViewHolder extends RecyclerView.ViewHolder {

    private ImageView ivBrandsModels;
    private TextView tvJustInBrandsName;
    private ImageView ivBrandsModels2;
    private TextView tvJustInBrandsName2;


    public CategoryBrandsViewHolder(@NonNull View itemView) {
        super(itemView);
        initViews(itemView);
    }

    private void initViews(View itemView) {
        ivBrandsModels = itemView.findViewById(R.id.ivBrandsModels);
        tvJustInBrandsName = itemView.findViewById(R.id.tvJustInBrandsName);
        ivBrandsModels2 = itemView.findViewById(R.id.ivBrandsModels2);
        tvJustInBrandsName2 = itemView.findViewById(R.id.tvJustInBrandsName2);

    }

    public void setBrandsData(NameModelClass nameModelClass){

        ivBrandsModels.setImageResource(nameModelClass.getIvBrandsName());
        tvJustInBrandsName.setText(nameModelClass.getTvJustInBrandsName());
        ivBrandsModels2.setImageResource(nameModelClass.getIvBrandName2());
        tvJustInBrandsName2.setText(nameModelClass.getTvJustInBrandsName2());



    }
}
