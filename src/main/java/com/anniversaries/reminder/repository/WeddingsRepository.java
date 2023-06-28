package com.anniversaries.reminder.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.anniversaries.reminder.entity.WeddingAnniversaries;

public interface WeddingsRepository extends JpaRepository<WeddingAnniversaries, Integer> {
	@Query(value = "FROM WeddingAnniversaries")
	List<WeddingAnniversaries> fetchAllWeddings();
}