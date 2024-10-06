package ru.mirea.tvksp4;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "element_group")
public class ElementGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", nullable = false)
    private UUID id;
    @Column(name = "name", nullable = false)
    private String name;

    @ManyToMany
    @JoinTable(
            name = "element_group_to_element",
            joinColumns = @JoinColumn(name = "element_group_id"),
            inverseJoinColumns = @JoinColumn(name = "element_id"))
    private List<Element> elements;
}