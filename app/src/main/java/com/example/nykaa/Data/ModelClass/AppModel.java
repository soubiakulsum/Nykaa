package com.example.nykaa.Data.ModelClass;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class AppModel implements Serializable {

	@SerializedName("statusCode")
	private int statusCode;

	@SerializedName("headerOptions")
	private HeaderOptionsModel headerOptions;

	@SerializedName("headerDiscount")
	private String headerDiscount;

	@SerializedName("menu")
	private MenuModel menu;

	@SerializedName("user")
	private UserModel user;

	@SerializedName("inProgress")
	private boolean inProgress;

	@SerializedName("showHeader")
	private boolean showHeader;

	@SerializedName("showFooter")
	private boolean showFooter;

	@SerializedName("ssrHeaders")
	private SsrHeadersModel ssrHeaders;

	@SerializedName("cookies")
	private CookiesModel cookies;

	@SerializedName("webAppType")
	private String webAppType;

	@SerializedName("showLoginOption")
	private boolean showLoginOption;

	@SerializedName("searchTerm")
	private String searchTerm;

	@SerializedName("baseCountry")
	private String baseCountry;

	@SerializedName("showSuccessLoginToast")
	private boolean showSuccessLoginToast;

	public int getStatusCode(){
		return statusCode;
	}

	public HeaderOptionsModel getHeaderOptions(){
		return headerOptions;
	}

	public String getHeaderDiscount(){
		return headerDiscount;
	}

	public MenuModel getMenu(){
		return menu;
	}

	public UserModel getUser(){
		return user;
	}

	public boolean isInProgress(){
		return inProgress;
	}

	public boolean isShowHeader(){
		return showHeader;
	}

	public boolean isShowFooter(){
		return showFooter;
	}

	public SsrHeadersModel getSsrHeaders(){
		return ssrHeaders;
	}

	public CookiesModel getCookies(){
		return cookies;
	}

	public String getWebAppType(){
		return webAppType;
	}

	public boolean isShowLoginOption(){
		return showLoginOption;
	}

	public String getSearchTerm(){
		return searchTerm;
	}

	public String getBaseCountry(){
		return baseCountry;
	}

	public boolean isShowSuccessLoginToast(){
		return showSuccessLoginToast;
	}
}