package com.anniversaries.reminder.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anniversaries.reminder.entity.DeathAnniversaries;
import com.anniversaries.reminder.repository.DeathsRepository;

@Service
public class DeathsService {

	@Autowired
	public DeathsRepository deathsRepository;

	public List<DeathAnniversaries> getAllDeathAnniversaries() {
		List<DeathAnniversaries> deaths = deathsRepository.fetchAllDeaths();
		return deaths;
	}
}