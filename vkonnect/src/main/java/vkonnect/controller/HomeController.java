package vkonnect.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping(path="/",method = RequestMethod.GET)
	public String home(Model model) {
		System.out.println("home page");
		model.addAttribute("companyName", "Tesla");
		model.addAttribute("year",1996);
		List<String> founders=new ArrayList<String>();
		founders.add("Varun Yadav");
		founders.add("Elon Musk");
		founders.add("Mark Zuckerberg");
		founders.add("Mukesh Ambani");
		model.addAttribute("founders", founders);
		return "index";
	}
	
	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("help controller");
		List <String> questions=new ArrayList<String>();
		questions.add("How do I register?");
		questions.add("How can I cancel my subscription?");
		questions.add("Are there any hidden charges?");
		ModelAndView modelView = new ModelAndView();
		modelView.addObject("help", "help");
		modelView.addObject("faqs", questions);
		modelView.setViewName("help");
		return modelView;
	}
}
