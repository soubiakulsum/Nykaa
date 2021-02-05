package com.example.nykaa.Data.ModelClass;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class NameModelClass {

    public static final int TEXT_TYPE = 0;
    public static final int IMAGE_STYLES = 1;
    public static final int TEXT_STYLES = 3;
    public static final int IMAGE_JUSTIN = 2;
    public static final int IMAGE_SHOPNEW = 4;
    public static final int IMAGE_TRENDS = 5;


    private String tvTopJustIn;
    private int vLineArrival;
    private String tvStylesFrom;
    private int ivNewStyleBrandName;
    private int ivBrandName2;
    private int ivBrandsName;
    private String tvJustInBrandsName;
    private int ivBrandsName2;
    private String tvJustInBrandsName2;
    private int ivShopNew;
    private int ivNewTrends;
    private int ivNewTrends2;
    private int ItemViewType;


    public NameModelClass(String tvTopJustIn, int vLineArrival, String tvStylesFrom, int ivNewStyleBrandName, int ivBrandName2, int ivBrandsName, String tvJustInBrandsName, int ivBrandsName2, String tvJustInBrandsName2, int ivShopNew, int ivNewTrends, int ivNewTrends2,int ItemViewType) {
        this.tvTopJustIn = tvTopJustIn;
        this.vLineArrival = vLineArrival;
        this.tvStylesFrom = tvStylesFrom;
        this.ivNewStyleBrandName = ivNewStyleBrandName;
        this.ivBrandName2 = ivBrandName2;
        this.ivBrandsName = ivBrandsName;
        this.tvJustInBrandsName = tvJustInBrandsName;
        this.ivBrandsName2 = ivBrandsName2;
        this.tvJustInBrandsName2 = tvJustInBrandsName2;
        this.ivShopNew = ivShopNew;
        this.ivNewTrends = ivNewTrends;
        this.ivNewTrends2 = ivNewTrends2;
    }

//    public NameModelClass(String tvTopJustIn, int vLineArrival) {
//        this.tvTopJustIn = tvTopJustIn;
//        this.vLineArrival = vLineArrival;
//    }
//
//    public NameModelClass(String tvStylesFrom, int ivNewStyleBrandName, int ivBrandName2) {
//        this.tvStylesFrom = tvStylesFrom;
//        this.ivNewStyleBrandName = ivNewStyleBrandName;
//        this.ivBrandName2 = ivBrandName2;
//    }
//
//    public NameModelClass(int ivBrandsName, String tvJustInBrandsName, int ivBrandsName2, String tvJustInBrandsName2) {
//        this.ivBrandsName = ivBrandsName;
//        this.tvJustInBrandsName = tvJustInBrandsName;
//        this.ivBrandsName2 = ivBrandsName2;
//        this.tvJustInBrandsName2 = tvJustInBrandsName2;
//    }
//
//    public NameModelClass(int ivShopNew) {
//        this.ivShopNew = ivShopNew;
//    }
//
//    public NameModelClass(int ivNewTrends, int ivNewTrends2) {
//        this.ivNewTrends = ivNewTrends;
//        this.ivNewTrends2 = ivNewTrends2;
//    }

    public String getTvTopJustIn() {
        return tvTopJustIn;
    }

    public int getvLineArrival() {
        return vLineArrival;
    }

    public String getTvStylesFrom() {
        return tvStylesFrom;
    }

    public int getIvNewStyleBrandName() {
        return ivNewStyleBrandName;
    }

    public int getIvBrandName2() {
        return ivBrandName2;
    }

    public int getIvBrandsName() {
        return ivBrandsName;
    }

    public String getTvJustInBrandsName() {
        return tvJustInBrandsName;
    }

    public int getIvBrandsName2() {
        return ivBrandsName2;
    }

    public String getTvJustInBrandsName2() {
        return tvJustInBrandsName2;
    }

    public int getIvShopNew() {
        return ivShopNew;
    }

    public int getIvNewTrends() {
        return ivNewTrends;
    }

    public int getIvNewTrends2() {
        return ivNewTrends2;
    }
    public int getItemViewType(){
        return ItemViewType;
    }
}
