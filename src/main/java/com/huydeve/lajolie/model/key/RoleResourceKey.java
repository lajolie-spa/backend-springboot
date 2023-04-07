package com.huydeve.lajolie.model.key;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.UUID;
@Embeddable
public class RoleResourceKey implements Serializable {
    @Column(name = "role_id")
    UUID roleId;

    @Column(name = "resource_id")
    UUID resourceId;
}
