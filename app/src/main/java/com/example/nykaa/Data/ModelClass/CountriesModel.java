package com.example.nykaa.Data.ModelClass;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class CountriesModel implements Serializable {

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