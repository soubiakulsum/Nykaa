package com.example.nykaa.Data.ModelClass;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class WidgetsModel implements Serializable {

	@SerializedName("widgetData")
	private WidgetDataModel widgetData;

	@SerializedName("isFetching")
	private boolean isFetching;

	@SerializedName("isFetchingError")
	private boolean isFetchingError;

	@SerializedName("productID")
	private String productID;

	public WidgetDataModel getWidgetData(){
		return widgetData;
	}

	public boolean isIsFetching(){
		return isFetching;
	}

	public boolean isIsFetchingError(){
		return isFetchingError;
	}

	public String getProductID(){
		return productID;
	}
}