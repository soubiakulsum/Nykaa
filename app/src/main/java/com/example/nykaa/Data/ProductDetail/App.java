package com.example.nykaa.Data.ProductDetail;

import com.google.gson.annotations.SerializedName;

public class App{

	@SerializedName("baseCountry")
	private String baseCountry;

	@SerializedName("showSuccessLoginToast")
	private boolean showSuccessLoginToast;

	@SerializedName("inProgress")
	private boolean inProgress;

	@SerializedName("showHeader")
	private boolean showHeader;

	@SerializedName("headerDiscount")
	private String headerDiscount;

	@SerializedName("menu")
	private Menu menu;

	@SerializedName("showLoginOption")
	private boolean showLoginOption;

	@SerializedName("showFooter")
	private boolean showFooter;

	@SerializedName("cookies")
	private Cookies cookies;

	@SerializedName("searchTerm")
	private String searchTerm;

	@SerializedName("ssrHeaders")
	private SsrHeaders ssrHeaders;

	@SerializedName("webAppType")
	private String webAppType;

	@SerializedName("headerOptions")
	private HeaderOptions headerOptions;

	@SerializedName("user")
	private User user;

	@SerializedName("statusCode")
	private int statusCode;

	public String getBaseCountry(){
		return baseCountry;
	}

	public boolean isShowSuccessLoginToast(){
		return showSuccessLoginToast;
	}

	public boolean isInProgress(){
		return inProgress;
	}

	public boolean isShowHeader(){
		return showHeader;
	}

	public String getHeaderDiscount(){
		return headerDiscount;
	}

	public Menu getMenu(){
		return menu;
	}

	public boolean isShowLoginOption(){
		return showLoginOption;
	}

	public boolean isShowFooter(){
		return showFooter;
	}

	public Cookies getCookies(){
		return cookies;
	}

	public String getSearchTerm(){
		return searchTerm;
	}

	public SsrHeaders getSsrHeaders(){
		return ssrHeaders;
	}

	public String getWebAppType(){
		return webAppType;
	}

	public HeaderOptions getHeaderOptions(){
		return headerOptions;
	}

	public User getUser(){
		return user;
	}

	public int getStatusCode(){
		return statusCode;
	}
}