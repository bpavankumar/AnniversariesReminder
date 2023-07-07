package com.anniversaries.reminder.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.anniversaries.reminder.entity.WeddingAnniversaries;
import com.anniversaries.reminder.service.WeddingsService;

@Controller
public class WeddingsController {

	@Autowired
	public WeddingsService weddingsService;

	@GetMapping("/admin/weddings")
	public String allWeddings(Model model) {
		List<WeddingAnniversaries> allWeddings = weddingsService.getAllWeddingAnniversaries();
		model.addAttribute("weddings", allWeddings);
		return "weddings";
	}
}