package com.programacao.web.fatec.apifatec.controllers.exercicios;
import java.util.ArrayList;
import java.util.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.websocket.server.PathParam;

@RestController // define ser o principal
@SpringBootApplication
public class ExerciciosController {
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
	
	
	//http://localhost:8090/api/exercicios/animals/cachorro,gato
		@GetMapping("/animals/{types}")
	    public List<String> getAnimalSounds(@PathVariable String[] types) {
	     
			
	        List<String> sounds = new ArrayList<>();
	        
	        //FORMA 1: USANDO FOR
	        for (String type : types) {
	            sounds.add(getSoundByAnimalType(type));
	        }
	        return sounds;
	        
	        //FORMA 2: USANDO MAP
	        /*return Arrays.stream(types)
	        .map(this::getSoundByAnimalType)
	        .collect(Collectors.toList());*/
	        
	    }
		
		private String getSoundByAnimalType(String type) {
	        switch (type.toLowerCase()) {
	            case "cachorro":
	                return "AuAu";
	            case "gato":
	                return "Miauu";
	            case "vaca":
	                return "Moo";
	            default:
	                return "animal desconhecido";
	        }
	    }
}