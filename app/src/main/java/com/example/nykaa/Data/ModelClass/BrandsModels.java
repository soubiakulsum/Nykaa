package com.example.nykaa.Data.ModelClass;

import androidx.recyclerview.widget.RecyclerView;

public class BrandsModels {

    private String BrandsList;

    public BrandsModels(String brandsList) {
        BrandsList = brandsList;
    }

    public String getBrandsList() {
        return BrandsList;
    }
}
