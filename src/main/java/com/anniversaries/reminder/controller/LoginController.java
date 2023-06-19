package com.anniversaries.reminder.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.anniversaries.reminder.service.UsersService;

@Controller
public class LoginController {

	@Autowired
	private UsersService usersService;

	@GetMapping("/")
	public String login(Model model) {
		return "login";
	}
}