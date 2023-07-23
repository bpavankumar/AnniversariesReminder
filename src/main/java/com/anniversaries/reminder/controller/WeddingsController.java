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

	@GetMapping("/addwedding")
	public String addAWedding(Model model) {
		return "addwedding";
	}

	@RequestMapping(value="/home/addwedding", method = {RequestMethod.POST})
	public String addAWedding(@RequestParam("weddedcouple") String weddedCouple, @RequestParam("weddingdate") Date weddingDate, @RequestParam("relation") String relation) {
		WeddingAnniversaries wedding = new WeddingAnniversaries();
		wedding.setWeddedCouple(weddedCouple);
		wedding.setWeddingDate(weddingDate);
		wedding.setRelation(relation);
		boolean result = weddingsService.addAWedding(wedding);
		return (result==true) ? "addwedding" : "failure";
	}
}