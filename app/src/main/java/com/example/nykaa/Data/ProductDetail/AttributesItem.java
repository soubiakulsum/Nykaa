package com.example.nykaa.Data.ProductDetail;

import com.google.gson.annotations.SerializedName;

public class AttributesItem{

	@SerializedName("value")
	private String value;

	@SerializedName("key")
	private String key;

	public String getValue(){
		return value;
	}

	public String getKey(){
		return key;
	}
}