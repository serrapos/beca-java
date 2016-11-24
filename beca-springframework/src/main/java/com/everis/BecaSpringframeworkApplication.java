package com.everis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.everis.beans.HelloWorld;

@SpringBootApplication
public class BecaSpringframeworkApplication {
	
	public static void main(String[] args) {
		System.out.println("************ 1- Arrancamos la aplicacion");
		ConfigurableApplicationContext app = SpringApplication.run(BecaSpringframeworkApplication.class, args);
		System.out.println("************ 2- Aplicación arrancada, recuperamos el HelloWorld");
		HelloWorld hello = (HelloWorld)app.getBean("helloWorld");
		System.out.println("************ 3- Cargamos un mensaje en Servicio");
		hello.setMessage("Mensaje en el arranque");
		System.out.println("************ 4- Vamos a pintar el mensaje");
		hello.printMessage();
		System.out.println("************ 5- Recuperamos el mensaje y lo mostramos:");
		System.out.println("Recupero mensaje: "+hello.getMessage());
		System.out.println("************ 6- Cerramos aplicacion");
	}
	
}
