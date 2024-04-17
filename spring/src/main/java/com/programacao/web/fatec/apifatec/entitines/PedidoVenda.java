package com.programacao.web.fatec.apifatec.entitines;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Pedido_venda")
public class PedidoVenda {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="cliente_id")
	private Cliente cliente;
	
	@Column (name="emissao")
	private LocalDate emissao;
	
	@Column (precision = 20 , scale = 2)
	private BigDecimal total;
	
	@Enumerated(EnumType.STRING)
	private PedidoVendaStatusEnum status;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy ="pedidoVenda",orphanRemoval=trues)
	
}
