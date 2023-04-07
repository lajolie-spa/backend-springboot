package com.huydeve.lajolie.model;

import jakarta.persistence.*;

import java.util.Set;
import java.util.UUID;


@Entity
@Table(name = "_resource")
public class Resource {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @Column
    private String name;
    @Enumerated(EnumType.STRING)
    private Permission permission;

    @OneToMany(mappedBy = "resource")
    Set<RoleResource> roleResources;
}
