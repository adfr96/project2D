package it.uniroma3.asw.bservice.cservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient("cservice")
public interface CClient {

	@PostMapping(value="/")
	public void print(String s);
	
}
