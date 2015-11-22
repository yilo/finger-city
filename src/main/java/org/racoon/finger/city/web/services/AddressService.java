package org.racoon.finger.city.web.services;

import java.util.List;
import java.util.UUID;

import org.racoon.finger.city.jpa.entity.Address;

public interface AddressService {

	void save(UUID pid, Address address);

	void save(UUID pid, List<Address> address);

}
