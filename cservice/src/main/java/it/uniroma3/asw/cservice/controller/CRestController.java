package it.uniroma3.asw.cservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import it.uniroma3.asw.cservice.domain.CService;

@RestController
public class CRestController {

	@Autowired
	private CService cService;
	
	@GetMapping(value="/")
	public String getParametriRichiesta() {
		return cService.getParametriRichiesta(); 
	}
	
	@PostMapping(value="/")
	public void  saveParametri(@RequestParam String parametri) {
		cService.saveParametri(parametri);
	}
}