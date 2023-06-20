package com.anniversaries.reminder.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anniversaries.reminder.repository.UsersRepository;

@Service
public class UsersService {

	@Autowired
	private UsersRepository usersRepository;

	public boolean checkUserLogin(String username, String password, boolean enabled) {
		int status = usersRepository.checkUserLogin(username, password, enabled);
		return status > 0 ? true : false;
	}
}