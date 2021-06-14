package com.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	@Autowired
	LoginService loginservice;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String showLoginPage() {
		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String handler(@RequestParam String name, @RequestParam String password, ModelMap model) {

		if (!loginservice.check(name, password)) {
			model.put("errorMessage","Invalid Credentails");
			return "login";
		}
			

		model.put("name", name);
		return "welcome";

	}

}
