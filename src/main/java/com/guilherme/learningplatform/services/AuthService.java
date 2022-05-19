package com.guilherme.learningplatform.services;

import com.guilherme.learningplatform.entities.User;
import com.guilherme.learningplatform.repositories.UserRepository;
import com.guilherme.learningplatform.services.exceptions.ForbiddenException;
import com.guilherme.learningplatform.services.exceptions.UnauthorizedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class AuthService {

    private final UserRepository userRepository;

    public AuthService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Transactional(readOnly = true)
    public User authenticated() {
        try {
            String username = SecurityContextHolder.getContext().getAuthentication().getName();
            return userRepository.findByEmail(username);
        } catch (Exception error) {
            throw new UnauthorizedException("Inválid User");
        }
    }

    public void validateSelfOrAdmin(Long userId) {
        User user = authenticated();

        if (!user.getId().equals(userId) && !user.hasRole("ROLE_ADMIN")) {
            throw new ForbiddenException("Access denied");
        }

    }

}
