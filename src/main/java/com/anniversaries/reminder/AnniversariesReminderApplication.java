package com.anniversaries.reminder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/*
 * Following this example for Spring Security
 * * https://www.codejava.net/frameworks/spring-boot/form-authentication-with-jdbc-and-mysql
 * */
@SpringBootApplication
public class AnniversariesReminderApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(AnniversariesReminderApplication.class, args);
	}
}