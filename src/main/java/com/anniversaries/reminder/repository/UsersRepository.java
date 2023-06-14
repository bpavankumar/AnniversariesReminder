package com.anniversaries.reminder.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anniversaries.reminder.entity.Users;

public interface UsersRepository extends JpaRepository<Users, String>{

}