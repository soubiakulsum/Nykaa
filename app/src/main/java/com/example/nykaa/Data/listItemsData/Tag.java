package com.example.nykaa.Data.listItemsData;

import com.google.gson.annotations.SerializedName;

public class Tag{

	@SerializedName("borderColor")
	private String borderColor;

	@SerializedName("titleColor")
	private String titleColor;

	@SerializedName("bgColor")
	private String bgColor;

	@SerializedName("transparency")
	private String transparency;

	@SerializedName("imageUrl")
	private String imageUrl;

	@SerializedName("transparency_web")
	private int transparencyWeb;

	@SerializedName("title")
	private String title;

	public String getBorderColor(){
		return borderColor;
	}

	public String getTitleColor(){
		return titleColor;
	}

	public String getBgColor(){
		return bgColor;
	}

	public String getTransparency(){
		return transparency;
	}

	public String getImageUrl(){
		return imageUrl;
	}

	public int getTransparencyWeb(){
		return transparencyWeb;
	}

	public String getTitle(){
		return title;
	}
}