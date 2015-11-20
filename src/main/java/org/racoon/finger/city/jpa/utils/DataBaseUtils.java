package org.racoon.finger.city.jpa.utils;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/**
 * created by long, created on Nov 20, 2015
 */
public class DataBaseUtils {

	private static final String HIBERNATE_DIALECT_KEY = "hibernate.dialect";
	private static final String HIBERNATE_DIALECT_VALUE = "org.hibernate.dialect.Oracle10gDialect";
	private static final String HIBERNATE_SCHEMA_KEY = "hibernate.default_schema";
	private static final String HIBERNATE_DDL_AUTO_KEY = "hibernate.hbm2ddl.auto";
	private static final String HIBERNATE_DDL_AUTO_VALUE = "validate";
	private static final String HIBERNATE_ENABLE_LAZY_KEY = "hibernate.enable_lazy_load_no_trans";
	private static final String HIBERNATE_ENABLE_LAZY_VAULE = "true";

	public static DataSource createEncryptDataSource(String jdbcDriverName, String dbUrl, String dbUser, String dbPasswd, String parts, int minConn,
			int maxConn) throws Exception {
		ComboPooledDataSource cpds = new ComboPooledDataSource();

		cpds.setJdbcUrl(dbUrl);
		cpds.setDriverClass(jdbcDriverName);
		cpds.setUser(dbUser);
		cpds.setPassword(EncryptUtils.decrypt(dbPasswd));
		cpds.setMinPoolSize(minConn);
		cpds.setMaxPoolSize(maxConn);

		return cpds;
	}

	public static LocalContainerEntityManagerFactoryBean createEntityManagerFactory(DataSource eds, String entityPkgName,
			String hibernateDefaultSchema) {
		LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
		em.setDataSource(eds);
		em.setPackagesToScan(entityPkgName);// "com.jpmorgan.gti.webaas.jasp.apis.myweb.db.entity"

		HibernateJpaVendorAdapter hJpa = new HibernateJpaVendorAdapter();
		hJpa.setGenerateDdl(true);
		hJpa.setShowSql(true);

		em.setJpaVendorAdapter(hJpa);

		Properties p = new Properties();
		p.setProperty(HIBERNATE_DIALECT_KEY, HIBERNATE_DIALECT_VALUE);
		p.setProperty(HIBERNATE_SCHEMA_KEY, hibernateDefaultSchema);
		p.setProperty(HIBERNATE_DDL_AUTO_KEY, HIBERNATE_DDL_AUTO_VALUE);
		p.setProperty(HIBERNATE_ENABLE_LAZY_KEY, HIBERNATE_ENABLE_LAZY_VAULE);
		em.setJpaProperties(p);

		return em;
	}

	public static PlatformTransactionManager createTransactionManager(LocalContainerEntityManagerFactoryBean entityManagerFactory) {
		JpaTransactionManager tm = new JpaTransactionManager();
		tm.setEntityManagerFactory(entityManagerFactory.getObject());
		return tm;
	}

}
