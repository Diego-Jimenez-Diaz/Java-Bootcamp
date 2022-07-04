package com.diegojimenez.DBSpringJPA.dao;

import com.diegojimenez.DBSpringJPA.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDAO extends JpaRepository<User, Long> {
}
