package it.uniroma3.asw.bservice.messaging;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import it.uniroma3.asw.bservice.domain.BService;

@Component
public class MessageListener {
	
	private static final Logger log = Logger.getLogger(MessageListener.class);
	
	@Autowired
	private BService bService;
	
	@KafkaListener(topics="${it.uniroma3.asw.kafka.channel.in}", groupId="${it.uniroma3.asw.kafka.groupId}")
	public void listen(ConsumerRecord<String,String> record) {
		String message = record.value();
		log.info("B received message: '"+message+"'");
		this.bService.onMessage(message);
	}
	
}
