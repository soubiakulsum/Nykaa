package com.example.nykaa.Data.homeData;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Internationalization{

	@SerializedName("country")
	private String country;

	@SerializedName("onGDPRNetwork")
	private boolean onGDPRNetwork;

	@SerializedName("currencyDisplayValue")
	private String currencyDisplayValue;

	@SerializedName("hasUpdatedI18n")
	private boolean hasUpdatedI18n;

	@SerializedName("countries")
	private List<CountriesItem> countries;

	@SerializedName("flagUrl")
	private String flagUrl;

	@SerializedName("isXHRAllowed")
	private boolean isXHRAllowed;

	@SerializedName("isLoading")
	private boolean isLoading;

	@SerializedName("countryCode")
	private String countryCode;

	@SerializedName("openDialog")
	private boolean openDialog;

	@SerializedName("currency")
	private String currency;

	@SerializedName("countryOfOrigin")
	private String countryOfOrigin;

	@SerializedName("currencies")
	private List<CurrenciesItem> currencies;

	public String getCountry(){
		return country;
	}

	public boolean isOnGDPRNetwork(){
		return onGDPRNetwork;
	}

	public String getCurrencyDisplayValue(){
		return currencyDisplayValue;
	}

	public boolean isHasUpdatedI18n(){
		return hasUpdatedI18n;
	}

	public List<CountriesItem> getCountries(){
		return countries;
	}

	public String getFlagUrl(){
		return flagUrl;
	}

	public boolean isIsXHRAllowed(){
		return isXHRAllowed;
	}

	public boolean isIsLoading(){
		return isLoading;
	}

	public String getCountryCode(){
		return countryCode;
	}

	public boolean isOpenDialog(){
		return openDialog;
	}

	public String getCurrency(){
		return currency;
	}

	public String getCountryOfOrigin(){
		return countryOfOrigin;
	}

	public List<CurrenciesItem> getCurrencies(){
		return currencies;
	}
}