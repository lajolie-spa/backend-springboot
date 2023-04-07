package com.huydeve.lajolie.model;

import com.huydeve.lajolie.model.key.RoleResourceKey;
import jakarta.persistence.*;

@Entity
@Table(name = "_role_resource")
public class RoleResource {
    @EmbeddedId
    RoleResourceKey id;

    @ManyToOne
    @MapsId("roleId")
    @JoinColumn(name = "role_id")
    Role role;

    @ManyToOne
    @MapsId("resourceId")
    @JoinColumn(name = "resource_id")
    Resource resource;
}
