package org.racoon.finger.city.jpa.repos;

import java.util.UUID;

import org.racoon.finger.city.jpa.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, UUID> {

}
