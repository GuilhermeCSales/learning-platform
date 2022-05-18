package com.guilherme.learningplatform.repositories;

import com.guilherme.learningplatform.entities.Topic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicRepository extends JpaRepository<Topic, Long> {
}
