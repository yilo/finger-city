package org.racoon.finger.city.jpa.entity;

import java.io.Serializable;

/** created by Long created on Nov 21, 2015 **/
public class ProviderCategoryId implements Serializable {

	private static final long serialVersionUID = -7528499752834732994L;
	private int providerId;
	private int categoryId;

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public int getProviderId() {
		return providerId;
	}

	public void setProviderId(int providerId) {
		this.providerId = providerId;
	}
}
