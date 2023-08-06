package com.anniversaries.reminder.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.anniversaries.reminder.service.UsersService;

@Controller
public class LoginController {

	@Autowired
	private UsersService usersService;
	private boolean isAdmin = false;

	@GetMapping("/")
	public String login(Model model) {
		return "login";
	}

	@RequestMapping(value="/home", method = {RequestMethod.POST})
	public String checkUserLogin(@RequestParam("user_id") String user_id, @RequestParam("password") String password, @RequestParam("role") String role) {
		if (usersService.checkUserLogin(user_id, password, role)) {
			isAdmin = true;
			return "AdminDashboard";
		} else {
			return "UserDashboard";
		}
	}

	@RequestMapping(value="/home", method = {RequestMethod.GET})
	public String traverse() {
		if(isAdmin) {
			return "AdminDashboard";
		} else {
			return "UserDashboard";
		}
	}
}