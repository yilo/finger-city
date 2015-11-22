package tests.org.racoon.finger.city.webs;

import java.util.Set;
import java.util.stream.IntStream;

import org.junit.Test;
import org.racoon.finger.city.jpa.entity.Address;
import org.racoon.finger.city.jpa.entity.Contact;
import org.racoon.finger.city.jpa.entity.Provider;
import org.racoon.finger.city.web.basic.HibernateAwareObjectMapper;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.google.common.collect.Sets;

//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringApplicationConfiguration(classes = { Starter.class })
public class HibernateObjectMapperTests {

	@Test
	public void testConvert() throws JsonProcessingException {

		HibernateAwareObjectMapper om = new HibernateAwareObjectMapper();
		Provider p = new Provider();

		p.setDescription("desc");
		p.setEmail("mail@mail.com");
		p.setProviderName("company1");

		Set<Contact> contacts = Sets.newHashSet();
		Contact c = new Contact();
		c.setContactName("contactName");
		c.setEmail("contact@contact.mail");
		c.setPhone("23423423423");
		contacts.add(c);

		Set<Address> addresses = Sets.newHashSet();
		IntStream.range(0, 2).forEach(i -> {
			Address e = new Address();
			e.setNumber("BLK-" + i);
			e.setPostCode(i);
			e.setStreet("Street-" + i);
			addresses.add(e);
		});

		System.out.println(om.writer().withDefaultPrettyPrinter().writeValueAsString(addresses));

		System.out.println("******************");

		System.out.println(om.writer().withDefaultPrettyPrinter().writeValueAsString(contacts));

		System.out.println("******************");
		System.out.println(om.writer().withDefaultPrettyPrinter().writeValueAsString(p));
	}
}
