package it.uniroma3.asw.aservice.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import it.uniroma3.asw.aservice.cservice.CService;
import it.uniroma3.asw.aservice.messaging.MessagePublisher;

@Service
public class AService {
	
	@Autowired
	private CService cService;
	
	@Autowired
	private MessagePublisher publisher;
	
	@Value("${INSTANCE_NAME:A}")  //reads env variable, or defaults to "A"
	private String instanceName;
	
	@Value("${animals}")
	private String animals;
	
	private String getAnimal() {
		String[] animalList = animals.split(",");
		int i = (int) (Math.round(Math.random()*(animalList.length-1)));
		String animal = animalList[i];
		return animal;
	}
	public void sendMessageToB() {
		String toB = instanceName + ": " + getAnimal();
		this.publisher.publish(toB);
	}
	
	public String getFromC() {
		return this.cService.get();
	}
	
}
