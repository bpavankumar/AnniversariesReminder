package com.anniversaries.reminder.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OverviewService {
	@Autowired
	BirthdaysService birthdaysService;
	@Autowired
	WeddingsService weddingsService;
	@Autowired
	WorksService worksService;
	@Autowired
	DeathsService deathsService;

	public Map<String, Integer> dataExtract() {
		Map<String, Integer> data = new HashMap<>();
		data.put("Birthdays", birthdaysService.getAllBirthdays().size());
		data.put("Work Anniversaries", worksService.getAllWorkAnniversaries().size());
		data.put("Wedding Anniversaries", weddingsService.getAllWeddingAnniversaries().size());
		data.put("Death Anniversaries", deathsService.getAllDeathAnniversaries().size());
		return data;
	}
}