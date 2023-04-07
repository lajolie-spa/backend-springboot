package com.huydeve.lajolie.model.key;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;


import java.io.Serializable;
import java.util.UUID;

@Embeddable
public class ResourcePermissionKey implements Serializable {

    @Column(name = "resource_id")
    UUID resourceId;

    @Column(name = "permission_id")
    UUID permissionId;

}
