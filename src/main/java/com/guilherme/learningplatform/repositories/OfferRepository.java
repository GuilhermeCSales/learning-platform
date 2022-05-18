package com.guilherme.learningplatform.repositories;

import com.guilherme.learningplatform.entities.Offer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OfferRepository extends JpaRepository<Offer, Long> {
}
