package org.racoon.finger.city.bootstrap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

/**
 * created by long, created on Nov 20, 2015
 */
@SpringBootApplication
@ComponentScan(basePackages = { "org.racoon.finger.city" })
@EnableConfigurationProperties
public class Starter {

	public static void main(String[] args) {
		SpringApplication.run(Starter.class, args);
	}

}
