package com.example.nykaa.Data.ProductDetail;

import com.google.gson.annotations.SerializedName;

public class CurrenciesItem{

	@SerializedName("currencyDisplayValue")
	private String currencyDisplayValue;

	@SerializedName("currencyCode")
	private String currencyCode;

	public String getCurrencyDisplayValue(){
		return currencyDisplayValue;
	}

	public String getCurrencyCode(){
		return currencyCode;
	}
}