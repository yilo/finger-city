package tests.org.racoon.finger.city.repos;

import java.util.Set;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.racoon.finger.city.Starter;
import org.racoon.finger.city.jpa.entity.Address;
import org.racoon.finger.city.jpa.entity.Provider;
import org.racoon.finger.city.jpa.repos.ProviderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.google.common.collect.Sets;

/** created by Long created on Nov 21, 2015 **/
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = { Starter.class })
public class ProviderRepositoryTests {

	@Autowired
	ProviderRepository providerRepository;

	@Test
	public void testManyToMany() {
		// create new provider
		Provider p = new Provider();
		p.setDescription("desc");
		p.setEmail("mail@mail.com");
		p.setProviderName("company1");
		
		// create two addresses
		Set<Address> addresses = Sets.newHashSet();
		for (int i = 0; i < 2; i++) {
			Address e = new Address();
			e.setNumber("BLK-" + i);
			e.setPostCode(i);
			e.setStreet("Street-" + i);
			addresses.add(e);
		}

		p.setAddresses(addresses);
		//should be create two address in address table after save, and two records in mapping table;
		providerRepository.save(p);
		//then remove one address
		p.getAddresses().removeIf(a->a.getPostCode() == 1);
		Address e = new Address();
		e.setNumber("BLK-3");
		e.setPostCode(3);
		e.setStreet("Street-3");
		p.getAddresses().add(e);
		providerRepository.save(p);//should remove one address and add one
		
	}
}
