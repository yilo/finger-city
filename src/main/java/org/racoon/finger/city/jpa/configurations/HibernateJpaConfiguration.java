package org.racoon.finger.city.jpa.configurations;

/**
 * created by long, created on Nov 20, 2015
 */

public class HibernateJpaConfiguration extends JpaConfiguration {

	private String schema;
	private boolean showSql;
	private String database;
	private String entityPackageName;
	public String getSchema() {
		return schema;
	}
	public void setSchema(String schema) {
		this.schema = schema;
	}
	public boolean isShowSql() {
		return showSql;
	}
	public void setShowSql(boolean showSql) {
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
