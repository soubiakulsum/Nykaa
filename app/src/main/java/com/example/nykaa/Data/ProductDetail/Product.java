package com.example.nykaa.Data.ProductDetail;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Product{

	@SerializedName("action_url")
	private String actionUrl;

	@SerializedName("productMedia")
	private List<ProductMediaItem> productMedia;

	@SerializedName("color")
	private Color color;

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

	@SerializedName("sizeGuideURL")
	private String sizeGuideURL;

	@SerializedName("sizeOptions")
	private List<SizeOptionsItem> sizeOptions;

	@SerializedName("subTitle")
	private String subTitle;

	@SerializedName("sizeName")
	private String sizeName;

	@SerializedName("price")
	private int price;

	@SerializedName("review")
	private Review review;

	@SerializedName("imageUrl")
	private String imageUrl;

	@SerializedName("meta_data")
	private MetaData metaData;

	@SerializedName("productInfoNew")
	private List<ProductInfoNewItem> productInfoNew;

	@SerializedName("brandActionUrl")
	private String brandActionUrl;

	@SerializedName("id")
	private String id;

	@SerializedName("tag")
	private Tag tag;

	@SerializedName("sku")
	private String sku;

	@SerializedName("shipsIn")
	private String shipsIn;

	@SerializedName("returnPolicy")
	private String returnPolicy;

	@SerializedName("productInfo")
	private List<ProductInfoItem> productInfo;

	@SerializedName("isOutOfStock")
	private int isOutOfStock;

	@SerializedName("isReturnable")
	private int isReturnable;

	@SerializedName("colorOptions")
	private List<ColorOptionsItem> colorOptions;

	@SerializedName("discountedPrice")
	private int discountedPrice;

	@SerializedName("parentSku")
	private String parentSku;

	@SerializedName("brandId")
	private String brandId;

	@SerializedName("internationalShipsIn")
	private Object internationalShipsIn;

	@SerializedName("categoryId")
	private List<String> categoryId;

	public String getActionUrl(){
		return actionUrl;
	}

	public List<ProductMediaItem> getProductMedia(){
		return productMedia;
	}

	public Color getColor(){
		return color;
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

	public String getSizeGuideURL(){
		return sizeGuideURL;
	}

	public List<SizeOptionsItem> getSizeOptions(){
		return sizeOptions;
	}

	public String getSubTitle(){
		return subTitle;
	}

	public String getSizeName(){
		return sizeName;
	}

	public int getPrice(){
		return price;
	}

	public Review getReview(){
		return review;
	}

	public String getImageUrl(){
		return imageUrl;
	}

	public MetaData getMetaData(){
		return metaData;
	}

	public List<ProductInfoNewItem> getProductInfoNew(){
		return productInfoNew;
	}

	public String getBrandActionUrl(){
		return brandActionUrl;
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

	public String getReturnPolicy(){
		return returnPolicy;
	}

	public List<ProductInfoItem> getProductInfo(){
		return productInfo;
	}

	public int getIsOutOfStock(){
		return isOutOfStock;
	}

	public int getIsReturnable(){
		return isReturnable;
	}

	public List<ColorOptionsItem> getColorOptions(){
		return colorOptions;
	}

	public int getDiscountedPrice(){
		return discountedPrice;
	}

	public String getParentSku(){
		return parentSku;
	}

	public String getBrandId(){
		return brandId;
	}

	public Object getInternationalShipsIn(){
		return internationalShipsIn;
	}

	public List<String> getCategoryId(){
		return categoryId;
	}
}