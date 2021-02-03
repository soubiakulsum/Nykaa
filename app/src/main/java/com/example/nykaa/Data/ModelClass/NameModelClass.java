package com.example.nykaa.Data.ModelClass;

public class NameModelClass {

    public static final int TEXT_TYPE = 0;
    public static final int IMAGE_STYLES = 1;
    public static final int TEXT_STYLES = 3;
    public static final int IMAGE_JUSTIN = 2;
    public static final int IMAGE_TRENDS = 5;

    private String arrivals;
    private int ivBrandName;
    private int ivBrands;
    private String tvJustInBrands;
    private int ivNewTrends;

    public NameModelClass(String arrivals, int ivBrandName, int ivBrands, String tvJustInBrands, int ivNewTrends) {
        this.arrivals = arrivals;
        this.ivBrandName = ivBrandName;
        this.ivBrands = ivBrands;
        this.tvJustInBrands = tvJustInBrands;
        this.ivNewTrends = ivNewTrends;
    }

    public String getArrivals() {
        return arrivals;
    }

    public int getIvBrandName() {
        return ivBrandName;
    }

    public int getIvBrands() {
        return ivBrands;
    }

    public String getTvJustInBrands() {
        return tvJustInBrands;
    }

    public int getIvNewTrends() {
        return ivNewTrends;
    }
}
