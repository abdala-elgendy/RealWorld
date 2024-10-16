package com.abdala.demo.repository;



import com.abdala.demo.entity.User;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepo extends JpaRepository<User,Long> {

    Optional<User> findById(Long id);

    List<User> findFollowedUsersByUserId(Long userId);

    Optional<User> findByEmail(String email);

    boolean existsByEmail(String email);
}

