package com.example.nykaa.ViewHolders;

import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.nykaa.Data.ModelClass.BrandsModels;
import com.example.nykaa.R;
import com.example.nykaa.clickListener.OnItemsClickListeners;


public class BrandsViewHolder extends RecyclerView.ViewHolder {
    private TextView mTvBrandList;

    private OnItemsClickListeners itemsClickListeners;

    FragmentManager fragmentManager;

    public BrandsViewHolder(@NonNull View itemView,OnItemsClickListeners itemsClickListeners) {
        super(itemView);


        this.itemsClickListeners=itemsClickListeners;



        initViews(itemView);
    }

    private void initViews(View itemView) {
        mTvBrandList=itemView.findViewById(R.id.BrandList);


    }

    public void SetData(BrandsModels brandsModels){

        mTvBrandList.setText(brandsModels.getBrandsList());

        mTvBrandList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {




                Toast.makeText(v.getContext(), ""+mTvBrandList.getText().toString(), Toast.LENGTH_SHORT).show();




            }
        });

    }
}
