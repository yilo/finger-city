package org.racoon.finger.city.jpa.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.joda.time.LocalDateTime;

@Entity
@Table(name = "T_Provider")
public class Provider implements Serializable {

	private static final long serialVersionUID = -297246741580414543L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "providerId")
	public int providerId;

	@Column(name = "providerName")
	public String providerName;

	@Column(name = "email")
	public String email;

	@Column(name = "IsVerified")
	public int isVerifed;

	@Column(name = "Score")
	public int score;

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "T_Provider_Address", joinColumns = { @JoinColumn(name = "providerId") }, inverseJoinColumns = {
			@JoinColumn(name = "addressId") })
	public Set<Address> address;

	@Basic(fetch = FetchType.LAZY)
	@Column(name = "Description")
	public String description;

	public Contact contactId;

	@Column(name = "createdOn")
	public LocalDateTime createdOn;

	@Column(name = "lastLogOn")
	public LocalDateTime lastLogOn;
}
