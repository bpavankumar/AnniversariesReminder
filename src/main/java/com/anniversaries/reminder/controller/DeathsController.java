package com.anniversaries.reminder.controller;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.anniversaries.reminder.entity.DeathAnniversaries;
import com.anniversaries.reminder.service.DeathsService;

@Controller
public class DeathsController {

	@Autowired
	public DeathsService deathsService;

	@GetMapping("/admin/deaths")
	public String allDeaths(Model model) {
		List<DeathAnniversaries> deaths = deathsService.getAllDeathAnniversaries();
		model.addAttribute("deaths", deaths);
		return "deaths";
	}

	@GetMapping("/adddeath")
	public String addADeath(Model model) {
		return "adddeath";
	}

	@RequestMapping(value="/home/adddeath", method = {RequestMethod.POST})
	public String addBirthday(@RequestParam("deceased") String deceased, @RequestParam("deathdate") Date deathdate, @RequestParam("relation") String relation) {
		DeathAnniversaries death = new DeathAnniversaries();
		death.setDeceased(deceased);
		death.setDeathDate(deathdate);
		death.setRelation(relation);
		boolean result = deathsService.addADeath(death);
		return (result==true) ? "adddeath" : "failure";
	}
}