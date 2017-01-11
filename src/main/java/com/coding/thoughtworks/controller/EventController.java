package com.coding.thoughtworks.controller;

import java.util.logging.Logger;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.coding.thoughtworks.model.Event;

/*
 * This will bind the value of our @ModelAttribute event to the session
 * and can be validated by looking at the redirect to the index.jsp from event.jsp view
 */

@Controller
@SessionAttributes("event")
public class EventController {
	
	private static final Logger logger = Logger.getLogger(EventController.class.getName());

	@RequestMapping(value="/event", method = RequestMethod.GET)
	public String displayEventPage(Model model) {
		Event event = new Event();
		event.setName("Java User Group");
		model.addAttribute("event", event);
		return "event";
	}
	
	@RequestMapping(value="/event" , method = RequestMethod.POST)
	public String processEvent(@ModelAttribute("event") Event event){
		logger.info("######## Event # :"+event);
		/*
		 * This redirects us to the index request mapping defined in HelloController
		 * Remember : This is a new request
		 */
		return "redirect:index.html";
	}
	
	@ModelAttribute("event")
    public Event getEvent() {
        return new Event();
    }
}
