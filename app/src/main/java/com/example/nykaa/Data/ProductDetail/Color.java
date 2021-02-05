package com.example.nykaa.Data.ProductDetail;

import com.google.gson.annotations.SerializedName;

public class Color{

	@SerializedName("name")
	private String name;

	@SerializedName("colorCode")
	private String colorCode;

	public String getName(){
		return name;
	}

	public String getColorCode(){
		return colorCode;
	}
}