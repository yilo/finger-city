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

	@Bean
	public LocalContainerEntityManagerFactoryBean getLocalContainerEntityManagerFactoryBean() throws Exception {
		return DataBaseUtils.createEntityManagerFactory(derbyFactory.getDataSource(), derbyFactory.getJpaAdapter(),
				derbyFactory.getEntityPackageName());
	}

	@Bean
	public PlatformTransactionManager getPlatformTransactionManager() throws Exception {
		return DataBaseUtils.createTransactionManager(getLocalContainerEntityManagerFactoryBean());
	}
}
