package com.anniversaries.reminder.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.anniversaries.reminder.entity.Birthdays;

public interface BirthdaysRepository extends JpaRepository<Birthdays, Integer> {
	@Query(value = "FROM Birthdays")
	List<Birthdays> fetchAllBirthdays();
}