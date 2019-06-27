package it.uniroma3.asw.aservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import it.uniroma3.asw.aservice.domain.AService;

@RestController
public class ARestController {
	
	@Autowired
	private AService aService;
	
	@GetMapping(value="/")
	public String get() {
		return aService.getFromC();
	}
	@PostMapping(value="/")
	public void post() {
		aService.sendMessageToB();
	}
}
