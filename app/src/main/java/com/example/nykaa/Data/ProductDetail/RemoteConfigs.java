package com.example.nykaa.Data.ProductDetail;

import com.google.gson.annotations.SerializedName;

public class RemoteConfigs{

	@SerializedName("ad_platform_pages")
	private String adPlatformPages;

	@SerializedName("csp")
	private String csp;

	@SerializedName("global_search")
	private String globalSearch;

	@SerializedName("widget")
	private String widget;

	@SerializedName("pwa_optimizeId")
	private String pwaOptimizeId;

	@SerializedName("pdp_explore")
	private String pdpExplore;

	@SerializedName("ratingAndReview_enabled")
	private String ratingAndReviewEnabled;

	@SerializedName("adplatform_impression")
	private String adplatformImpression;

	@SerializedName("dns_links")
	private String dnsLinks;

	@SerializedName("is_filter_guides_enabled")
	private String isFilterGuidesEnabled;

	@SerializedName("enable_i18n_headers_logging")
	private String enableI18nHeadersLogging;

	@SerializedName("logoUrl")
	private String logoUrl;

	@SerializedName("visitor_priortization")
	private String visitorPriortization;

	@SerializedName("fit_advisor_config")
	private String fitAdvisorConfig;

	@SerializedName("showPDPMeasurement")
	private String showPDPMeasurement;

	@SerializedName("pdp_videos")
	private String pdpVideos;

	@SerializedName("i18n_enabled")
	private String i18nEnabled;

	@SerializedName("allowMergeAccountCustomEmail")
	private String allowMergeAccountCustomEmail;

	@SerializedName("otp_flow")
	private String otpFlow;

	@SerializedName("react_checkout_v2")
	private String reactCheckoutV2;

	@SerializedName("free_shipping_amount")
	private String freeShippingAmount;

	@SerializedName("hp_search_config")
	private String hpSearchConfig;

	public String getAdPlatformPages(){
		return adPlatformPages;
	}

	public String getCsp(){
		return csp;
	}

	public String getGlobalSearch(){
		return globalSearch;
	}

	public String getWidget(){
		return widget;
	}

	public String getPwaOptimizeId(){
		return pwaOptimizeId;
	}

	public String getPdpExplore(){
		return pdpExplore;
	}

	public String getRatingAndReviewEnabled(){
		return ratingAndReviewEnabled;
	}

	public String getAdplatformImpression(){
		return adplatformImpression;
	}

	public String getDnsLinks(){
		return dnsLinks;
	}

	public String getIsFilterGuidesEnabled(){
		return isFilterGuidesEnabled;
	}

	public String getEnableI18nHeadersLogging(){
		return enableI18nHeadersLogging;
	}

	public String getLogoUrl(){
		return logoUrl;
	}

	public String getVisitorPriortization(){
		return visitorPriortization;
	}

	public String getFitAdvisorConfig(){
		return fitAdvisorConfig;
	}

	public String getShowPDPMeasurement(){
		return showPDPMeasurement;
	}

	public String getPdpVideos(){
		return pdpVideos;
	}

	public String getI18nEnabled(){
		return i18nEnabled;
	}

	public String getAllowMergeAccountCustomEmail(){
		return allowMergeAccountCustomEmail;
	}

	public String getOtpFlow(){
		return otpFlow;
	}

	public String getReactCheckoutV2(){
		return reactCheckoutV2;
	}

	public String getFreeShippingAmount(){
		return freeShippingAmount;
	}

	public String getHpSearchConfig(){
		return hpSearchConfig;
	}
}