package com.example.nykaa.Data.homeData;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Listing{

	@SerializedName("isSecondaryFetching")
	private boolean isSecondaryFetching;

	@SerializedName("ui_message")
	private String uiMessage;

	@SerializedName("footerHTML")
	private String footerHTML;

	@SerializedName("tiptiles")
	private List<Object> tiptiles;

	@SerializedName("count")
	private int count;

	@SerializedName("topCollection")
	private List<Object> topCollection;

	@SerializedName("isFetching")
	private boolean isFetching;

	@SerializedName("filters")
	private List<Object> filters;

	@SerializedName("title")
	private String title;

	@SerializedName("products")
	private Products products;

	@SerializedName("query_expansion_term")
	private String queryExpansionTerm;

	@SerializedName("banner_images")
	private List<Object> bannerImages;

	@SerializedName("appliedFilters")
	private AppliedFilters appliedFilters;

	@SerializedName("searchTerm")
	private String searchTerm;

	@SerializedName("isNotFound")
	private boolean isNotFound;

	@SerializedName("filterGuides")
	private FilterGuides filterGuides;

	@SerializedName("meta_data")
	private MetaData metaData;

	@SerializedName("isFetchingError")
	private boolean isFetchingError;

	@SerializedName("errorId")
	private String errorId;

	@SerializedName("currentPage")
	private int currentPage;

	@SerializedName("query_expansion_type")
	private String queryExpansionType;

	@SerializedName("categoryId")
	private String categoryId;

	public boolean isIsSecondaryFetching(){
		return isSecondaryFetching;
	}

	public String getUiMessage(){
		return uiMessage;
	}

	public String getFooterHTML(){
		return footerHTML;
	}

	public List<Object> getTiptiles(){
		return tiptiles;
	}

	public int getCount(){
		return count;
	}

	public List<Object> getTopCollection(){
		return topCollection;
	}

	public boolean isIsFetching(){
		return isFetching;
	}

	public List<Object> getFilters(){
		return filters;
	}

	public String getTitle(){
		return title;
	}

	public Products getProducts(){
		return products;
	}

	public String getQueryExpansionTerm(){
		return queryExpansionTerm;
	}

	public List<Object> getBannerImages(){
		return bannerImages;
	}

	public AppliedFilters getAppliedFilters(){
		return appliedFilters;
	}

	public String getSearchTerm(){
		return searchTerm;
	}

	public boolean isIsNotFound(){
		return isNotFound;
	}

	public FilterGuides getFilterGuides(){
		return filterGuides;
	}

	public MetaData getMetaData(){
		return metaData;
	}

	public boolean isIsFetchingError(){
		return isFetchingError;
	}

	public String getErrorId(){
		return errorId;
	}

	public int getCurrentPage(){
		return currentPage;
	}

	public String getQueryExpansionType(){
		return queryExpansionType;
	}

	public String getCategoryId(){
		return categoryId;
	}
}