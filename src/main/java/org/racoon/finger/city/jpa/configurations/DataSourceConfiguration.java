package org.racoon.finger.city.jpa.configurations;

/**
 * created by long, created on Nov 20, 2015
 */
public class DataSourceConfiguration {

	private String user;
	private String pwd;
	private String driverName;
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getDriverName() {
		return driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
}
