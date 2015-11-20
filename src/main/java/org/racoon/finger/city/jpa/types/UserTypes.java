package org.racoon.finger.city.jpa.types;

/**
 * created by long, created on Nov 20, 2015
 */
public enum UserTypes {

	PROVIDER(0), REQUESTOR(1);

	public int val;

	UserTypes(int val) {
		this.val = val;
	}
}
