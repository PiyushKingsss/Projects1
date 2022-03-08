package springmvc2.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ContactController {
	
	@ModelAttribute
	public void commonDataForModel(Model m) {
		m.addAttribute("Header","LearnCodeWithPiyush");
		m.addAttribute("Desc","Home For Programmer");
	}
	
	@RequestMapping("/contact")
	public String showForm() {
		
		return "contact";
	}
	
	/*@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String handleForm(@ModelAttribute User user,Model model) {
		System.out.println(user);
		return "success";
	} */
	
	
	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String handleForm(@RequestParam("email") String userEmail ,@RequestParam("userName") String name, Model model) {
		System.out.println("email is: " + userEmail);
		System.out.println("name is:"+ name);
		
		model.addAttribute("email",userEmail);
		model.addAttribute("name",name);
		return "success"; 
	}
		
		

}
