package com.programacao.web.fatec.apifatec.domain.produto;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.programacao.web.fatec.apifatec.entitines.Produto;

public class ProdutoMapper {
	public static Produto toEntity (ProdutoDTO dto) {
		Produto produto = new Produto();
		produto.setId(dto.getId());
		produto.setProduto(dto.getNome());
		produto.setPreco(dto.getPreco());
		produto.setQuantidade(dto.getQuantidade());	
		produto.setAtivo(dto.isAtivo());		
		return produto;		
	}
	public static ProdutoDTO toDTO (Produto produto) {
		ProdutoDTO dto = new ProdutoDTO();
		dto.setId(produto.getId());
		dto.setNome(produto.getProduto());
		dto.setPreco(produto.getPreco());
		dto.setQuantidade(produto.getQuantidade());
		dto.setAtivo(produto.isAtivo());		
		return dto;		
	}
	public static List<ProdutoDTO> toDTOList(List<Produto>produtos){
		return produtos.stream().map(ProdutoMapper::toDTO).collect(Collectors.toList());
		
	}

}
