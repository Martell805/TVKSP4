package ru.mirea.tvksp4;

import org.springframework.data.rest.core.config.Projection;

import java.util.List;
import java.util.UUID;

@Projection(name = "elementP", types = { Element.class })
public interface ElementProjection {
    UUID getId();
    String getName();
    List<SubElement> getSubElements();

    List<ElementGroup> getElementGroups();
}