package vkonnect.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import vkonnect.model.User;
import vkonnect.service.UserService;

@Controller
public class ContactController {
	
	@Autowired
	private UserService userService;
	
	
	@ModelAttribute
	public void commonModel(Model model) {
		model.addAttribute("companyName", "Tesla");
		model.addAttribute("founder","Varun");
	}
	
	@RequestMapping("/contact")
	public String showForm(Model model) {
		return "contact";
	}
	
	
	@RequestMapping(path = "/process-form", method = RequestMethod.POST)
	public String handleForm(@ModelAttribute User user, Model model) {
		System.out.println("User"+user);
		this.userService.createUser(user);
		return "success";
	}
	
	/*@RequestMapping(path = "/process-form", method = RequestMethod.POST)
	public String handleForm(
			@RequestParam("userName") String userName,
			@RequestParam("userPassword") String password,
			Model model) {
		
		User user=new User();
		user.setUserName(userName);
		user.setUserPassword(password);
		System.out.println("User Name "+user.getUserName());
		System.out.println("Password is "+user.getUserPassword());
		model.addAttribute("user",user);
		
		return "success";
	} */
}
