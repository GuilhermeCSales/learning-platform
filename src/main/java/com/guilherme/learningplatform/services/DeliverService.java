package com.guilherme.learningplatform.services;

import com.guilherme.learningplatform.dto.DeliverRevisionDTO;
import com.guilherme.learningplatform.entities.Deliver;
import com.guilherme.learningplatform.repositories.DeliverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DeliverService {

    @Autowired
    private DeliverRepository repository;

    @PreAuthorize(value = "hasAnyRole('ADMIN', 'INSTRUCTOR')")
    @Transactional
    public void saveRevision(Long id, DeliverRevisionDTO deliverRevisionDTO) {
        Deliver deliver = repository.getById(id);
        deliver.setStatus(deliverRevisionDTO.getStatus());
        deliver.setFeedback(deliverRevisionDTO.getFeedback());
        deliver.setCorrectCount(deliverRevisionDTO.getCorrectCount());
        repository.save(deliver);
    }

}
