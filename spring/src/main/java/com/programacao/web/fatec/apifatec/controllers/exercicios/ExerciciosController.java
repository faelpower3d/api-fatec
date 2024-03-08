package com.programacao.web.fatec.apifatec.controllers.exercicios;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

public class ExerciciosController {
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
}
