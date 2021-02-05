package com.example.nykaa.Data.listItemsData;

import com.google.gson.annotations.SerializedName;

public class BannerImagesItem{

	@SerializedName("aspect_ratio")
	private Object aspectRatio;

	@SerializedName("native_landing")
	private String nativeLanding;

	@SerializedName("linked_cat_id")
	private String linkedCatId;

	@SerializedName("banner_link")
	private String bannerLink;

	@SerializedName("sort")
	private String sort;

	@SerializedName("position")
	private String position;

	@SerializedName("filter_data")
	private String filterData;

	@SerializedName("url")
	private String url;

	public Object getAspectRatio(){
		return aspectRatio;
	}

	public String getNativeLanding(){
		return nativeLanding;
	}

	public String getLinkedCatId(){
		return linkedCatId;
	}

	public String getBannerLink(){
		return bannerLink;
	}

	public String getSort(){
		return sort;
	}

	public String getPosition(){
		return position;
	}

	public String getFilterData(){
		return filterData;
	}

	public String getUrl(){
		return url;
	}
}