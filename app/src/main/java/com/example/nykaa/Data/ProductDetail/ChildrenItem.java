package com.example.nykaa.Data.ProductDetail;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class ChildrenItem{

	@SerializedName("children")
	private List<Object> children;

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

	@SerializedName("aspect_ratio")
	private double aspectRatio;

	@SerializedName("image_url")
	private String imageUrl;

	@SerializedName("url")
	private String url;

	public List<Object> getChildren(){
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

	public double getAspectRatio(){
		return aspectRatio;
	}

	public String getImageUrl(){
		return imageUrl;
	}

	public String getUrl(){
		return url;
	}
}