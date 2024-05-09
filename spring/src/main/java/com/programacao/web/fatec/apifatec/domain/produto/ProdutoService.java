package com.programacao.web.fatec.apifatec.domain.produto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.programacao.web.fatec.apifatec.entitines.Produto;

@Service
public class ProdutoService {
	@Autowired
	private ProdutoRepository produtoRepository;

	public List<Produto> listarProdutos() {
		return produtoRepository.findAll();
	}

	public Produto encontrarProdutoPorId(Long id) {
		return produtoRepository.findById(id).orElse(null);
	}

	public Produto salvarProduto(Produto Produto) {
		return produtoRepository.save(Produto);
	}

	public void deletarProduto(Long id) {
		Produto Produto = encontrarProdutoPorId(id);
		
		if(Produto == null)
			throw new IllegalArgumentException("Produto nao existe");
		
		
		produtoRepository.deleteById(id);
	}
	
	public Produto atualizarProduto(Long id, Produto produto) {
		Produto ProdutoCadastrado = encontrarProdutoPorId(id);
		
		if (ProdutoCadastrado == null)
		{
			return null;
		} else {
			ProdutoCadastrado.setProduto(produto.getProduto());
			ProdutoCadastrado.setPreco(produto.getPreco());
			ProdutoCadastrado.setQuantidade(produto.getQuantidade());
			ProdutoCadastrado.setAtivo(produto.isAtivo());
			return produtoRepository.save(ProdutoCadastrado);
		}
	}
}