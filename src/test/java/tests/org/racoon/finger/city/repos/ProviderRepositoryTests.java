package tests.org.racoon.finger.city.repos;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.racoon.finger.city.Starter;
import org.racoon.finger.city.jpa.entity.Category;
import org.racoon.finger.city.jpa.entity.Provider;
import org.racoon.finger.city.jpa.repos.CategoryRepository;
import org.racoon.finger.city.jpa.repos.ProviderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/** created by Long created on Nov 21, 2015 **/
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = { Starter.class })
public class ProviderRepositoryTests {

	@Autowired
	ProviderRepository providerRepository;
	@Autowired
	CategoryRepository categoryRepository;

	@Test
	public void testSelectChinese() {
		Category c = new Category();
		c.setCategoryInfo("categoryInfo-1");
		c.setCategoryName("旅游声卡");
		categoryRepository.save(c);
		Category c2 = categoryRepository.findOne(c.getCategoryId());
		System.out.println(c2.getCategoryName());
	}

	@Test
	public void testManyToManySaveWhenCategoryExist() {
		// Category c = new Category();
		// c.setCategoryInfo("categoryInfo-1");
		// c.setCategoryName("旅游");
		// categoryRepository.save(c);
		// Provider p = new Provider();
		// p.setDescription("desc");
		// p.setEmail("mail@mail.com");
		// p.setProviderName("company1");
		// p.getCategories().add(c);
		// providerRepository.save(p);
	}

	@Test
	public void testOneToManySaveWhenMappedBy() {
		// create new provider
		Provider p = new Provider();
		p.setDescription("desc");
		p.setEmail("mail@mail.com");
		p.setProviderName("company1");

		// create two addresses
		// Set<Address> addresses = Sets.newHashSet();
		// IntStream.range(0, 2).forEach(i -> {
		// Address e = new Address();
		// e.setNumber("BLK-" + i);
		// e.setPostCode(i);
		// e.setStreet("Street-" + i);
		// e.setProvider(p);
		// addresses.add(e);
		// });

		// Set<Contact> contacts = Sets.newHashSet();
		// Contact c = new Contact();
		// c.setProvider(p);
		// c.setContactName("contactName");
		// c.setEmail("contact@contact.mail");
		// c.setPhone("23423423423");
		// contacts.add(c);
		//
		// p.setContacts(contacts);
		// p.setAddresses(addresses);
		providerRepository.save(p);

		// p.getAddresses().removeIf(a -> a.getPostCode() == 1);
		// p.getAddresses().forEach(a -> a.setPostCode(10));
		providerRepository.save(p);

		providerRepository.delete(p.getProviderId());
	}

}
