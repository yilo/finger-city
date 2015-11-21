package org.racoon.finger.city.jpa.factory.impls;

import org.racoon.finger.city.jpa.factory.HibernateConfigFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.stereotype.Component;

/** created by Long created on Nov 21, 2015 **/
@Component
@ConfigurationProperties(locations = "classpath:mysql/hibernate.properties", prefix = "hibernate")
public class HibernateConfigFactoryImpl implements HibernateConfigFactory {

	private String schema;
	private Boolean showSql;
	private String database;
	private String entityPackageName;

	@Override
	public HibernateJpaVendorAdapter getJpaAdapter() {
		HibernateJpaVendorAdapter hJpa = new HibernateJpaVendorAdapter();
		hJpa.setShowSql(getShowSql());
		hJpa.setDatabase(Database.valueOf(getDatabase()));
		hJpa.getJpaPropertyMap().put(HibernateConfigFactory.HIBERNATE_DDL_AUTO_KEY, "validate");
//		hJpa.getJpaPropertyMap().put(HibernateConfigFactory.HIBERNATE_SCHEMA_KEY, getSchema());
		return hJpa;
	}

	public String getSchema() {
		return schema;
	}

	public void setSchema(String schema) {
		this.schema = schema;
	}

	public Boolean getShowSql() {
		return showSql;
	}

	public void setShowSql(Boolean showSql) {
		this.showSql = showSql;
	}

	public String getDatabase() {
		return database;
	}

	public void setDatabase(String database) {
		this.database = database;
	}

	public String getEntityPackageName() {
		return entityPackageName;
	}

	public void setEntityPackageName(String entityPackageName) {
		this.entityPackageName = entityPackageName;
	}

}
