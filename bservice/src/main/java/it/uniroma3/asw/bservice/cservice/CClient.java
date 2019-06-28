package it.uniroma3.asw.bservice.cservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient("cservice")
public interface CClient {

	@PostMapping(value="/")
	public String post(@RequestBody String toPost);
	
}
