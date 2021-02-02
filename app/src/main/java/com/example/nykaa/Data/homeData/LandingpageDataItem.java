package com.example.nykaa.Data.homeData;

import com.google.gson.annotations.SerializedName;

public class LandingpageDataItem{

	@SerializedName("widget_data")
	private WidgetData widgetData;

	@SerializedName("inventory_page_type")
	private String inventoryPageType;

	@SerializedName("visibility")
	private String visibility;

	@SerializedName("broker_enabled")
	private boolean brokerEnabled;

	@SerializedName("inventory_id")
	private String inventoryId;

	@SerializedName("inventory_page_section")
	private String inventoryPageSection;

	@SerializedName("inventory_page_data")
	private String inventoryPageData;

	@SerializedName("html")
	private Object html;

	@SerializedName("position")
	private int position;

	@SerializedName("weightage_in_page")
	private int weightageInPage;

	@SerializedName("inventory_name")
	private String inventoryName;

	@SerializedName("personalization")
	private String personalization;

	@SerializedName("inventory_version_check")
	private InventoryVersionCheck inventoryVersionCheck;

	public WidgetData getWidgetData(){
		return widgetData;
	}

	public String getInventoryPageType(){
		return inventoryPageType;
	}

	public String getVisibility(){
		return visibility;
	}

	public boolean isBrokerEnabled(){
		return brokerEnabled;
	}

	public String getInventoryId(){
		return inventoryId;
	}

	public String getInventoryPageSection(){
		return inventoryPageSection;
	}

	public String getInventoryPageData(){
		return inventoryPageData;
	}

	public Object getHtml(){
		return html;
	}

	public int getPosition(){
		return position;
	}

	public int getWeightageInPage(){
		return weightageInPage;
	}

	public String getInventoryName(){
		return inventoryName;
	}

	public String getPersonalization(){
		return personalization;
	}

	public InventoryVersionCheck getInventoryVersionCheck(){
		return inventoryVersionCheck;
	}
}