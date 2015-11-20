package org.racoon.finger.city.web.services;

import java.util.List;

import org.racoon.finger.city.jpa.entity.Provider;
import org.racoon.finger.city.jpa.repos.ProviderRepository;
import org.racoon.finger.city.web.models.Filter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/** created by Long created on Nov 20, 2015 **/
@Service
public class ProviderService implements ModelService<Provider>{
	@Autowired
	ProviderRepository providerRepository;

	@Override
	public Provider findById(int id) {
		return providerRepository.findOne(id);
	}

	@Override
	public int save(Provider t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Provider> search(List<Filter> filters) {
		// TODO Auto-generated method stub
		return null;
	}
}
