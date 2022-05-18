package com.guilherme.learningplatform.repositories;

import com.guilherme.learningplatform.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
