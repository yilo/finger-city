package org.racoon.finger.city.jpa.entity;

import java.io.Serializable;

/** created by Long created on Nov 21, 2015 **/
public class ProviderAddressId implements Serializable {

	private static final long serialVersionUID = 4279092740202927020L;
	private int providerId;
	private int addressId;

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
