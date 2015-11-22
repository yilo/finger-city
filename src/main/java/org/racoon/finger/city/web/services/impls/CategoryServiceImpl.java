package org.racoon.finger.city.web.services.impls;

import java.util.List;
import java.util.UUID;

import org.racoon.finger.city.jpa.entity.Category;
import org.racoon.finger.city.jpa.repos.CategoryRepository;
import org.racoon.finger.city.web.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;

public class CategoryServiceImpl implements CategoryService {

	@Autowired
	CategoryRepository categoryRepository;

	@Override
	public UUID save(Category c) {
		return categoryRepository.save(c).getCategoryId();
	}

	@Override
	public UUID save(UUID pid, List<Category> cs) {
		// TODO Auto-generated method stub
		return null;
	}

}
