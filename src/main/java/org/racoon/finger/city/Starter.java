package org.racoon.finger.city;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * created by long, created on Nov 20, 2015
 */

@SpringBootApplication
@EnableJpaRepositories(basePackages = { "org.racoon.finger.city.jpa.repos" })
public class Starter {

	public static void main(String[] args) {
		SpringApplication.run(Starter.class, args);
	}

}
