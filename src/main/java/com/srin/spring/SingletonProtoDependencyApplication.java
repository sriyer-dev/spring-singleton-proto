package com.srin.spring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SingletonProtoDependencyApplication {

	@Autowired
	private Singleton singleton;
	
	public static void main(String[] args) {
		SpringApplication.run(SingletonProtoDependencyApplication.class, args);
	}
	
	@RequestMapping("/")
	public List<String> invoke() {
		System.out.println("Singleton: " + singleton);
		
		Prototype proto1 = singleton.getPrototype();
		Prototype proto2 = singleton.getPrototype();
		
		System.out.println("Prototype invocation 1: " + proto1);
		System.out.println("Prototype invocation 2: " + proto2);
		
		return List.of("Proto1: " + proto1 , "Proto2: " + proto2, 
				"proto1==proto2: " + (proto1 == proto2) );
	}
	
	
	
	

}
