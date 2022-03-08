package springmvc2.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HomeController {
	@RequestMapping("/home")
	public String home(Model model) 
	{
		System.out.println("this is home url");
		
		model.addAttribute("name","Piyush Rawat");
		
		List<String> friends = new ArrayList<String>();
		friends.add("Rahul");
		friends.add("Vandana");
		friends.add("Rakesh");
		model.addAttribute("f",friends);
		return "index";
	}
	@RequestMapping("/about")
	public String about() {
		return "hello";
	}
	@RequestMapping("/help")
	public ModelAndView help() {
		//creating modal view object
		ModelAndView modelAndView = new ModelAndView();
		//setting the data
		modelAndView.addObject("name", "Geeta");
		//setting the view name
		modelAndView.setViewName("help");
		return modelAndView;
	}

}
