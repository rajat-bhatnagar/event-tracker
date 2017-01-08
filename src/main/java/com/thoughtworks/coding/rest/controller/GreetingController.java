package com.thoughtworks.coding.rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GreetingController {
	@RequestMapping(value="/greeting")
	public String greetUser(Model model){
		model.addAttribute("greeting", "Greetings from event-tracker app!");
		return "greeting.jsp";
	}
}
