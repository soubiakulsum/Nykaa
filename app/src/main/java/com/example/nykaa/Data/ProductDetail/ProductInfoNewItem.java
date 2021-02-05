package com.example.nykaa.Data.ProductDetail;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ProductInfoNewItem{

	@SerializedName("title")
	private String title;

	@SerializedName("value")
	private String value;

	@SerializedName("slug")
	private String slug;

	@SerializedName("attributes")
	private List<AttributesItem> attributes;

	public String getTitle(){
		return title;
	}

	public String getValue(){
		return value;
	}

	public String getSlug(){
		return slug;
	}

	public List<AttributesItem> getAttributes(){
		return attributes;
	}
}