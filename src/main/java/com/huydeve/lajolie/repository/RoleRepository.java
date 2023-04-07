package com.huydeve.lajolie.repository;

import com.huydeve.lajolie.model.Role;
import com.huydeve.lajolie.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface RoleRepository extends JpaRepository<Role, UUID> {
    Role findRoleByName(String name);
}
