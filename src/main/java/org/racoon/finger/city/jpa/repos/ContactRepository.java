package org.racoon.finger.city.jpa.repos;

import java.util.UUID;

import org.racoon.finger.city.jpa.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, UUID> {

}
