package com.anniversaries.reminder.controller;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.anniversaries.reminder.entity.Birthdays;
import com.anniversaries.reminder.service.BirthdaysService;

@Controller
public class BirthdaysController {

	@Autowired
	private BirthdaysService birthdaysService;

	@GetMapping("/admin/birthdays")
	public String allBirthdays(Model model) {
		List<Birthdays> allBirthdays = birthdaysService.getAllBirthdays();
		allBirthdays = cleanseData(allBirthdays);
		model.addAttribute("birthdays", allBirthdays);
		return "birthdays";
	}

	private List<Birthdays> cleanseData(List<Birthdays> allBirthdays) {
		List<Birthdays> data = new ArrayList<>();
		for(Birthdays birthday : allBirthdays) {
			if (null == birthday.getBirthDate() || null == birthday.getBirthdayBaby()
					|| null == birthday.getRelation()) {
				data.add(birthday);
			} else {
				continue;
			}
		}
		allBirthdays.removeAll(data);
		data.clear();
		return allBirthdays;
	}

	@GetMapping("/addbirthday")
	public String addABirthday(Model model) {
		System.out.println("GetMapping worked for addbirthday");
		return "addbirthday";
	}

	@RequestMapping(value="/home/addbirthday", method = {RequestMethod.POST})
	public String addBirthday(@RequestParam("birthdaybaby") String birthdaybaby, @RequestParam("birthdate") Date birthdate, @RequestParam("relation") String relation) {
		System.out.println("Entering PostMapping flow for addbirthday");
		Birthdays birthday = new Birthdays();
		birthday.setBirthdayBaby(birthdaybaby);
		birthday.setBirthDate(birthdate);
		birthday.setRelation(relation);
		System.out.println(birthday.toString());
		boolean result = birthdaysService.addABirthday(birthday);
		return (result==true) ? "addbirthday" : "failure";
	}
}