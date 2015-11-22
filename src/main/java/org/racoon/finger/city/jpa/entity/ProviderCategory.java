package org.racoon.finger.city.jpa.entity;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

/** created by Long created on Nov 21, 2015 **/

@Entity
@Table(name = "T_Provider_Category")
@IdClass(ProviderCategoryId.class)
public class ProviderCategory {
	@Id
	@Column(name = "providerId")
	private UUID providerId;
	@Id
	@Column(name = "categoryId")
	private UUID categoryId;

	@Column(name = "status", columnDefinition = "CHAR(1)")
	private String status;

	public UUID getProviderId() {
		return providerId;
	}

	public void setProviderId(UUID providerId) {
		this.providerId = providerId;
	}

	public UUID getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(UUID categoryId) {
		this.categoryId = categoryId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
