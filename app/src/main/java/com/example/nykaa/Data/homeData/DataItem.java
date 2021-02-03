package com.example.nykaa.Data.homeData;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class DataItem{

	@SerializedName("children")
	private List<ChildrenItem> children;

	@SerializedName("level")
	private String level;

	@SerializedName("channel")
	private String channel;

	@SerializedName("id")
	private int id;

	@SerializedName("title")
	private String title;

	@SerializedName("type")
	private String type;

	@SerializedName("isActive")
	private boolean isActive;

	@SerializedName("device")
	private String device;

	@SerializedName("url")
	private String url;

	@SerializedName("position")
	private int position;

	@SerializedName("tag")
	private String tag;

	public List<ChildrenItem> getChildren(){
		return children;
	}

	public String getLevel(){
		return level;
	}

	public String getChannel(){
		return channel;
	}

	public int getId(){
		return id;
	}

	public String getTitle(){
		return title;
	}

	public String getType(){
		return type;
	}

	public boolean isIsActive(){
		return isActive;
	}

	public String getDevice(){
		return device;
	}

	public String getUrl(){
		return url;
	}

	public int getPosition(){
		return position;
	}

	public String getTag(){
		return tag;
	}
}