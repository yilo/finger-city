package org.racoon.finger.city.jpa.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "t_provider")
public class Provider implements Serializable {

	private static final long serialVersionUID = -297246741580414543L;

	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	@Column(name = "providerId")
	private UUID providerId;
	@Column(name = "providerName")
	private String providerName;// company name
	@Column(name = "email")
	private String email; // main email
	@Column(name = "verified", columnDefinition = "bit(1)")
	private Boolean verifed = false;
	@Column(name = "shortDescription")
	private String description; // basic description
	@Column(name = "createdOn")
	private Timestamp createdOn;
	@Column(name = "ModifiedOn", nullable = true)
	private Timestamp modifiedOn;
	@Column(name = "modifiedBy", nullable = true)
	private String modifiedBy;
	@Column(name = "status", columnDefinition = "bit(1)")
	private Boolean status = true;

	// @OneToMany(fetch = FetchType.EAGER, cascade = { CascadeType.ALL },
	// orphanRemoval = true, mappedBy = "provider")
	// private Set<Address> addresses = Sets.newHashSet();
	//
	// @OneToMany(fetch = FetchType.EAGER, cascade = { CascadeType.ALL },
	// orphanRemoval = true, mappedBy = "provider")
	// private Set<Contact> contacts = Sets.newHashSet();

	//
	// @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	// @JoinTable(name = "t_provider_category", joinColumns = { @JoinColumn(name
	// = "providerId") }, inverseJoinColumns = {
	// @JoinColumn(name = "categoryId") })
	// private Set<Category> categories = Sets.newHashSet();

	public UUID getProviderId() {
		return providerId;
	}

	public void setProviderId(UUID providerId) {
		this.providerId = providerId;
	}

	public String getProviderName() {
		return providerName;
	}

	public void setProviderName(String providerName) {
		this.providerName = providerName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Timestamp getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Timestamp createdOn) {
		this.createdOn = createdOn;
	}

	public Timestamp getModifiedOn() {
		return modifiedOn;
	}

	public void setModifiedOn(Timestamp modifiedOn) {
		this.modifiedOn = modifiedOn;
	}

	public Boolean getVerifed() {
		return verifed;
	}

	public void setVerifed(Boolean verifed) {
		this.verifed = verifed;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	// public Set<Contact> getContacts() {
	// return contacts;
	// }
	//
	// public void setContacts(Set<Contact> contacts) {
	// this.contacts = contacts;
	// }
	//
	// public Set<Address> getAddresses() {
	// return addresses;
	// }
	//
	// public void setAddresses(Set<Address> addresses) {
	// this.addresses = addresses;
	// }

	// public Set<Category> getCategories() {
	// return categories;
	// }
	//
	// public void setCategories(Set<Category> categories) {
	// this.categories = categories;
	// }

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

}
