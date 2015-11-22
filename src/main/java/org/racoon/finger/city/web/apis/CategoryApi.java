package org.racoon.finger.city.web.apis;

import java.util.UUID;

import org.racoon.finger.city.jpa.entity.Category;
import org.racoon.finger.city.web.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/categories.json", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)

public class CategoryApi {

	@Autowired
	CategoryService categoryService;

	@RequestMapping(method = RequestMethod.POST)
	public UUID save(@RequestBody Category c) {
		return categoryService.save(c);
	}
}
