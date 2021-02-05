package com.example.nykaa.Data.ProductDetail;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class SizeOptionsItem{

	@SerializedName("color")
	private Color color;

	@SerializedName("returnPolicy")
	private String returnPolicy;

	@SerializedName("discount")
	private int discount;

	@SerializedName("heroImage")
	private String heroImage;

	@SerializedName("type")
	private String type;

	@SerializedName("title")
	private String title;

	@SerializedName("categoryName")
	private String categoryName;

	@SerializedName("isOneSize")
	private boolean isOneSize;

	@SerializedName("isOutOfStock")
	private int isOutOfStock;

	@SerializedName("isReturnable")
	private int isReturnable;

	@SerializedName("discountedPrice")
	private int discountedPrice;

	@SerializedName("subTitle")
	private String subTitle;

	@SerializedName("sizeName")
	private String sizeName;

	@SerializedName("parentSku")
	private String parentSku;

	@SerializedName("price")
	private int price;

	@SerializedName("brandId")
	private String brandId;

	@SerializedName("internationalShipsIn")
	private Object internationalShipsIn;

	@SerializedName("productInfoNew")
	private List<ProductInfoNewItem> productInfoNew;

	@SerializedName("id")
	private String id;

	@SerializedName("tag")
	private Tag tag;

	@SerializedName("sku")
	private String sku;

	@SerializedName("shipsIn")
	private String shipsIn;

	public Color getColor(){
		return color;
	}

	public String getReturnPolicy(){
		return returnPolicy;
	}

	public int getDiscount(){
		return discount;
	}

	public String getHeroImage(){
		return heroImage;
	}

	public String getType(){
		return type;
	}

	public String getTitle(){
		return title;
	}

	public String getCategoryName(){
		return categoryName;
	}

	public boolean isIsOneSize(){
		return isOneSize;
	}

	public int getIsOutOfStock(){
		return isOutOfStock;
	}

	public int getIsReturnable(){
		return isReturnable;
	}

	public int getDiscountedPrice(){
		return discountedPrice;
	}

	public String getSubTitle(){
		return subTitle;
	}

	public String getSizeName(){
		return sizeName;
	}

	public String getParentSku(){
		return parentSku;
	}

	public int getPrice(){
		return price;
	}

	public String getBrandId(){
		return brandId;
	}

	public Object getInternationalShipsIn(){
		return internationalShipsIn;
	}

	public List<ProductInfoNewItem> getProductInfoNew(){
		return productInfoNew;
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

	public String getShipsIn(){
		return shipsIn;
	}
}