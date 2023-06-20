package com.anniversaries.reminder.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.anniversaries.reminder.service.UsersService;

@Controller
public class LoginController {

	@Autowired
	private UsersService usersService;

	@GetMapping("/")
	public String login(Model model) {
		return "login";
	}

	@GetMapping("/home")
	public String checkUserLogin(@RequestParam("user_id") String user_id, @RequestParam("password") String password, @RequestParam("role") String role) {
		boolean enabled = role.equalsIgnoreCase("ADMIN") ? true : false;
		System.out.println("USER: " + user_id + "\nPASSWORD: " + password + "\nROLE: " + enabled);
		if (usersService.checkUserLogin(user_id, password, enabled))
			return "success";
		else
			return "failure";
	}
}