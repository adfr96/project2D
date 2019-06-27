package it.uniroma3.asw.bservice.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import it.uniroma3.asw.bservice.cservice.CService;

@Service
public class BService {
	
	@Autowired
	private CService cservice;
	
	@Value("${spring.application.name}")
	private String bApplicationName;
	
	public void onMessage(String message) {
		String toPrint = bApplicationName + ": " + message;
		this.cservice.print(toPrint);
	}

}
