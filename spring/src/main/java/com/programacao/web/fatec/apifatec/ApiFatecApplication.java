package com.programacao.web.fatec.apifatec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.websocket.server.PathParam;

@RestController
@SpringBootApplication
public class ApiFatecApplication {
	double set = 71*10100;
	
	@RequestMapping("/")
	String home() {	
	return "http://localhost:8090/hello";	}
	@RequestMapping("/hello")
	String home2() {
	return "HELLO WORLD 😎";	
	}
	@RequestMapping("/n")
	double n() {
		return set;	
		}
	/*@RequestMapping("/n1/{num}")
	double n1(@PathVariable Double num) {
		return num;	
		}*/
	
	@RequestMapping("/n1/{n}")
	String n1(@PathVariable String n) {		
		int n1 = Integer.parseInt(n);		
		if (n1>0 && n1 <12) {
			return "Criança";
		}else if (n1>=12 && n1 <=18) {
			return "Adolescente";			
		}else if (n1>=19 && n1 <60) {
			return "Adulto";
		}else if (n1>=60) {
			return "Idoso";
		}else {
			return "dado invalido";
		}
			
			
		}
	
	public static void main(String[] args) {
		SpringApplication.run(ApiFatecApplication.class, args);
		
		
	}
}

