package com.example.nykaa.Data.ModelClass;

import java.util.List;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class ListingModel implements Serializable {

	@SerializedName("products")
	private ProductsModel products;

	@SerializedName("filters")
	private List<Object> filters;

	@SerializedName("isFetching")
	private boolean isFetching;

	@SerializedName("isSecondaryFetching")
	private boolean isSecondaryFetching;

	@SerializedName("isFetchingError")
	private boolean isFetchingError;

	@SerializedName("isNotFound")
	private boolean isNotFound;

	@SerializedName("title")
	private String title;

	@SerializedName("appliedFilters")
	private AppliedFiltersModel appliedFilters;

	@SerializedName("categoryId")
	private String categoryId;

	@SerializedName("searchTerm")
	private String searchTerm;

	@SerializedName("currentPage")
	private int currentPage;

	@SerializedName("count")
	private int count;

	@SerializedName("banner_images")
	private List<Object> bannerImages;

	@SerializedName("topCollection")
	private List<Object> topCollection;

	@SerializedName("meta_data")
	private MetaDataModel metaData;

	@SerializedName("tiptiles")
	private List<Object> tiptiles;

	@SerializedName("errorId")
	private String errorId;

	@SerializedName("ui_message")
	private String uiMessage;

	@SerializedName("footerHTML")
	private String footerHTML;

	@SerializedName("query_expansion_term")
	private String queryExpansionTerm;

	@SerializedName("query_expansion_type")
	private String queryExpansionType;

	@SerializedName("filterGuides")
	private FilterGuidesModel filterGuides;

	public ProductsModel getProducts(){
		return products;
	}

	public List<Object> getFilters(){
		return filters;
	}

	public boolean isIsFetching(){
		return isFetching;
	}

	public boolean isIsSecondaryFetching(){
		return isSecondaryFetching;
	}

	public boolean isIsFetchingError(){
		return isFetchingError;
	}

	public boolean isIsNotFound(){
		return isNotFound;
	}

	public String getTitle(){
		return title;
	}

	public AppliedFiltersModel getAppliedFilters(){
		return appliedFilters;
	}

	public String getCategoryId(){
		return categoryId;
	}

	public String getSearchTerm(){
		return searchTerm;
	}

	public int getCurrentPage(){
		return currentPage;
	}

	public int getCount(){
		return count;
	}

	public List<Object> getBannerImages(){
		return bannerImages;
	}

	public List<Object> getTopCollection(){
		return topCollection;
	}

	public MetaDataModel getMetaData(){
		return metaData;
	}

	public List<Object> getTiptiles(){
		return tiptiles;
	}

	public String getErrorId(){
		return errorId;
	}

	public String getUiMessage(){
		return uiMessage;
	}

	public String getFooterHTML(){
		return footerHTML;
	}

	public String getQueryExpansionTerm(){
		return queryExpansionTerm;
	}

	public String getQueryExpansionType(){
		return queryExpansionType;
	}

	public FilterGuidesModel getFilterGuides(){
		return filterGuides;
	}
}