package com.drajnoha.BullySheet.dao.repositories;

import com.drajnoha.BullySheet.dao.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * @author David Rajnoha
 */
public interface UserRepository extends JpaRepository<User, Long> {
    User findOneUserByToken(String token);
}
