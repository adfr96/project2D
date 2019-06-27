package it.uniroma3.asw.bservice.cservice;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CService {
	
	private final Logger log = Logger.getLogger(CService.class);
	
	@Autowired
	private CClient cClient;
	

	public void print(String s) {
		this.cClient.print(s);
	}
	
	public void logUnsuccessfulCall() {
		this.log.error("B failed to call C via REST/Feign");
	}
	
}
