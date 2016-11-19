package com.fatih.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fatih.domain.Message;

@RestController
public class HelloWorldRestController {

	
	@RequestMapping("/")
	public String welcome(){
		return "Welcome to rest template example";
	}
	
	@RequestMapping("/hello/{player}")
	public Message message(@PathVariable String player){
		
		Message message=new Message(player, "Hello "+player);
		return message;
	}
	
	//http://localhost:8080/SpringMVCRestExample/hello/ronaldo
	//url olarak yukar�daki gibi giresek xml ��kt� �retir
	//json ��kt� i�in ya pom.xml deki xml dependency i kald�r�rz yada url e .json uzant�s� ekleriz.
	
	
	
}
