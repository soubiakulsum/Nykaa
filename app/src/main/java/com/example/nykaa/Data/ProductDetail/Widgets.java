package com.example.nykaa.Data.ProductDetail;

import com.google.gson.annotations.SerializedName;

public class Widgets{

	@SerializedName("productID")
	private String productID;

	@SerializedName("widgetData")
	private WidgetData widgetData;

	@SerializedName("isFetching")
	private boolean isFetching;

	@SerializedName("isFetchingError")
	private boolean isFetchingError;

	public String getProductID(){
		return productID;
	}

	public WidgetData getWidgetData(){
		return widgetData;
	}

	public boolean isIsFetching(){
		return isFetching;
	}

	public boolean isIsFetchingError(){
		return isFetchingError;
	}
}