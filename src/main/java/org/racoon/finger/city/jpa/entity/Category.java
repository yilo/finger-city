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
@Table(name = "t_category")
public class Category implements Serializable {

	private static final long serialVersionUID = -2796745703323475767L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "categoryId")
	private int categoryId;
	@Column(name = "categoryParentId")
	private int categoryParentId;
	@Column(name = "categoryName")
	private String categoryName;
	@Column(name = "categoryInfo")
	private String categoryInfo;
	@Column(name = "status", columnDefinition = "bit(1)")
	private Boolean status;

	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "categories")
	private Set<Provider> providers = Sets.newHashSet();

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
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

	public Set<Provider> getProviders() {
		return providers;
	}

	public void setProviders(Set<Provider> providers) {
		this.providers = providers;
	}
}
