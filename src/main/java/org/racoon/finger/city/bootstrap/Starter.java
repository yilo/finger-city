package org.racoon.finger.city.bootstrap;

import org.racoon.finger.city.jpa.utils.DBInitUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * created by long, created on Nov 20, 2015
 */
@Configuration
@Import(value = { DBInitUtils.class })
@EnableAutoConfiguration
@ComponentScan(basePackages = { "org.racoon.finger.city" })
@EnableConfigurationProperties
@EnableJpaRepositories(basePackages = { "org.racoon.finger.city.jpa.repos" })
public class Starter {

	public static void main(String[] args) {
		SpringApplication.run(Starter.class, args);
	}

}
