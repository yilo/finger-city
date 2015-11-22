package org.racoon.finger.city.web.services.impls;

import java.util.List;
import java.util.UUID;

import org.racoon.finger.city.jpa.entity.Address;
import org.racoon.finger.city.jpa.repos.AddressRepository;
import org.racoon.finger.city.web.services.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl implements AddressService {

	@Autowired
	AddressRepository addressRepository;

	@Override
	public void save(UUID pid, Address address) {
		address.setProviderId(pid);
		addressRepository.save(address);
	}

	@Override
	public void save(UUID pid, List<Address> addresses) {
		addresses.forEach(i -> i.setProviderId(pid));
		addressRepository.save(addresses);
	}

}
