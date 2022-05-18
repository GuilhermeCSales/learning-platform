package com.guilherme.learningplatform.repositories;

import com.guilherme.learningplatform.entities.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LessonRepository extends JpaRepository<Lesson, Long> {
}
