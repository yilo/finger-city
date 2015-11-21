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

@Entity
@Table(name = "t_address")
public class Address implements Serializable {
	public Address() {
	}

	private static final long serialVersionUID = -6290847335053243570L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "addressId")
	private int addressId;

	@Column(name = "postcode")
	private int postCode;

	@Column(name = "street")
	private String street;

	@Column(name = "number")
	private String number;

	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "addresses")
	private Set<Provider> providers = Sets.newHashSet();

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public Set<Provider> getProviders() {
		return providers;
	}

	public void setProviders(Set<Provider> providers) {
		this.providers = providers;
	}

	public int getPostCode() {
		return postCode;
	}

	public void setPostCode(int postCode) {
		this.postCode = postCode;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

}
