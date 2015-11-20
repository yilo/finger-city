package org.racoon.finger.city.web.apis;

import org.racoon.finger.city.jpa.entity.Provider;
import org.racoon.finger.city.jpa.repos.ProviderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * created by long, created on Nov 20, 2015
 */
@RestController
@RequestMapping(value = "/providers.json")
public class ProviderApi {

	@Autowired
	ProviderRepository providerRepository;

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Provider getUserById(@PathVariable("id") int id) {
		return providerRepository.findOne(id);
	}
}
