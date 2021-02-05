package com.example.nykaa.Data.ModelClass;

import java.util.List;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class DataModel implements Serializable {

	@SerializedName("id")
	private int id;

	@SerializedName("title")
	private String title;

	@SerializedName("type")
	private String type;

	@SerializedName("children")
	private List<ChildrenModel> children;

	@SerializedName("tag")
	private String tag;

	@SerializedName("device")
	private String device;

	@SerializedName("isActive")
	private boolean isActive;

	@SerializedName("channel")
	private String channel;

	@SerializedName("level")
	private String level;

	public int getId(){
		return id;
	}

	public String getTitle(){
		return title;
	}

	public String getType(){
		return type;
	}

	public List<ChildrenModel> getChildren(){
		return children;
	}

	public String getTag(){
		return tag;
	}

	public String getDevice(){
		return device;
	}

	public boolean isIsActive(){
		return isActive;
	}

	public String getChannel(){
		return channel;
	}

	public String getLevel(){
		return level;
	}
}