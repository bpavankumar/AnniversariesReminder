package com.anniversaries.reminder.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.anniversaries.reminder.entity.WorkAnniversaries;
import com.anniversaries.reminder.service.WorksService;

@Controller
public class WorksController {

	@Autowired
	public WorksService worksService;

	@GetMapping("/admin/works")
	public String allWorkAnniversaries(Model model) {
		List<WorkAnniversaries> allWorks = worksService.getAllWorkAnniversaries();
		model.addAttribute("works", allWorks);
		return "works";
	}
}