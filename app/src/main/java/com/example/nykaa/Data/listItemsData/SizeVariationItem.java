package com.example.nykaa.Data.listItemsData;

import com.google.gson.annotations.SerializedName;

public class SizeVariationItem{

	@SerializedName("id")
	private String id;

	@SerializedName("title")
	private String title;

	public String getId(){
		return id;
	}

	public String getTitle(){
		return title;
	}
}