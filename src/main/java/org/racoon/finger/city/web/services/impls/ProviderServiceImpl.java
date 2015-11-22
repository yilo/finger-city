package org.racoon.finger.city.web.services.impls;

import java.util.UUID;

import org.racoon.finger.city.jpa.entity.Provider;
import org.racoon.finger.city.jpa.repos.ProviderRepository;
import org.racoon.finger.city.web.services.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProviderServiceImpl implements ProviderService {

	@Autowired
	ProviderRepository providerRepository;

	@Override
	public UUID save(Provider p) {
		return providerRepository.save(p).getProviderId();
	}

}
