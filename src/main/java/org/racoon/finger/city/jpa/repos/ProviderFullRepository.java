package org.racoon.finger.city.jpa.repos;

import java.util.Set;

import org.racoon.finger.city.jpa.entity.Address;
import org.racoon.finger.city.jpa.entity.Category;
import org.racoon.finger.city.jpa.entity.Contact;
import org.racoon.finger.city.jpa.entity.Provider;

/** created by Long created on Nov 20, 2015 **/
public interface ProviderFullRepository {

	int save(Provider p, Set<Address> addresses, Set<Contact> contacts, Set<Category> categories);
}
