package com.example.nykaa.Data.listItemsData;

import com.google.gson.annotations.SerializedName;

public class Range{

	@SerializedName("min")
	private int min;

	@SerializedName("max")
	private int max;

	@SerializedName("productCount")
	private int productCount;

	public int getMin(){
		return min;
	}

	public int getMax(){
		return max;
	}

	public int getProductCount(){
		return productCount;
	}
}