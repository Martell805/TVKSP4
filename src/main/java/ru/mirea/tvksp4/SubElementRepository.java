package ru.mirea.tvksp4;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.UUID;

@RepositoryRestResource(collectionResourceRel = "sub_element", path = "sub_element")
public interface SubElementRepository extends JpaRepository<SubElement, UUID> {
}
