package com.anniversaries.reminder.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anniversaries.reminder.repository.UsersRepository;

@Service
public class UsersService {

	@Autowired
	private UsersRepository usersRepository;

	public boolean checkUserLogin(String username, String password, String role) {
		int status = usersRepository.checkUserLogin(username, password, role);
		return (status > 0 && role.equalsIgnoreCase("ADMIN")) ? true : false;
	}
}