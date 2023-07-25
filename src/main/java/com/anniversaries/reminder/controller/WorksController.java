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

	@GetMapping("/addwork")
	public String addAWork(Model model) {
		return "addwork";
	}

	@RequestMapping(value="/home/addwork", method = {RequestMethod.POST})
	public String addAWork(@RequestParam("colleague") String colleague, @RequestParam("joiningdate") Date joiningDate, @RequestParam("relation") String relation) {
		WorkAnniversaries work = new WorkAnniversaries();
		work.setColleague(colleague);
		work.setJoiningDate(joiningDate);
		work.setRelation(relation);
		boolean result = worksService.addAWork(work);
		return (result==true) ? "addwedding" : "failure";
	}

	@PostMapping("/admin/works/delete/{workId}")
	public String deleteWork(@PathVariable("workId") String workId, Model model) {
		boolean result = worksService.deleteAWork(workId);
		return (result==true) ? "redirect:/admin/weddings" : "failure";
	}
}