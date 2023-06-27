package com.anniversaries.reminder.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.anniversaries.reminder.service.OverviewService;

@Controller
public class AdminController {

	@Autowired
	public OverviewService overviewService;

	@GetMapping("/home/overview")
	public String displayOverview(Model model) {
		Map<String, Integer> data = overviewService.dataExtract();
		model.addAttribute("data", data);
		return "overview";
	}
}