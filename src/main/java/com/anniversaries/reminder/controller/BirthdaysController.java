package com.anniversaries.reminder.controller;

import java.sql.Date;
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

	@GetMapping("/admin/birthdays")
	public String allBirthdays(Model model) {
		List<Birthdays> allBirthdays = birthdaysService.getAllBirthdays();
		model.addAttribute("birthdays", allBirthdays);
		return "birthdays";
	}

	@GetMapping("/addbirthday")
	public String addABirthday(Model model) {
		System.out.println("GetMapping worked for addbirthday");
		return "addbirthday";
	}

	@PostMapping("/home/addbirthday")
	public String addBirthday(Model model) {
		System.out.println("Entering PostMapping flow for addbirthday");
		Birthdays birthday = new Birthdays();
		birthday.setBirthdayBaby((String)model.getAttribute("birthdaybaby"));
		birthday.setBirthDate((Date)model.getAttribute("birthdate"));
		birthday.setRelation((String)model.getAttribute("relation"));
		System.out.println(birthday.toString());
		boolean result = birthdaysService.addABirthday(birthday);
		return (result==true) ? "addbirthday" : "failure";
	}
}