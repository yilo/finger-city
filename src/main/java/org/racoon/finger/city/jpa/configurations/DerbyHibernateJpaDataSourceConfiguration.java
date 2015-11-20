package org.racoon.finger.city.jpa.configurations;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * created by long, created on Nov 20, 2015
 */
@Component
@ConfigurationProperties(locations = "classpath:datasource_derby.properties", prefix = "datasource")
public class DerbyHibernateJpaDataSourceConfiguration {

	public String test;

	public DerbyDataSourceConfiguration derby;

	public HibernateJpaConfiguration hibernate;
}
