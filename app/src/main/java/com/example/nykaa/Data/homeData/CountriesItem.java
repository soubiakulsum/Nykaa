package com.example.nykaa.Data.homeData;

import com.google.gson.annotations.SerializedName;

public class CountriesItem{

	@SerializedName("countryCode")
	private String countryCode;

	@SerializedName("countryName")
	private String countryName;

	@SerializedName("flagUrl")
	private String flagUrl;

	public String getCountryCode(){
		return countryCode;
	}

	public String getCountryName(){
		return countryName;
	}

	public String getFlagUrl(){
		return flagUrl;
	}
}