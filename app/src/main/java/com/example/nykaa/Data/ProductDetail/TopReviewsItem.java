package com.example.nykaa.Data.ProductDetail;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class TopReviewsItem{

	@SerializedName("review_id")
	private String reviewId;

	@SerializedName("images")
	private List<String> images;

	@SerializedName("nickname")
	private String nickname;

	@SerializedName("rating")
	private String rating;

	@SerializedName("created_at")
	private String createdAt;

	@SerializedName("detail")
	private String detail;

	@SerializedName("childId")
	private String childId;

	@SerializedName("title")
	private String title;

	@SerializedName("is_buyer")
	private boolean isBuyer;

	@SerializedName("likes")
	private String likes;

	@SerializedName("tags")
	private List<TagsItem> tags;

	public String getReviewId(){
		return reviewId;
	}

	public List<String> getImages(){
		return images;
	}

	public String getNickname(){
		return nickname;
	}

	public String getRating(){
		return rating;
	}

	public String getCreatedAt(){
		return createdAt;
	}

	public String getDetail(){
		return detail;
	}

	public String getChildId(){
		return childId;
	}

	public String getTitle(){
		return title;
	}

	public boolean isIsBuyer(){
		return isBuyer;
	}

	public String getLikes(){
		return likes;
	}

	public List<TagsItem> getTags(){
		return tags;
	}
}