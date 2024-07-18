package com.example.socialmedia.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity

public class UserAnalytics {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private int followers;
    private int following;
    private int posts;
    private String name;
    private String category;
    private String bio;
    private String contactOptions;
    private String links;
    private int accountReached;
    private int accountEngaged;
    private int contentShared;
    private int adsRun;
    private int activePromotions;
    private int totalStories;
    private int totalFollows;
    private int totalSaves;
    private int totalComments;
    private int totalShares;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getFollowers() {
		return followers;
	}
	public void setFollowers(int followers) {
		this.followers = followers;
	}
	public int getFollowing() {
		return following;
	}
	public void setFollowing(int following) {
		this.following = following;
	}
	public int getPosts() {
		return posts;
	}
	public void setPosts(int posts) {
		this.posts = posts;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getBio() {
		return bio;
	}
	public void setBio(String bio) {
		this.bio = bio;
	}
	public String getContactOptions() {
		return contactOptions;
	}
	public void setContactOptions(String contactOptions) {
		this.contactOptions = contactOptions;
	}
	public String getLinks() {
		return links;
	}
	public void setLinks(String links) {
		this.links = links;
	}
	public int getAccountReached() {
		return accountReached;
	}
	public void setAccountReached(int accountReached) {
		this.accountReached = accountReached;
	}
	public int getAccountEngaged() {
		return accountEngaged;
	}
	public void setAccountEngaged(int accountEngaged) {
		this.accountEngaged = accountEngaged;
	}
	public int getContentShared() {
		return contentShared;
	}
	public void setContentShared(int contentShared) {
		this.contentShared = contentShared;
	}
	public int getAdsRun() {
		return adsRun;
	}
	public void setAdsRun(int adsRun) {
		this.adsRun = adsRun;
	}
	public int getActivePromotions() {
		return activePromotions;
	}
	public void setActivePromotions(int activePromotions) {
		this.activePromotions = activePromotions;
	}
	public int getTotalStories() {
		return totalStories;
	}
	public void setTotalStories(int totalStories) {
		this.totalStories = totalStories;
	}
	public int getTotalFollows() {
		return totalFollows;
	}
	public void setTotalFollows(int totalFollows) {
		this.totalFollows = totalFollows;
	}
	public int getTotalSaves() {
		return totalSaves;
	}
	public void setTotalSaves(int totalSaves) {
		this.totalSaves = totalSaves;
	}
	public int getTotalComments() {
		return totalComments;
	}
	public void setTotalComments(int totalComments) {
		this.totalComments = totalComments;
	}
	public int getTotalShares() {
		return totalShares;
	}
	public void setTotalShares(int totalShares) {
		this.totalShares = totalShares;
	}
	public UserAnalytics(Long id, String username, int followers, int following, int posts, String name,
			String category, String bio, String contactOptions, String links, int accountReached, int accountEngaged,
			int contentShared, int adsRun, int activePromotions, int totalStories, int totalFollows, int totalSaves,
			int totalComments, int totalShares) {
		super();
		this.id = id;
		this.username = username;
		this.followers = followers;
		this.following = following;
		this.posts = posts;
		this.name = name;
		this.category = category;
		this.bio = bio;
		this.contactOptions = contactOptions;
		this.links = links;
		this.accountReached = accountReached;
		this.accountEngaged = accountEngaged;
		this.contentShared = contentShared;
		this.adsRun = adsRun;
		this.activePromotions = activePromotions;
		this.totalStories = totalStories;
		this.totalFollows = totalFollows;
		this.totalSaves = totalSaves;
		this.totalComments = totalComments;
		this.totalShares = totalShares;
	}
	public UserAnalytics() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "UserAnalytics [id=" + id + ", username=" + username + ", followers=" + followers + ", following="
				+ following + ", posts=" + posts + ", name=" + name + ", category=" + category + ", bio=" + bio
				+ ", contactOptions=" + contactOptions + ", links=" + links + ", accountReached=" + accountReached
				+ ", accountEngaged=" + accountEngaged + ", contentShared=" + contentShared + ", adsRun=" + adsRun
				+ ", activePromotions=" + activePromotions + ", totalStories=" + totalStories + ", totalFollows="
				+ totalFollows + ", totalSaves=" + totalSaves + ", totalComments=" + totalComments + ", totalShares="
				+ totalShares + "]";
	}
    
    
}

