package com.example.nykaa.Data.ProductDetail;

import com.google.gson.annotations.SerializedName;

public class TagsItem{

	@SerializedName("tag")
	private String tag;

	@SerializedName("type")
	private String type;

	public String getTag(){
		return tag;
	}

	public String getType(){
		return type;
	}
}