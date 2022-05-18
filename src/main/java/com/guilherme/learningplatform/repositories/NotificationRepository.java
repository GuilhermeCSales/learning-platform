package com.guilherme.learningplatform.repositories;

import com.guilherme.learningplatform.entities.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository extends JpaRepository<Notification, Long> {
}
