package com.programacao.web.fatec.apifatec.domain.cliente;

import org.springframework.data.jpa.repository.JpaRepository;

import com.programacao.web.fatec.apifatec.entitines.Cliente;

public interface ClienteRepository  extends  JpaRepository<Cliente, Long> {	

}
