package com.example.nykaa.Data.listItemsData;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class JsonMember1Item{

	@SerializedName("offers")
	private Object offers;

	@SerializedName("offerCount")
	private int offerCount;

	@SerializedName("actionUrl")
	private String actionUrl;

	@SerializedName("discount")
	private int discount;

	@SerializedName("aspectRatio")
	private double aspectRatio;

	@SerializedName("type")
	private String type;

	@SerializedName("title")
	private String title;

	@SerializedName("sizeVariation")
	private List<SizeVariationItem> sizeVariation;

	@SerializedName("isOutOfStock")
	private int isOutOfStock;

	@SerializedName("discountedPrice")
	private int discountedPrice;

	@SerializedName("subTitle")
	private String subTitle;

	@SerializedName("price")
	private int price;

	@SerializedName("imageUrl")
	private String imageUrl;

	@SerializedName("lcp")
	private int lcp;

	@SerializedName("id")
	private String id;

	@SerializedName("tag")
	private Tag tag;

	@SerializedName("sku")
	private String sku;

	@SerializedName("categoryId")
	private List<String> categoryId;

	@SerializedName("gridImageUrl")
	private String gridImageUrl;

	@SerializedName("action_type")
	private String actionType;

	@SerializedName("action_value")
	private String actionValue;

	@SerializedName("sort")
	private String sort;

	@SerializedName("position")
	private int position;

	@SerializedName("filter_data")
	private String filterData;

	public Object getOffers(){
		return offers;
	}

	public int getOfferCount(){
		return offerCount;
	}

	public String getActionUrl(){
		return actionUrl;
	}

	public int getDiscount(){
		return discount;
	}

	public double getAspectRatio(){
		return aspectRatio;
	}

	public String getType(){
		return type;
	}

	public String getTitle(){
		return title;
	}

	public List<SizeVariationItem> getSizeVariation(){
		return sizeVariation;
	}

	public int getIsOutOfStock(){
		return isOutOfStock;
	}

	public int getDiscountedPrice(){
		return discountedPrice;
	}

	public String getSubTitle(){
		return subTitle;
	}

	public int getPrice(){
		return price;
	}

	public String getImageUrl(){
		return imageUrl;
	}

	public int getLcp(){
		return lcp;
	}

	public String getId(){
		return id;
	}

	public Tag getTag(){
		return tag;
	}

	public String getSku(){
		return sku;
	}

	public List<String> getCategoryId(){
		return categoryId;
	}

	public String getGridImageUrl(){
		return gridImageUrl;
	}

	public String getActionType(){
		return actionType;
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
}