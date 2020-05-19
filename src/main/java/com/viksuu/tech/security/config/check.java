package com.viksuu.tech.security.config;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class check {

	public static void main(String[] args) {

		String s = "viksuu";
		BCryptPasswordEncoder e = new BCryptPasswordEncoder();
		String s1 = e.encode(s);
	
		System.out.println(s1);

		/*
		 * String date = "1990-12-12"; DateTimeFormatter dateTimeFormatter =
		 * DateTimeFormatter.ofPattern("yyyy-MM-dd"); LocalDate dateTime =
		 * LocalDate.parse(date, dateTimeFormatter); System.out.println(dateTime);
		 */
	}

}
