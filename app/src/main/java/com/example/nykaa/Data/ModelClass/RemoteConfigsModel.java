package com.example.nykaa.Data.ModelClass;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class RemoteConfigsModel implements Serializable {

	@SerializedName("hp_search_config")
	private String hpSearchConfig;

	@SerializedName("global_search")
	private String globalSearch;

	@SerializedName("pdp_explore")
	private String pdpExplore;

	@SerializedName("otp_flow")
	private String otpFlow;

	@SerializedName("widget")
	private String widget;

	@SerializedName("ad_platform_pages")
	private String adPlatformPages;

	@SerializedName("dns_links")
	private String dnsLinks;

	@SerializedName("pdp_videos")
	private String pdpVideos;

	@SerializedName("logoUrl")
	private String logoUrl;

	@SerializedName("is_filter_guides_enabled")
	private String isFilterGuidesEnabled;

	@SerializedName("react_checkout_v2")
	private String reactCheckoutV2;

	@SerializedName("allowMergeAccountCustomEmail")
	private String allowMergeAccountCustomEmail;

	@SerializedName("showPDPMeasurement")
	private String showPDPMeasurement;

	@SerializedName("fit_advisor_config")
	private String fitAdvisorConfig;

	@SerializedName("pwa_optimizeId")
	private String pwaOptimizeId;

	@SerializedName("visitor_priortization")
	private String visitorPriortization;

	@SerializedName("i18n_enabled")
	private String i18nEnabled;

	@SerializedName("ratingAndReview_enabled")
	private String ratingAndReviewEnabled;

	@SerializedName("csp")
	private String csp;

	@SerializedName("enable_i18n_headers_logging")
	private String enableI18nHeadersLogging;

	@SerializedName("free_shipping_amount")
	private String freeShippingAmount;

	@SerializedName("adplatform_impression")
	private String adplatformImpression;

	public String getHpSearchConfig(){
		return hpSearchConfig;
	}

	public String getGlobalSearch(){
		return globalSearch;
	}

	public String getPdpExplore(){
		return pdpExplore;
	}

	public String getOtpFlow(){
		return otpFlow;
	}

	public String getWidget(){
		return widget;
	}

	public String getAdPlatformPages(){
		return adPlatformPages;
	}

	public String getDnsLinks(){
		return dnsLinks;
	}

	public String getPdpVideos(){
		return pdpVideos;
	}

	public String getLogoUrl(){
		return logoUrl;
	}

	public String getIsFilterGuidesEnabled(){
		return isFilterGuidesEnabled;
	}

	public String getReactCheckoutV2(){
		return reactCheckoutV2;
	}

	public String getAllowMergeAccountCustomEmail(){
		return allowMergeAccountCustomEmail;
	}

	public String getShowPDPMeasurement(){
		return showPDPMeasurement;
	}

	public String getFitAdvisorConfig(){
		return fitAdvisorConfig;
	}

	public String getPwaOptimizeId(){
		return pwaOptimizeId;
	}

	public String getVisitorPriortization(){
		return visitorPriortization;
	}

	public String getI18nEnabled(){
		return i18nEnabled;
	}

	public String getRatingAndReviewEnabled(){
		return ratingAndReviewEnabled;
	}

	public String getCsp(){
		return csp;
	}

	public String getEnableI18nHeadersLogging(){
		return enableI18nHeadersLogging;
	}

	public String getFreeShippingAmount(){
		return freeShippingAmount;
	}

	public String getAdplatformImpression(){
		return adplatformImpression;
	}
}