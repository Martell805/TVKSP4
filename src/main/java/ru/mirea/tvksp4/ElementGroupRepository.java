package ru.mirea.tvksp4;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.UUID;

@RepositoryRestResource(collectionResourceRel = "element_group", path = "element_group")
public interface ElementGroupRepository extends JpaRepository<ElementGroup, UUID> {
}
