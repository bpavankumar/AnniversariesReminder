package com.anniversaries.reminder.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class LoginController {
	@GetMapping("/")
	public String login(Model model) {
		return "login";
	}
}