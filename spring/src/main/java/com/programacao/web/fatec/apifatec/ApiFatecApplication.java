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
			cliente.setNome("Danilo");
			cliente.setEmail("h2danilofatec@hotmail.com");
			cliente.setEndereco("Rua pedro, 126");
			cliente.setRazaoSocial("Danilo");
			
			clienteRepository.save(cliente);
		};
	}	
	
	public static void main(String[] args) {
		SpringApplication.run(ApiFatecApplication.class, args);
		
		System.out.print("gg");
		
	}
}

