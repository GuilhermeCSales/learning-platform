package com.guilherme.learningplatform.repositories;

import com.guilherme.learningplatform.entities.Resource;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResourceRepository extends JpaRepository<Resource, Long> {
}
