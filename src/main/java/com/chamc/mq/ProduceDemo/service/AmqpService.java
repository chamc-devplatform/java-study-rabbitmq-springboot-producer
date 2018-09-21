package com.chamc.mq.ProduceDemo.service;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chamc.mq.ProduceDemo.Entity.TestUser;

@Service
public class AmqpService {
	
	private @Autowired AmqpTemplate template;
	
	public void send(TestUser user) {
		template.convertAndSend("hello-direct", "hello-route", user.toString());
	}
}
