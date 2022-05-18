package com.guilherme.learningplatform.repositories;

import com.guilherme.learningplatform.entities.Reply;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReplyRepository extends JpaRepository<Reply, Long> {
}
