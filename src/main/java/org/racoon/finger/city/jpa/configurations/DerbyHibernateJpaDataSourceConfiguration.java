package org.racoon.finger.city.jpa.configurations;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * created by long, created on Nov 20, 2015
 */
@Component
@ConfigurationProperties(locations = "classpath:derby/datasource.properties", prefix = "datasource")
public class DerbyHibernateJpaDataSourceConfiguration {


	private DerbyDataSourceConfiguration derby;

	private HibernateJpaConfiguration hibernate;

	public DerbyDataSourceConfiguration getDerby() {
		return derby;
	}

	public void setDerby(DerbyDataSourceConfiguration derby) {
		this.derby = derby;
	}

	public HibernateJpaConfiguration getHibernate() {
		return hibernate;
	}

	public void setHibernate(HibernateJpaConfiguration hibernate) {
		this.hibernate = hibernate;
	}
}
