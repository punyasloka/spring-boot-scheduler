package com.example.spring.scheduler.dao;

import com.example.spring.scheduler.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Integer> {
}
