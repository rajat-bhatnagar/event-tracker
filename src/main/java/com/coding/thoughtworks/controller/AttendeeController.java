package com.coding.thoughtworks.controller;

import java.util.logging.Logger;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
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
	
	/*
	 * The signature has to be in this order , else it would not work
	 * If BindingResult has any failures diue to failed validations done by Annotations in model
	 * redirect the user to the same page
	 */
	@RequestMapping(value="/attendee", method=RequestMethod.POST)
	public String processAttendee(@Valid Attendee attendee, BindingResult result, Model model){
		logger.info("Attendee # "+attendee);
		//If result has errors redirect the user to the attendee
		if(result.hasErrors()){
			return "attendee";
		}
		return "redirect:index.html";
	}
}
