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
@Table(name = "t_category")
public class Category implements Serializable {

	private static final long serialVersionUID = -2796745703323475767L;
	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	@Column(name = "categoryId")
	private UUID categoryId;
	@Column(name = "categoryParentId")
	private int categoryParentId;
	@Column(name = "categoryName")
	private String categoryName;
	@Column(name = "categoryInfo")
	private String categoryInfo;
	@Column(name = "status", columnDefinition = "bit(1)")
	private Boolean status = true;
	@Column(name = "createdOn")
	private Timestamp createdOn;
	@Column(name = "ModifiedOn", nullable = true)
	private Timestamp modifiedOn;
	@Column(name = "modifiedBy", nullable = true)
	private String modifiedBy;

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

	public UUID getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(UUID categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getCategoryInfo() {
		return categoryInfo;
	}

	public void setCategoryInfo(String categoryInfo) {
		this.categoryInfo = categoryInfo;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public int getCategoryParentId() {
		return categoryParentId;
	}

	public void setCategoryParentId(int categoryParentId) {
		this.categoryParentId = categoryParentId;
	}

	// public Set<Provider> getProviders() {
	// return providers;
	// }
	//
	// public void setProviders(Set<Provider> providers) {
	// this.providers = providers;
	// }
}
