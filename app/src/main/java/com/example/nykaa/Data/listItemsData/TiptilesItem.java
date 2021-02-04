package com.example.nykaa.Data.listItemsData;

import com.google.gson.annotations.SerializedName;

public class TiptilesItem{

	@SerializedName("gridImageUrl")
	private String gridImageUrl;

	@SerializedName("action_type")
	private String actionType;

	@SerializedName("actionUrl")
	private String actionUrl;

	@SerializedName("action_value")
	private String actionValue;

	@SerializedName("sort")
	private String sort;

	@SerializedName("position")
	private int position;

	@SerializedName("filter_data")
	private String filterData;

	@SerializedName("type")
	private String type;

	public String getGridImageUrl(){
		return gridImageUrl;
	}

	public String getActionType(){
		return actionType;
	}

	public String getActionUrl(){
		return actionUrl;
	}

	public String getActionValue(){
		return actionValue;
	}

	public String getSort(){
		return sort;
	}

	public int getPosition(){
		return position;
	}

	public String getFilterData(){
		return filterData;
	}

	public String getType(){
		return type;
	}
}