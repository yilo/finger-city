package org.racoon.finger.city.jpa.factory.impls;

import javax.sql.DataSource;

import org.racoon.finger.city.jpa.configurations.DerbyHibernateJpaDataSourceConfiguration;
import org.racoon.finger.city.jpa.factory.DataSourceFactory;
import org.racoon.finger.city.jpa.factory.HibernateConfigFactory;
import org.racoon.finger.city.jpa.utils.EncryptUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.stereotype.Component;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/**
 * created by long, created on Nov 20, 2015
 */
@Component
public class DerbyFactory implements DataSourceFactory, HibernateConfigFactory {

	@Autowired
	DerbyHibernateJpaDataSourceConfiguration config;

	public String getEntityPackageName() {
		return config.hibernate.entityPackageName;
	}

	@Override
	public HibernateJpaVendorAdapter getJpaAdapter() {
		HibernateJpaVendorAdapter hJpa = new HibernateJpaVendorAdapter();
		hJpa.setShowSql(config.hibernate.showSql);
		hJpa.setDatabase(Database.valueOf(config.hibernate.database));
		hJpa.getJpaPropertyMap().put(HibernateConfigFactory.HIBERNATE_DDL_AUTO_KEY, "validate");
		hJpa.getJpaPropertyMap().put(HibernateConfigFactory.HIBERNATE_SCHEMA_KEY, config.hibernate.schema);
		return hJpa;
	}

	@Override
	public DataSource getDataSource() throws Exception {
		ComboPooledDataSource cpds = new ComboPooledDataSource();
		cpds.setJdbcUrl(config.derby.url);
		cpds.setDriverClass(config.derby.driverName);
		cpds.setUser(config.derby.user);
		cpds.setPassword(EncryptUtils.decrypt(config.derby.pwd));
		cpds.setMinPoolSize(config.derby.minPoolSize);
		cpds.setMaxPoolSize(config.derby.maxPoolSize);
		return cpds;
	}

}
