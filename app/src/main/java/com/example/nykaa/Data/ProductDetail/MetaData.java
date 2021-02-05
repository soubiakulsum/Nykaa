package com.example.nykaa.Data.ProductDetail;

import com.google.gson.annotations.SerializedName;

public class MetaData{

	@SerializedName("imgUrl")
	private String imgUrl;

	@SerializedName("amount")
	private double amount;

	@SerializedName("keywords")
	private String keywords;

	@SerializedName("description")
	private String description;

	@SerializedName("title")
	private String title;

	@SerializedName("productUrl")
	private String productUrl;

	public String getImgUrl(){
		return imgUrl;
	}

	public double getAmount(){
		return amount;
	}

	public String getKeywords(){
		return keywords;
	}

	public String getDescription(){
		return description;
	}

	public String getTitle(){
		return title;
	}

	public String getProductUrl(){
		return productUrl;
	}
}