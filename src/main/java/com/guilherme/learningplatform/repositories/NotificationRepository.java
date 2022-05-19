package com.guilherme.learningplatform.repositories;

import com.guilherme.learningplatform.entities.Notification;
import com.guilherme.learningplatform.entities.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository extends JpaRepository<Notification, Long> {

    Page<Notification> findByUser(User user, Pageable pageable);

}
