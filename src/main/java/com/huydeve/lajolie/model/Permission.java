package com.huydeve.lajolie.model;

import lombok.NoArgsConstructor;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import java.util.*;

@NoArgsConstructor
@Entity
@Table(name = "_permission")
public class Permission {
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "id", columnDefinition = "VARCHAR(255)")
    private UUID id;
    @Column
    private String name;

    @ManyToMany(mappedBy = "permissions")
    private Set<Role> roles = new HashSet<>();

}
