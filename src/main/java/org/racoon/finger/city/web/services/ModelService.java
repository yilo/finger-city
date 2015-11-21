package org.racoon.finger.city.web.services;

import java.util.List;

import org.racoon.finger.city.web.models.Filter;

/** created by Long created on Nov 20, 2015 **/

public interface ModelService<T> {

	T findById(int id);
	

	
	List<T> search(List<Filter> filters);
}
