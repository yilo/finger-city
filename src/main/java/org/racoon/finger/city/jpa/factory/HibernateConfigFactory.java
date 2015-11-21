package org.racoon.finger.city.jpa.factory;

import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

/**
 * created by long, created on Nov 20, 2015
 */
public interface HibernateConfigFactory {
	String HIBERNATE_SCHEMA_KEY = "hibernate.default_schema";
	String HIBERNATE_DDL_AUTO_KEY = "hibernate.hbm2ddl.auto";

	HibernateJpaVendorAdapter getJpaAdapter();
	
	String getEntityPackageName();
}
