package com.ust.mvc;
//https://docs.spring.io/spring-framework/docs/3.0.x/reference/mvc.html
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/register")
public class RegisterationController {
	/*
	 * @GetMapping public String respond(Model model) {
	 * model.addAttribute("myName","Selas"); return "response"; //view }
	 */
	@PostMapping
	public String signup(@RequestParam("userName") String userName, @RequestParam("mailId") String mailId,
			Model model) {

		System.out.println(userName + mailId);
		if (userName.length() > 6 && mailId.length() > 6) {
			model.addAttribute("userName",userName);
			model.addAttribute("mailId",mailId);
			return "success";}
		else
			return "error";

	}
}
