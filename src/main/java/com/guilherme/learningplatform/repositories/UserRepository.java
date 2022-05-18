package com.guilherme.learningplatform.repositories;

import com.guilherme.learningplatform.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String name);
}
