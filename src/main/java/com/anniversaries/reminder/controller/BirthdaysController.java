package com.anniversaries.reminder.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.anniversaries.reminder.entity.Birthdays;
import com.anniversaries.reminder.service.BirthdaysService;

@Controller
public class BirthdaysController {

	@Autowired
	private BirthdaysService birthdaysService;

	@GetMapping("/home/birthdays")
	public String allBirthdays(Model model) {
		List<Birthdays> allBirthdays = birthdaysService.getAllBirthdays();
		System.out.println("BirthdaysController.allBirthdays(): " + allBirthdays.size());
		model.addAttribute("birthdays", allBirthdays);
		return "Birthdays";
	}

	@PostMapping("/home/addbirthday")
	public String addABirthday(Model model) {
		return "AddABirthday";
	}
}