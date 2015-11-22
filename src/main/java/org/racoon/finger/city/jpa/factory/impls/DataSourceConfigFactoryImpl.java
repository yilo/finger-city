package org.racoon.finger.city.jpa.factory.impls;

import javax.sql.DataSource;

import org.racoon.finger.city.jpa.factory.DataSourceConfigFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/** created by Long created on Nov 21, 2015 **/
@Component
@ConfigurationProperties(locations = "classpath:mysql/datasource.properties", prefix = "datasource")
public class DataSourceConfigFactoryImpl implements DataSourceConfigFactory {

	private String user;
	private String pwd;
	private String driverName;
	private String url;
	private int minPoolSize;
	private int maxPoolSize;

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

	@Override
	public DataSource getDataSource() throws Exception {

		ComboPooledDataSource cpds = new ComboPooledDataSource();
		cpds.setJdbcUrl(getUrl());
		cpds.setDriverClass(getDriverName());
		cpds.setUser(getUser());
		cpds.setPassword(getPwd());
		cpds.setMinPoolSize(getMinPoolSize());
		cpds.setMaxPoolSize(getMaxPoolSize());
		return cpds;
	}
}
