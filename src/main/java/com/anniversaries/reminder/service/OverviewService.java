package com.anniversaries.reminder.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OverviewService {
	@Autowired
	BirthdaysService birthdaysService;
	
	public Map<String, Integer> dataExtract() {
		Map<String, Integer> data = new HashMap<>();
		data.put("Birthdays", birthdaysService.getAllBirthdays().size());
		data.put("Work Anniversaries", 0);
		data.put("Wedding Anniversaries", 0);
		data.put("Death Anniversaries", 0);
		return data;
	}
}