package org.racoon.finger.city.web.services;

import java.util.List;

import org.racoon.finger.city.jpa.entity.Provider;

/** created by Long created on Nov 20, 2015 **/

public interface ProviderService extends ModelService<Provider> {
	/**
	 * get associated providers by category Id
	 * @param categoryId
	 * @return
	 */
	List<Provider> getProvidersByCategoryId(int categoryId);
	
	/**
	 * get associated providers by postcode
	 * @param postcode
	 * @return
	 */
	List<Provider> getProvidersByPostcode(int postcode);
	
	/**
	 * get associated providers by postcode and category Id
	 * @param postcode
	 * @param categoryId
	 * @return
	 */
	List<Provider> getProvidersByPostcodeAndCategoryId(int postcode, int categoryId);
}
