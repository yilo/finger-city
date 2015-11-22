package org.racoon.finger.city.web.services.impls;

import java.util.List;
import java.util.UUID;

import org.racoon.finger.city.jpa.entity.Contact;
import org.racoon.finger.city.jpa.repos.ContactRepository;
import org.racoon.finger.city.web.services.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	ContactRepository contactRepository;

	@Override
	public void save(UUID pid, Contact c) {
		c.setProviderId(pid);
		contactRepository.save(c);
	}

	@Override
	public void save(UUID pid, List<Contact> cs) {
		cs.forEach(i -> i.setProviderId(pid));
		contactRepository.save(cs);
	}

}
