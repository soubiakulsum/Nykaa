package com.example.nykaa.Data.listItemsData;

import com.google.gson.annotations.SerializedName;

public class ListItemsResponseModel{

	@SerializedName("app")
	private App app;

	@SerializedName("internationalization")
	private Internationalization internationalization;

	@SerializedName("remoteConfigs")
	private RemoteConfigs remoteConfigs;

	@SerializedName("router")
	private Router router;

	@SerializedName("landingpage")
	private Landingpage landingpage;

	@SerializedName("details")
	private Details details;

	@SerializedName("globalSearch")
	private GlobalSearch globalSearch;

	@SerializedName("widgets")
	private Widgets widgets;

	@SerializedName("listing")
	private Listing listing;

	@SerializedName("cart")
	private Cart cart;

	public App getApp(){
		return app;
	}

	public Internationalization getInternationalization(){
		return internationalization;
	}

	public RemoteConfigs getRemoteConfigs(){
		return remoteConfigs;
	}

	public Router getRouter(){
		return router;
	}

	public Landingpage getLandingpage(){
		return landingpage;
	}

	public Details getDetails(){
		return details;
	}

	public GlobalSearch getGlobalSearch(){
		return globalSearch;
	}

	public Widgets getWidgets(){
		return widgets;
	}

	public Listing getListing(){
		return listing;
	}

	public Cart getCart(){
		return cart;
	}
}