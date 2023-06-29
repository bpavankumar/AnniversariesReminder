package com.anniversaries.reminder.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.anniversaries.reminder.service.WorksService;

@Controller
public class WorksController {

	@Autowired
	public WorksService worksService;
}
