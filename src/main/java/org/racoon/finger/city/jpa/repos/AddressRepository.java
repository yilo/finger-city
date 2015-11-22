package org.racoon.finger.city.jpa.repos;

import java.util.UUID;

import org.racoon.finger.city.jpa.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, UUID> {

}
