package com.example.nykaa.Data.ModelClass;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class CurrenciesModel implements Serializable {

	@SerializedName("currencyCode")
	private String currencyCode;

	@SerializedName("currencyDisplayValue")
	private String currencyDisplayValue;

	public String getCurrencyCode(){
		return currencyCode;
	}

	public String getCurrencyDisplayValue(){
		return currencyDisplayValue;
	}
}