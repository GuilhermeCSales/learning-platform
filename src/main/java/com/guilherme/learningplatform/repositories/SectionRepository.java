package com.guilherme.learningplatform.repositories;

import com.guilherme.learningplatform.entities.Section;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SectionRepository extends JpaRepository<Section, Long> {
}
