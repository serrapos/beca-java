package com.everis.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Service;

@Service
public class HelloWorld {
	
   @PostConstruct
   public void inicializa() {
		System.out.println("Construyendo componente");
   }
 
   @PreDestroy
   public void libera() {
	   System.out.println("Destruyendo componente");
   }
	
	private String message;

    public void setMessage(String message){
      this.message  = message;
    }

    public String getMessage(){
      return message;
    }
    
    public void printMessage(){
        System.out.println("Your Message : " + message);
    }
    
}
