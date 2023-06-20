package com.anniversaries.reminder.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.anniversaries.reminder.entity.Users;

public interface UsersRepository extends JpaRepository<Users, Integer>{
	@Query(value = "select count(*) from Users p WHERE p.userName=:username AND p.password=:password AND p.enabled=:enabled")
	int checkUserLogin(String username, String password, boolean enabled);
}