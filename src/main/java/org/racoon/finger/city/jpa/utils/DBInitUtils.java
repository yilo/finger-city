package org.racoon.finger.city.jpa.utils;

import org.racoon.finger.city.jpa.factory.impls.DerbyFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;

/**
 * created by long, created on Nov 20, 2015
 */
@Configuration
public class DBInitUtils {

	@Autowired
	DerbyFactory derbyFactory;

	private LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean;

	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory() throws Exception {
		if (localContainerEntityManagerFactoryBean == null)
			localContainerEntityManagerFactoryBean = DataBaseUtils.createEntityManagerFactory(
					derbyFactory.getDataSource(), derbyFactory.getJpaAdapter(), derbyFactory.getEntityPackageName());
		return localContainerEntityManagerFactoryBean;
	}



	@Bean
	public PlatformTransactionManager transactionManager() throws Exception {
		return DataBaseUtils.createTransactionManager(entityManagerFactory().getObject());
	}
}
