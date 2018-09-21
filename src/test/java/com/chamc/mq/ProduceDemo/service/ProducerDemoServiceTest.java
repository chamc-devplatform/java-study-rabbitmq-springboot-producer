package com.chamc.mq.ProduceDemo.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.chamc.mq.ProduceDemo.Entity.TestUser;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ProducerDemoServiceTest {

	private @Autowired AmqpService service;
	
	public @Test void testSend() {
		TestUser user = new TestUser();
		user.setName("name");
		user.setUsername("username");
		this.service.send(user);
	}
}
