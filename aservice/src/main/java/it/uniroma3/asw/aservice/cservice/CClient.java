package it.uniroma3.asw.aservice.cservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("cservice")
public interface CClient {
	
	@GetMapping(value="/")
	public String get();
}
