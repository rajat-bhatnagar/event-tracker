package com.coding.thoughtworks.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coding.thoughtworks.model.Event;

@RestController
public class EventsRestController {
	
	@RequestMapping(value="/events")
	public List<Event> getEvents(){
		List<Event> events = new ArrayList<Event>();
		Event eventOne = new Event();
		eventOne.setName("JavaOne");
		events.add(eventOne);
		Event eventTwo = new Event();
		eventTwo.setName("NFJS");
		events.add(eventTwo);
		return events;
	}
}
