package com.programacao.web.fatec.apifatec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.websocket.server.PathParam;

@RestController // define ser o principal
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
	@RequestMapping("/numero/{num}")
	double n1(@PathVariable Double num) {
		return num;	
		}
	
	@RequestMapping("/idade/{n}")	
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
	@RequestMapping("/animal/{bixo}")
	String animal(@PathVariable String bixo) {
		
		String[] animal = {"cao","gato","cavalo","vaca","porco"};
		String[] sons = {"AUAU!!","MIAU!!", "IHHIIII", "MUU","INHOC INHOC!!"};
		for (int i = 0; i < sons.length; i++) {
			if (bixo == animal[i]) {
				return sons [i];				
			}else {
				return "animal invalido";
			}			
		}
		
		
		return "tks";
		
	
	}
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(ApiFatecApplication.class, args);
		
		System.out.print("gg");
		
	}
}

