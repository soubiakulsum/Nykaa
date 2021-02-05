package com.example.nykaa.Data.ModelClass;

import java.util.List;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class InternationalizationModel implements Serializable {

	@SerializedName("countries")
	private List<CountriesModel> countries;

	@SerializedName("currencies")
	private List<CurrenciesModel> currencies;

	@SerializedName("countryCode")
	private String countryCode;

	@SerializedName("country")
	private String country;

	@SerializedName("currency")
	private String currency;

	@SerializedName("flagUrl")
	private String flagUrl;

	@SerializedName("currencyDisplayValue")
	private String currencyDisplayValue;

	@SerializedName("openDialog")
	private boolean openDialog;

	@SerializedName("isLoading")
	private boolean isLoading;

	@SerializedName("hasUpdatedI18n")
	private boolean hasUpdatedI18n;

	@SerializedName("onGDPRNetwork")
	private boolean onGDPRNetwork;

	@SerializedName("isXHRAllowed")
	private boolean isXHRAllowed;

	@SerializedName("countryOfOrigin")
	private String countryOfOrigin;

	public List<CountriesModel> getCountries(){
		return countries;
	}

	public List<CurrenciesModel> getCurrencies(){
		return currencies;
	}

	public String getCountryCode(){
		return countryCode;
	}

	public String getCountry(){
		return country;
	}

	public String getCurrency(){
		return currency;
	}

	public String getFlagUrl(){
		return flagUrl;
	}

	public String getCurrencyDisplayValue(){
		return currencyDisplayValue;
	}

	public boolean isOpenDialog(){
		return openDialog;
	}

	public boolean isIsLoading(){
		return isLoading;
	}

	public boolean isHasUpdatedI18n(){
		return hasUpdatedI18n;
	}

	public boolean isOnGDPRNetwork(){
		return onGDPRNetwork;
	}

	public boolean isIsXHRAllowed(){
		return isXHRAllowed;
	}

	public String getCountryOfOrigin(){
		return countryOfOrigin;
	}
}