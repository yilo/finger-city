package org.racoon.finger.city.jpa.factory;

import javax.sql.DataSource;

/**
 * created by long, created on Nov 20, 2015
 */
public interface DataSourceFactory {

	DataSource getDataSource() throws Exception;
}
