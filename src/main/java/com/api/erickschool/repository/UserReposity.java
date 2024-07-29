package com.api.erickschool.repository;

import com.api.erickschool.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    // Custom queries if needed
}