package com.coding.thoughtworks.controller;

import java.util.logging.Logger;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.coding.thoughtworks.model.Attendee;

@Controller
public class AttendeeController {
	
	private static final Logger logger = Logger.getLogger(AttendeeController.class.getName());
	
	@RequestMapping(value="/attendee", method=RequestMethod.GET)
	public String displayAttendeePage(Model model){
		Attendee attendee = new Attendee();
		model.addAttribute("attendee", attendee);
		return "attendee";
	}
	
	@RequestMapping(value="/attendee", method=RequestMethod.POST)
	public String processAttendee(@ModelAttribute("attendee") Attendee attendee){
		logger.info("Attendee # "+attendee);
		return "redirect:index.html";
	}
}
