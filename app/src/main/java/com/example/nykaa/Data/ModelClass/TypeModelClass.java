package com.example.nykaa.Data.ModelClass;

public class TypeModelClass {

    private String type;
    private int viewType;

    public TypeModelClass(String type, int viewType) {
        this.type = type;
        this.viewType = viewType;
    }

    public String getType() {
        return type;
    }

    public int getViewType() {
        return viewType;
    }
}
