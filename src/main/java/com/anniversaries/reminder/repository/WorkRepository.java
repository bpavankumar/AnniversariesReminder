package com.anniversaries.reminder.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.anniversaries.reminder.entity.WorkAnniversaries;

public interface WorkRepository extends JpaRepository<WorkAnniversaries, Integer> {
	@Query(value = "FROM WorkAnniversaries")
	List<WorkAnniversaries> fetchAllWorkAnniversaries();
}