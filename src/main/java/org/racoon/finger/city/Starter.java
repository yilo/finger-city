package org.racoon.finger.city;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * created by long, created on Nov 20, 2015
 */

@SpringBootApplication
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = { "org.racoon.finger.city.jpa.repos" })
public class Starter {

	public static void main(String[] args) {
		SpringApplication.run(Starter.class, args);
	}

}
