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
@Table(name = "t_address")
public class Address implements Serializable {
	public Address() {
	}

	private static final long serialVersionUID = -6290847335053243570L;

	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	@Column(name = "addressId", columnDefinition = "binary(16)")
	private UUID addressId;

	@Column(name = "postcode")
	private int postCode;

	@Column(name = "street")
	private String street;

	@Column(name = "number")
	private String number;

	@Column(name = "createdOn")
	private Timestamp createdOn;

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

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	@Column(name = "ModifiedOn", nullable = true)
	private Timestamp modifiedOn;
	@Column(name = "modifiedBy", nullable = true)
	private String modifiedBy;

	// @ManyToOne(optional = false)
	// @JoinColumn(name = "providerId", nullable = false)
	@Column(name = "providerId")
	private UUID providerId;

	public UUID getProviderId() {
		return providerId;
	}

	public void setProviderId(UUID providerId) {
		this.providerId = providerId;
	}

	public UUID getAddressId() {
		return addressId;
	}

	public void setAddressId(UUID addressId) {
		this.addressId = addressId;
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
