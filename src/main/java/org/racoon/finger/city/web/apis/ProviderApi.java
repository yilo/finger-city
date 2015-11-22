package org.racoon.finger.city.web.apis;

import java.util.List;
import java.util.UUID;

import org.racoon.finger.city.jpa.entity.Address;
import org.racoon.finger.city.jpa.entity.Category;
import org.racoon.finger.city.jpa.entity.Contact;
import org.racoon.finger.city.jpa.entity.Provider;
import org.racoon.finger.city.web.services.AddressService;
import org.racoon.finger.city.web.services.CategoryService;
import org.racoon.finger.city.web.services.ContactService;
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
	AddressService addressService;

	@Autowired
	ProviderService providerService;

	@Autowired
	ContactService contactService;

	@Autowired
	CategoryService categoryService;

	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public UUID saveProvider(@RequestBody Provider p) {
		return providerService.save(p);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/{pid}/addresses")
	public void saveAddresses(@PathVariable("pid") UUID pid, @RequestBody List<Address> addresses) {
		addressService.save(pid, addresses);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/{pid}/contacts")
	public void saveContacts(@PathVariable("pid") UUID pid, @RequestBody List<Contact> contacts) {
		contactService.save(pid, contacts);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/{pid}/categories")
	public void saveCategories(@PathVariable("pid") UUID pid, @RequestBody List<Category> categories) {
		categoryService.save(pid, categories);
	}
}
