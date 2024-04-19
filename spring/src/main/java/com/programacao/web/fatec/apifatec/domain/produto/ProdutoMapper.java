package com.programacao.web.fatec.apifatec.domain.produto;

import com.programacao.web.fatec.apifatec.entitines.Produto;

public class ProdutoMapper {
	public static Produto toEntity (ProdutoDTO dto) {
		Produto produto = new Produto();
		produto.setId(dto.getId());
		produto.setProduto(dto.getNome());
	}

}
