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

/** created by Long created on Nov 20, 2015 **/

@Entity
@Table(name = "t_contact")
public class Contact implements Serializable {

	private static final long serialVersionUID = 9172419798646598643L;

	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	@Column(name = "contactId")
	private UUID contactId;
	@Column(name = "email")
	private String email;
	@Column(name = "contactName")
	private String contactName;
	@Column(name = "phone")
	private String phone;
	@Column(name = "status", columnDefinition = "bit(1)")
	private Boolean status = true;
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

	@Column(name = "providerId")
	private UUID providerId;

	public UUID getProviderId() {
		return providerId;
	}

	public void setProviderId(UUID providerId) {
		this.providerId = providerId;
	}

	public UUID getContactId() {
		return contactId;
	}

	public void setContactId(UUID contactId) {
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

}
