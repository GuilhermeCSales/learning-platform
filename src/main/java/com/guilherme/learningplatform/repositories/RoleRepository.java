package com.guilherme.learningplatform.repositories;

import com.guilherme.learningplatform.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
