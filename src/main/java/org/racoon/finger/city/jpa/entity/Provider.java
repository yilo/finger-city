package org.racoon.finger.city.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.joda.time.LocalDateTime;
import org.racoon.finger.city.jpa.models.Address;
import org.racoon.finger.city.jpa.models.Contact;
import org.racoon.finger.city.jpa.models.Description;

@Entity
@Table(name = "T_Provider")
public class Provider  {
	@Id
	@Column(name = "providerId")
	public int providerId;

	@Column(name = "providerName")
	public String providerName;

	@Column(name = "email")
	public String email;

	@Column(name = "IsVerified")
	public int isVerifed;
	
	public transient Address address;
	
	public transient Description description;
	
	public transient Contact contact;

	@Column(name = "createdOn")
	public LocalDateTime createdOn;

	@Column(name = "lastLogOn")
	public LocalDateTime lastLogOn;
}
