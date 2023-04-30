package com.primeiraapijava.demo.repositories;

import com.primeiraapijava.demo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
