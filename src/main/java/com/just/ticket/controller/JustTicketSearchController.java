package com.just.ticket.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JustTicketSearchController {
	
	@GetMapping("/search")
	public String search() {
		return "Search Ticket";
	}

}
