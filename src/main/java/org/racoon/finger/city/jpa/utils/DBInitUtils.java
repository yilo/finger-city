package org.racoon.finger.city.jpa.utils;

import javax.sql.DataSource;

import org.racoon.finger.city.jpa.factory.DataSourceConfigFactory;
import org.racoon.finger.city.jpa.factory.HibernateConfigFactory;
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
	DataSourceConfigFactory dataSourceFactory;

	@Autowired
	HibernateConfigFactory hibernateConfigFactory;

	private LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean;

	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory() throws Exception {
		if (localContainerEntityManagerFactoryBean == null)
			localContainerEntityManagerFactoryBean = DataBaseUtils.createEntityManagerFactory(
					dataSourceFactory.getDataSource(), hibernateConfigFactory.getJpaAdapter(),
					hibernateConfigFactory.getEntityPackageName());
		return localContainerEntityManagerFactoryBean;
	}
	
	@Bean
	public DataSource dataSource() throws Exception{
		return dataSourceFactory.getDataSource();
	}

	@Bean
	public PlatformTransactionManager transactionManager() throws Exception {
		return DataBaseUtils.createTransactionManager(entityManagerFactory().getObject());
	}
}
