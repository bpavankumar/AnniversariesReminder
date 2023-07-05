package com.anniversaries.reminder.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

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

	@PostMapping("/home/adddeath")
	public String addADeath(Model model) {
		return "addADeath";
	}
}