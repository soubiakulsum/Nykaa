package com.example.nykaa.Data.ModelClass;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class LandingpageDataModel implements Serializable {

	@SerializedName("inventory_name")
	private String inventoryName;

	@SerializedName("inventory_id")
	private String inventoryId;

	@SerializedName("inventory_page_type")
	private String inventoryPageType;

	@SerializedName("inventory_page_section")
	private String inventoryPageSection;

	@SerializedName("inventory_page_data")
	private String inventoryPageData;

	@SerializedName("visibility")
	private String visibility;

	@SerializedName("broker_enabled")
	private boolean brokerEnabled;

	@SerializedName("widget_data")
	private WidgetDataModel widgetData;

	@SerializedName("html")
	private Object html;

	@SerializedName("weightage_in_page")
	private int weightageInPage;

	@SerializedName("position")
	private int position;

	public String getInventoryName(){
		return inventoryName;
	}

	public String getInventoryId(){
		return inventoryId;
	}

	public String getInventoryPageType(){
		return inventoryPageType;
	}

	public String getInventoryPageSection(){
		return inventoryPageSection;
	}

	public String getInventoryPageData(){
		return inventoryPageData;
	}

	public String getVisibility(){
		return visibility;
	}

	public boolean isBrokerEnabled(){
		return brokerEnabled;
	}

	public WidgetDataModel getWidgetData(){
		return widgetData;
	}

	public Object getHtml(){
		return html;
	}

	public int getWeightageInPage(){
		return weightageInPage;
	}

	public int getPosition(){
		return position;
	}
}