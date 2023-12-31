package com.anniversaries.reminder.controller;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
		model.addAttribute("birthdays", allBirthdays);
		return "birthdays";
	}

	@GetMapping("/addbirthday")
	public String addABirthday(Model model) {
		return "addbirthday";
	}

	@RequestMapping(value="/home/addbirthday", method = {RequestMethod.POST})
	public String addBirthday(@RequestParam("birthdaybaby") String birthdaybaby, @RequestParam("birthdate") Date birthdate, @RequestParam("relation") String relation) {
		Birthdays birthday = new Birthdays();
		birthday.setBirthdayBaby(birthdaybaby);
		birthday.setBirthDate(birthdate);
		birthday.setRelation(relation);
		boolean result = birthdaysService.addABirthday(birthday);
		return (result==true) ? "addbirthday" : "failure";
	}

	@PostMapping("/admin/birthdays/delete/{birthdayId}")
	public String deleteBirthday(@PathVariable("birthdayId") String birthdayId, Model model) {
		boolean result = birthdaysService.deleteABirthday(birthdayId);
		return (result==true) ? "redirect:/admin/birthdays" : "failure";
	}

	@PostMapping("/admin/birthdays/update/{birthday}")
	public String updateBirthday(@PathVariable("birthday") Birthdays birthday, Model model) {
		boolean result = birthdaysService.updateABirthday(birthday);
		return (result == true) ? "redirect:/admin/birthdays" : "failure";
	}
}