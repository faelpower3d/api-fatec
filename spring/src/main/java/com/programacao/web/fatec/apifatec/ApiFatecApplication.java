package com.programacao.web.fatec.apifatec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.programacao.web.fatec.apifatec.entitines.Cliente;
import com.programacao.web.fatec.apifatec.domain.cliente.ClienteRepository;


@SpringBootApplication
public class ApiFatecApplication {
	
	
	@Bean
	public CommandLineRunner run(@Autowired ClienteRepository clienteRepository) {
		return args -> {
			Cliente cliente = new Cliente();
			cliente.setNome("Jão Melão");
			cliente.setEmail("jao@hotmail.com");
			cliente.setEndereco("Rua thurusbango, 69");
			cliente.setRazaoSocial("Melão");
			clienteRepository.save(cliente);			
			
		};
	}	
	
	public static void main(String[] args) {
		SpringApplication.run(ApiFatecApplication.class, args);		
		
	}
}

