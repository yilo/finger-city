package org.racoon.finger.city.jpa.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.joda.time.LocalDateTime;

/**
 * created by long, created on Nov 20, 2015
 */
@Entity
@Table(name = "T_Users")
public class User {

	@Id
	@Column(name = "userId")
	public int userId;

	@Column(name = "userName")
	public String userName;

	@Column(name = "userType")
	public int userType;

	@Column(name = "email")
	public String email;

	@Column(name = "IsVerified")
	public int isVerifed;

	@Column(name = "createdOn")
	public LocalDateTime createdOn;

	@Column(name = "lastLogOn")
	public LocalDateTime lastLogOn;
}
