package org.racoon.finger.city.jpa.factory.impls;

import javax.sql.DataSource;

import org.racoon.finger.city.jpa.configurations.DerbyHibernateJpaDataSourceConfiguration;
import org.racoon.finger.city.jpa.factory.DataSourceFactory;
import org.racoon.finger.city.jpa.factory.HibernateConfigFactory;
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
		return config.getHibernate().getEntityPackageName();
	}

	@Override
	public HibernateJpaVendorAdapter getJpaAdapter() {
		HibernateJpaVendorAdapter hJpa = new HibernateJpaVendorAdapter();
		hJpa.setShowSql(config.getHibernate().isShowSql());
		hJpa.setDatabase(Database.valueOf(config.getHibernate().getDatabase()));
		hJpa.getJpaPropertyMap().put(HibernateConfigFactory.HIBERNATE_DDL_AUTO_KEY, "validate");
		hJpa.getJpaPropertyMap().put(HibernateConfigFactory.HIBERNATE_SCHEMA_KEY, config.getHibernate().getSchema());
		return hJpa;
	}

	@Override
	public DataSource getDataSource() throws Exception {
		ComboPooledDataSource cpds = new ComboPooledDataSource();
		cpds.setJdbcUrl(config.getDerby().getUrl());
		cpds.setDriverClass(config.getDerby().getDriverName());
		cpds.setUser(config.getDerby().getUser());
		cpds.setPassword(config.getDerby().getPwd());
		cpds.setMinPoolSize(config.getDerby().getMinPoolSize());
		cpds.setMaxPoolSize(config.getDerby().getMaxPoolSize());
		String derbyHome = System.getProperty("user.home") + System.getProperty("file.separator") + "derby";
		System.setProperty("derby.system.home", derbyHome);
		return cpds;
	}

}
