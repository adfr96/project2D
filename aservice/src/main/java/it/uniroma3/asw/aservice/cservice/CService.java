package it.uniroma3.asw.aservice.cservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CService {
	
	@Autowired
	private CClient cClient;
	
	public String get() {
		return this.cClient.get();
	}
}
