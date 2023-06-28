package com.anniversaries.reminder.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anniversaries.reminder.entity.Birthdays;
import com.anniversaries.reminder.repository.BirthdaysRepository;

@Service
public class BirthdaysService {

	@Autowired
	public BirthdaysRepository birthdaysRepository;

	public List<Birthdays> getAllBirthdays() {
		List<Birthdays> allBirthdays = birthdaysRepository.fetchAllBirthdays();
		return allBirthdays;
	}
}