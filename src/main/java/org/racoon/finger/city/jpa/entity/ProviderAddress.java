package org.racoon.finger.city.jpa.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

/** created by Long created on Nov 21, 2015 **/
@Entity
@Table(name = "T_Provider_Address")
@IdClass(ProviderAddressId.class)
public class ProviderAddress implements Serializable {

	private static final long serialVersionUID = 6190785256131273602L;

	public ProviderAddress() {
	}

	public ProviderAddress(int providerId, int addressId) {
		this.providerId = providerId;
		this.addressId = addressId;
	}

	@Id
	@Column(name = "providerId")
	private int providerId;
	@Id
	@Column(name = "addressId")
	private int addressId;

	@Column(name = "status", columnDefinition = "CHAR(1)")
	private String status;

	public int getProviderId() {
		return providerId;
	}

	public void setProviderId(int providerId) {
		this.providerId = providerId;
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
}
