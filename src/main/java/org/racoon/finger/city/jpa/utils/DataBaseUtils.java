package org.racoon.finger.city.jpa.utils;

import javax.sql.DataSource;

import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

/**
 * created by long, created on Nov 20, 2015
 */
public class DataBaseUtils {

	public static LocalContainerEntityManagerFactoryBean createEntityManagerFactory(DataSource eds, HibernateJpaVendorAdapter hJpa,
			String entityPkgName) {
		LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
		em.setDataSource(eds);
		em.setPackagesToScan(entityPkgName);
		em.setJpaVendorAdapter(hJpa);
		return em;
	}

	public static PlatformTransactionManager createTransactionManager(LocalContainerEntityManagerFactoryBean entityManagerFactory) {
		JpaTransactionManager tm = new JpaTransactionManager();
		tm.setEntityManagerFactory(entityManagerFactory.getObject());
		return tm;
	}

}
