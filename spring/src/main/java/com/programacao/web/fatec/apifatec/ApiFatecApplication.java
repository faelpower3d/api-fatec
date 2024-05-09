package com.programacao.web.fatec.apifatec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.programacao.web.fatec.apifatec.entitines.Cliente;
import com.programacao.web.fatec.apifatec.entitines.Produto;
import com.programacao.web.fatec.apifatec.domain.cliente.ClienteRepository;
import com.programacao.web.fatec.apifatec.domain.produto.ProdutoRepository;


@SpringBootApplication
public class ApiFatecApplication {
	
	
	@Bean
	public CommandLineRunner run(@Autowired ClienteRepository clienteRepository, @Autowired ProdutoRepository produtoRepository) {
		return args -> {
			Cliente cliente = new Cliente();
			cliente.setNome("Jão Melão");
			cliente.setEmail("jao@hotmail.com");
			cliente.setEndereco("Rua thurusbango, 69");
			cliente.setRazaoSocial("Melão");
			clienteRepository.save(cliente);	
			
			Produto prod = new Produto();
			prod.setProduto("Memoria RAM 8 GB");
			prod.setQuantidade(2);
			prod.setPreco(100);
			produtoRepository.save(prod);	
			
		};
	};	
	
	
	public static void main(String[] args) {
		SpringApplication.run(ApiFatecApplication.class, args);		
		
	}
}

