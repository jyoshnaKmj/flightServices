package com.jyostna.springCloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jyostna.springCloud.repo.FlightRepository;
import com.jyostna.springCloud.model.Flight;

@RestController
@RequestMapping("/flightServices")
public class flightController {
	
	@Autowired
	FlightRepository repo;
	
	@RequestMapping(value="/flights", method=RequestMethod.GET)
	public Iterable<Flight> getFlights(){		
		return repo.findAll();
	}

}
