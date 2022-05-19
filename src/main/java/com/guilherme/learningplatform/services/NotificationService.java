package com.guilherme.learningplatform.services;

import com.guilherme.learningplatform.dto.NotificationDTO;
import com.guilherme.learningplatform.entities.Notification;
import com.guilherme.learningplatform.entities.User;
import com.guilherme.learningplatform.repositories.NotificationRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class NotificationService {

    private final NotificationRepository repository;

    private final AuthService authService;

    public NotificationService(NotificationRepository repository, AuthService authService) {
        this.repository = repository;
        this.authService = authService;
    }

    @Transactional(readOnly = true)
    public Page<NotificationDTO> notificationsForCurrentUser(Pageable pageable) {
        User user = authService.authenticated();

        Page<Notification> page = repository.findByUser(user, pageable);
        return page.map(NotificationDTO::new);
    }
}
