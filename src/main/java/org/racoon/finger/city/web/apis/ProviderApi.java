package org.racoon.finger.city.web.apis;

import org.racoon.finger.city.jpa.entity.Provider;
import org.racoon.finger.city.web.services.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * created by long, created on Nov 20, 2015
 */
@RestController
@RequestMapping(value = "/providers.json", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
public class ProviderApi {

	@Autowired
	ProviderService providerService;

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Provider getProviderById(@PathVariable("id") int id) {
		return providerService.findById(id);
	}

	@RequestMapping(method = RequestMethod.POST)
	public int createProvider(@RequestBody Provider provider) {
		return providerService.save(provider);
	}
}
