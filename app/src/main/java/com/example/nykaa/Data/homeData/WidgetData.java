package com.example.nykaa.Data.homeData;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class WidgetData{

	@SerializedName("wtype")
	private String wtype;

	@SerializedName("wid")
	private String wid;

	@SerializedName("children")
	private List<ChildrenItem> children;

	@SerializedName("positionInParent")
	private int positionInParent;

	@SerializedName("parameters")
	private Parameters parameters;

	public String getWtype(){
		return wtype;
	}

	public String getWid(){
		return wid;
	}

	public List<ChildrenItem> getChildren(){
		return children;
	}

	public int getPositionInParent(){
		return positionInParent;
	}

	public Parameters getParameters(){
		return parameters;
	}
}