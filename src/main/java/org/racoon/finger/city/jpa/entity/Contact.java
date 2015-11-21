package org.racoon.finger.city.jpa.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.google.common.collect.Sets;

/** created by Long created on Nov 20, 2015 **/

@Entity
@Table(name = "t_contact")
public class Contact implements Serializable {

	private static final long serialVersionUID = 9172419798646598643L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "contactId")
	private int contactId;
	@Column(name = "email")
	private String email;
	@Column(name = "contactName")
	private String contactName;
	@Column(name = "phone")
	private String phone;
	@Column(name = "status", columnDefinition="bit(1)")
	private Boolean status;


	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "contacts")
	private Set<Provider> providers = Sets.newHashSet();
	
	public int getContactId() {
		return contactId;
	}

	public void setContactId(int contactId) {
		this.contactId = contactId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public Set<Provider> getProviders() {
		return providers;
	}

	public void setProviders(Set<Provider> providers) {
		this.providers = providers;
	}
}
