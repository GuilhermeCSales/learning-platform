package com.guilherme.learningplatform.resources;

import com.guilherme.learningplatform.dto.NotificationDTO;
import com.guilherme.learningplatform.services.NotificationService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/notifications")
public class NotificationResource {

    private final NotificationService service;

    public NotificationResource(NotificationService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<Page<NotificationDTO>> notificationForCurrentUser(Pageable pageable) {
        Page<NotificationDTO> page = service.notificationsForCurrentUser(pageable);
        return ResponseEntity.ok().body(page);
    }

}
