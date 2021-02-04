package com.example.nykaa.Data.ModelClass;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class ParametersModel implements Serializable {

	@SerializedName("web_action_type")
	private String webActionType;

	@SerializedName("web_action_url")
	private String webActionUrl;

	@SerializedName("tracking_parameters")
	private String trackingParameters;

	@SerializedName("section")
	private String section;

	@SerializedName("delay_timer")
	private String delayTimer;

	@SerializedName("randomize")
	private String randomize;

	@SerializedName("app_webview_action")
	private String appWebviewAction;

	@SerializedName("app_webview_action_data")
	private String appWebviewActionData;

	@SerializedName("app_link_type")
	private String appLinkType;

	@SerializedName("app_link_data")
	private String appLinkData;

	@SerializedName("source")
	private String source;

	@SerializedName("filter_data")
	private String filterData;

	@SerializedName("sort")
	private String sort;

	@SerializedName("remote_app_link")
	private String remoteAppLink;

	@SerializedName("tile_id")
	private String tileId;

	@SerializedName("segments")
	private String segments;

	@SerializedName("offer_data")
	private String offerData;

	@SerializedName("brand_id")
	private String brandId;

	@SerializedName("")
	private String jsonMember;

	@SerializedName("banner_title")
	private String bannerTitle;

	@SerializedName("funding_type")
	private String fundingType;

	@SerializedName("impressions")
	private String impressions;

	@SerializedName("ad_type")
	private String adType;

	@SerializedName("primary_cta_text")
	private String primaryCtaText;

	@SerializedName("secondary_cta_label")
	private String secondaryCtaLabel;

	@SerializedName("video_url")
	private String videoUrl;

	@SerializedName("full_video_url")
	private String fullVideoUrl;

	@SerializedName("video_ad_type")
	private String videoAdType;

	@SerializedName("show_video_icon")
	private boolean showVideoIcon;

	@SerializedName("brands")
	private String brands;

	public String getWebActionType(){
		return webActionType;
	}

	public String getWebActionUrl(){
		return webActionUrl;
	}

	public String getTrackingParameters(){
		return trackingParameters;
	}

	public String getSection(){
		return section;
	}

	public String getDelayTimer(){
		return delayTimer;
	}

	public String getRandomize(){
		return randomize;
	}

	public String getAppWebviewAction(){
		return appWebviewAction;
	}

	public String getAppWebviewActionData(){
		return appWebviewActionData;
	}

	public String getAppLinkType(){
		return appLinkType;
	}

	public String getAppLinkData(){
		return appLinkData;
	}

	public String getSource(){
		return source;
	}

	public String getFilterData(){
		return filterData;
	}

	public String getSort(){
		return sort;
	}

	public String getRemoteAppLink(){
		return remoteAppLink;
	}

	public String getTileId(){
		return tileId;
	}

	public String getSegments(){
		return segments;
	}

	public String getOfferData(){
		return offerData;
	}

	public String getBrandId(){
		return brandId;
	}

	public String getJsonMember(){
		return jsonMember;
	}

	public String getBannerTitle(){
		return bannerTitle;
	}

	public String getFundingType(){
		return fundingType;
	}

	public String getImpressions(){
		return impressions;
	}

	public String getAdType(){
		return adType;
	}

	public String getPrimaryCtaText(){
		return primaryCtaText;
	}

	public String getSecondaryCtaLabel(){
		return secondaryCtaLabel;
	}

	public String getVideoUrl(){
		return videoUrl;
	}

	public String getFullVideoUrl(){
		return fullVideoUrl;
	}

	public String getVideoAdType(){
		return videoAdType;
	}

	public boolean isShowVideoIcon(){
		return showVideoIcon;
	}

	public String getBrands(){
		return brands;
	}
}