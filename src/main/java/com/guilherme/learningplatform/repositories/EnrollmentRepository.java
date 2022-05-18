package com.guilherme.learningplatform.repositories;

import com.guilherme.learningplatform.entities.Enrollment;
import com.guilherme.learningplatform.entities.pk.EnrollmentPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnrollmentRepository extends JpaRepository<Enrollment, EnrollmentPK> {
}
