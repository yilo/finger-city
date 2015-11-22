package org.racoon.finger.city.web.services;

import java.util.UUID;

import org.racoon.finger.city.jpa.entity.Provider;

public interface ProviderService {

	UUID save(Provider p);
}
