package com.example.nykaa.Data.ProductDetail;

import com.google.gson.annotations.SerializedName;

public class ProductMediaItem{

	@SerializedName("aspect_ratio")
	private double aspectRatio;

	@SerializedName("mediaType")
	private String mediaType;

	@SerializedName("id")
	private String id;

	@SerializedName("position")
	private String position;

	@SerializedName("url")
	private String url;

	public double getAspectRatio(){
		return aspectRatio;
	}

	public String getMediaType(){
		return mediaType;
	}

	public String getId(){
		return id;
	}

	public String getPosition(){
		return position;
	}

	public String getUrl(){
		return url;
	}
}