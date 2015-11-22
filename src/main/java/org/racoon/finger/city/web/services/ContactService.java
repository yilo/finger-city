package org.racoon.finger.city.web.services;

import java.util.List;
import java.util.UUID;

import org.racoon.finger.city.jpa.entity.Contact;

public interface ContactService {

	void save(UUID pid, Contact c);

	void save(UUID pid, List<Contact> cs);
}
