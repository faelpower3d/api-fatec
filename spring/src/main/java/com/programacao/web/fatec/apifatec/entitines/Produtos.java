package com.programacao.web.fatec.apifatec.entitines;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "produtos")
public class Produtos {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column (nullable = false, length = 60)
	private String produto;
	
	@Column (name = "preço", nullable = false)
	private double preco;	
	
	@Column (name = "quantidade_estoque", nullable = false)
	private int qtdEstoque;
	
	@Column (nullable = false)
	private boolean ativo;
	
}
