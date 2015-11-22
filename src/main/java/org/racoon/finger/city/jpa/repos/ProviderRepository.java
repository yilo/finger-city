package org.racoon.finger.city.jpa.repos;

import java.util.UUID;

import org.racoon.finger.city.jpa.entity.Provider;
import org.springframework.data.jpa.repository.JpaRepository;

/** created by Long created on Nov 21, 2015 **/
public interface ProviderRepository extends JpaRepository<Provider, UUID> {

	Provider findByEmailIgnoreCase(String email);
}
