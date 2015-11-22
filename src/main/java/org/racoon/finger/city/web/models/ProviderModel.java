package org.racoon.finger.city.web.models;

import java.sql.Timestamp;
import java.util.Set;
import java.util.UUID;

import org.racoon.finger.city.jpa.entity.Address;
import org.racoon.finger.city.jpa.entity.Category;
import org.racoon.finger.city.jpa.entity.Contact;

/** created by Long created on Nov 21, 2015 **/
public class ProviderModel {

	public UUID providerId;
	public String providerName;// company name
	public String email; // main email
	public String verifed;
	public int score; // score based on feedback
	public String description; // basic description
	public Timestamp createdOn;
	public Timestamp modifiedOn;
	public Timestamp lastLogOn;
	public Set<Contact> contacts;
	public Set<Address> addresses;
	public Set<Category> categories;
}
