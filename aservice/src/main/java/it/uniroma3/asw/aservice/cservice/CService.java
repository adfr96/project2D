package it.uniroma3.asw.aservice.cservice;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class CService {

	private static final Logger log = Logger.getLogger(CService.class);
	
	@Autowired
	private CClient cClient;
	
	@HystrixCommand(fallbackMethod="notifyOfUnsuccessfulCall")
	public String get() {
		return this.cClient.get();
	}
	
	public String notifyOfUnsuccessfulCall() {
		log.error("A failed to call C via REST");
		return "ERROR";
	}
	
}
