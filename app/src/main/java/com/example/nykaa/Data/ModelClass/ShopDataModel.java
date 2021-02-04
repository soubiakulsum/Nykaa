package com.example.nykaa.Data.ModelClass;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class ShopDataModel implements Serializable {

	@SerializedName("app")
	private AppModel app;

	@SerializedName("landingpage")
	private LandingpageModel landingpage;

	@SerializedName("cart")
	private CartModel cart;

	@SerializedName("details")
	private DetailsModel details;

	@SerializedName("widgets")
	private WidgetsModel widgets;

	@SerializedName("listing")
	private ListingModel listing;

	@SerializedName("internationalization")
	private InternationalizationModel internationalization;

	@SerializedName("globalSearch")
	private GlobalSearchModel globalSearch;

	@SerializedName("remoteConfigs")
	private RemoteConfigsModel remoteConfigs;

	@SerializedName("router")
	private RouterModel router;

	public AppModel getApp(){
		return app;
	}

	public LandingpageModel getLandingpage(){
		return landingpage;
	}

	public CartModel getCart(){
		return cart;
	}

	public DetailsModel getDetails(){
		return details;
	}

	public WidgetsModel getWidgets(){
		return widgets;
	}

	public ListingModel getListing(){
		return listing;
	}

	public InternationalizationModel getInternationalization(){
		return internationalization;
	}

	public GlobalSearchModel getGlobalSearch(){
		return globalSearch;
	}

	public RemoteConfigsModel getRemoteConfigs(){
		return remoteConfigs;
	}

	public RouterModel getRouter(){
		return router;
	}
}