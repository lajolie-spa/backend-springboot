package com.huydeve.lajolie.model;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import java.sql.Date;
import java.util.UUID;

@Entity
@Table(name = "_user")
public class User {
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "id", columnDefinition = "VARCHAR(255)")
    private UUID id;

    private String avatar;
    private String name;
    @Temporal(TemporalType.DATE)
    private Date dob;
    private String phone;

    @ManyToOne
    @JoinColumn(name = "role_id") //
    private Role role;

}
