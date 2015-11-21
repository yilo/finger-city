package org.racoon.finger.city.jpa.entity;
/** created by Long created on Nov 21, 2015 **/

public class ProviderExtInfo {

	private int level;
	private String website;
	private int facebookId;
	private int twitterId;
	private int providerId;
	
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public int getFacebookId() {
		return facebookId;
	}
	public void setFacebookId(int facebookId) {
		this.facebookId = facebookId;
	}
	public int getTwitterId() {
		return twitterId;
	}
	public void setTwitterId(int twitterId) {
		this.twitterId = twitterId;
	}
	public int getProviderId() {
		return providerId;
	}
	public void setProviderId(int providerId) {
		this.providerId = providerId;
	} 
}
