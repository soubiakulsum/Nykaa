package com.example.nykaa.Data.categoryData;

public class CategoryDataModel {
    public int resource;
    public int type;

    public CategoryDataModel(int resource, int type) {
        this.resource = resource;
        this.type = type;
    }

    public int getResource() {
        return resource;
    }

    public int getType() {
        return type;
    }
}
