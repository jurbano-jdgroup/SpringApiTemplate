package com.template.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.template.api.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}