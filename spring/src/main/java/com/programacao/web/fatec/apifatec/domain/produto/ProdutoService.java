package com.programacao.web.fatec.apifatec.domain.produto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.programacao.web.fatec.apifatec.entitines.Produto;

@Service
public class ProdutoService {
	@Autowired
	private ProdutoRepository produtoRepository;
	
	public List <Produto> ListarProdutos(){
		return produtoRepository.findAll();
	}
	
	public Produto encontrarProdutoPorId(Long id) {
		return produtoRepository.findById(id).orElse(null);
	}
	
	public Produto SalvarProduto (Produto produto) {
		return produtoRepository.save(produto);		
	}
	
	public void deletarProduto (Long id) {
		Produto produto = encontrarProdutoPorId(id);
		if (produto == null)
		{
			
		}
		
		produtoRepository.deleteById(id);		
	}
	public Produto atualizarProduto(Long id, Produto produto) {
		Produto produtoCadastradoProduto = encontrarProdutoPorId(id);
		
		if (produtoCadastradoProduto==null)
		{
			return null;
		}else {
			produtoCadastradoProduto.setNome(produto.getNome());
		}
		
		
	}

}
