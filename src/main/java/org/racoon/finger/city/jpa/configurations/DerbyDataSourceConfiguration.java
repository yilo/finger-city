package org.racoon.finger.city.jpa.configurations;


/**
 * created by long, created on Nov 20, 2015
 */

public class DerbyDataSourceConfiguration extends DataSourceConfiguration {

	private String url;
	private int minPoolSize;
	private int maxPoolSize;
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public int getMinPoolSize() {
		return minPoolSize;
	}
	public void setMinPoolSize(int minPoolSize) {
		this.minPoolSize = minPoolSize;
	}
	public int getMaxPoolSize() {
		return maxPoolSize;
	}
	public void setMaxPoolSize(int maxPoolSize) {
		this.maxPoolSize = maxPoolSize;
	}
}
