package it.uniroma3.asw.bservice.cservice;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;


@Service
public class CService {
	
	private static final Logger log = Logger.getLogger(CService.class);
	
	@Autowired
	private CClient cClient;
	
	@HystrixCommand(fallbackMethod="logUnsuccessfulCall")
	public void post(String toPost) {
		this.cClient.post(toPost);
	}
	
	public void logUnsuccessfulCall(String toPrint) {
		log.error("B failed to call C via REST");
	}
	
}
