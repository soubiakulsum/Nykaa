package com.example.nykaa.Data.ProductDetail;

import com.google.gson.annotations.SerializedName;

public class SkuData{

	@SerializedName("product")
	private Product product;

	public Product getProduct(){
		return product;
	}
}