package org.racoon.finger.city.jpa.entity;

import java.io.Serializable;
import java.util.UUID;

/** created by Long created on Nov 21, 2015 **/
public class ProviderCategoryId implements Serializable {

	private static final long serialVersionUID = -7528499752834732994L;
	private UUID providerId;
	private UUID categoryId;

	public UUID getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(UUID categoryId) {
		this.categoryId = categoryId;
	}

	public UUID getProviderId() {
		return providerId;
	}

	public void setProviderId(UUID providerId) {
		this.providerId = providerId;
	}
}
