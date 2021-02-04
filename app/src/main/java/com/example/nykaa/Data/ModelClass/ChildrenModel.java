package com.example.nykaa.Data.ModelClass;

import java.util.List;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class ChildrenModel implements Serializable {

	@SerializedName("id")
	private int id;

	@SerializedName("title")
	private String title;

	@SerializedName("type")
	private String type;

	@SerializedName("children")
	private List<Object> children;

	@SerializedName("isActive")
	private boolean isActive;

	@SerializedName("sort")
	private String sort;

	@SerializedName("url")
	private String url;

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

	public List<Object> getChildren(){
		return children;
	}

	public boolean isIsActive(){
		return isActive;
	}

	public String getSort(){
		return sort;
	}

	public String getUrl(){
		return url;
	}

	public String getChannel(){
		return channel;
	}

	public String getLevel(){
		return level;
	}
}