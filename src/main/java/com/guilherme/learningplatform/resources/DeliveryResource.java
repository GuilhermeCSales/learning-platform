package com.guilherme.learningplatform.resources;

import com.guilherme.learningplatform.dto.DeliverRevisionDTO;
import com.guilherme.learningplatform.services.DeliverService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/deliveries")
public class DeliveryResource {

    private final DeliverService service;

    public DeliveryResource(DeliverService service) {
        this.service = service;
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Void> saveRevision(@PathVariable Long id, @RequestBody DeliverRevisionDTO deliverRevisionDTO) {
        service.saveRevision(id, deliverRevisionDTO);
        return ResponseEntity.noContent().build();
    }

}
