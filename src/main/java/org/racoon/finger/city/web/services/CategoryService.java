package org.racoon.finger.city.web.services;

import java.util.List;
import java.util.UUID;

import org.racoon.finger.city.jpa.entity.Category;

public interface CategoryService {

	UUID save(Category c);

	UUID save(UUID pid, List<Category> cs);
}
