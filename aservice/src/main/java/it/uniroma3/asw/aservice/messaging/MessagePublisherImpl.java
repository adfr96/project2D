package it.uniroma3.asw.aservice.messaging;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class MessagePublisherImpl implements MessagePublisher {
	
	@Value("${it.uniroma3.asw.kafka.channel.out}")
	private String channel;
	
	@Autowired
	private KafkaTemplate<String, String> template;
	
	@Override
	public void publish(String message) {
		template.send(channel, message);
	}

}
