package com.springmvc.controller;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
	public boolean check(String username,String password) {
		if(username.equals("Varun") && password.equals("123"))
			return true;
		return false;
	}
}
