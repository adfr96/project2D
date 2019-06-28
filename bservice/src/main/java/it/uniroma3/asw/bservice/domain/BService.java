package it.uniroma3.asw.bservice.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import it.uniroma3.asw.bservice.cservice.CService;

@Service
public class BService {
	
	@Autowired
	private CService cservice;
	
	@Value("${INSTANCE_NAME:B}")  //reads env variable, or defaults to "B"
	private String instanceName;
	
	public void onMessage(String message) {
		String toPrint = instanceName + ": " + message;
		this.cservice.print(toPrint);
	}

}
