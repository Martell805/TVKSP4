package ru.mirea.tvksp4;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.UUID;

@RepositoryRestResource(collectionResourceRel = "element", path = "element", excerptProjection = ElementProjection.class)
public interface ElementRepository extends JpaRepository<Element, UUID> {
}
