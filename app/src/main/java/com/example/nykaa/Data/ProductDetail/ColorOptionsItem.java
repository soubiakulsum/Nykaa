package com.example.nykaa.Data.ProductDetail;

import com.google.gson.annotations.SerializedName;

public class ColorOptionsItem{

	@SerializedName("action_url")
	private String actionUrl;

	@SerializedName("name")
	private String name;

	@SerializedName("colorCode")
	private String colorCode;

	@SerializedName("sku")
	private String sku;

	@SerializedName("url")
	private String url;

	public String getActionUrl(){
		return actionUrl;
	}

	public String getName(){
		return name;
	}

	public String getColorCode(){
		return colorCode;
	}

	public String getSku(){
		return sku;
	}

	public String getUrl(){
		return url;
	}
}