package com.anniversaries.reminder.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.anniversaries.reminder.service.WeddingsService;

@Controller
public class WeddingsController {

	@Autowired
	public WeddingsService weddingsService;
}