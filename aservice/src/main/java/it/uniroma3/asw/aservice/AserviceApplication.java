package it.uniroma3.asw.aservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class AserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AserviceApplication.class, args);
	}

}
