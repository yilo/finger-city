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

@Entity
@Table(name = "T_Address")
public class Address implements Serializable{

	
	private static final long serialVersionUID = -6290847335053243570L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "addressId")
	public int addressId;
	
	@ManyToMany(fetch = FetchType.LAZY, mappedBy="address")
	public Set<Provider> providers;
	
	public int postCode;
}
