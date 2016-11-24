package com.everis;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.everis.beans.HelloWorld;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BecaSpringframeworkApplicationTests {
	
	@Autowired
	HelloWorld helloWorld;

	@Test
	public void contextLoads() {
		
		String message = "Mi primer mensaje";
		helloWorld.setMessage(message);
		helloWorld.printMessage();
		
		assertNotNull(helloWorld.getMessage());
	}

}
