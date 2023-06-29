package com.anniversaries.reminder.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.anniversaries.reminder.service.DeathsService;

@Controller
public class DeathsController {

	@Autowired
	public DeathsService deathsService;
}