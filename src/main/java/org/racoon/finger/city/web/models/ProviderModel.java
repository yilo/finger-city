package org.racoon.finger.city.web.models;

import java.sql.Timestamp;
import java.util.Set;

import org.racoon.finger.city.jpa.entity.Address;
import org.racoon.finger.city.jpa.entity.Category;
import org.racoon.finger.city.jpa.entity.Contact;

/** created by Long created on Nov 21, 2015 **/
public class ProviderModel {

	private int providerId;
	private String providerName;// company name
	private String email; // main email
	private String verifed;
	private int score; // score based on feedback
	private String description; // basic description
	private Timestamp createdOn;
	private Timestamp modifiedOn;
	private Timestamp lastLogOn;
	private Set<Contact> contacts;
	private Set<Address> addresses;
	private Set<Category> categories;
}
