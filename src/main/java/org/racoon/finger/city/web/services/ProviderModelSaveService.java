package org.racoon.finger.city.web.services;

import org.racoon.finger.city.web.models.ProviderModel;

/** created by Long created on Nov 21, 2015 **/
public interface ProviderModelSaveService extends ModelSaveService<ProviderModel>{

	int save(ProviderModel p);
}
