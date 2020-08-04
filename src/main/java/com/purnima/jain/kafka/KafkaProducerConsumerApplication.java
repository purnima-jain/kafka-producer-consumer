package com.purnima.jain.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KafkaProducerConsumerApplication {
	
	private static final Logger logger = LoggerFactory.getLogger(KafkaProducerConsumerApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(KafkaProducerConsumerApplication.class, args);
		logger.info("KafkaProducerConsumerApplication Started........");
	}


}
