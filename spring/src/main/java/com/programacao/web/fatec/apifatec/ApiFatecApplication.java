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
	@RequestMapping("/n1/{num}")
	double n1(@PathVariable Double num) {
		return num;	
		}
	public static void main(String[] args) {
		SpringApplication.run(ApiFatecApplication.class, args);
	}
}

