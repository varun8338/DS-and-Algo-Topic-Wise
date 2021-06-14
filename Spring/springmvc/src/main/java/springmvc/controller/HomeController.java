package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String home() {
		System.out.println("This is home URL");
		return "index";//name of the view
	}
	
	@RequestMapping("/about")
	public String about() {
		System.out.println("This is about url");
		return "about";
	}
}
