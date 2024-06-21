package br.com.api.fatec.apifatec.p2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaService {
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public Categoria criarCategoria(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }
	
	public List<Categoria> listarCategoria() {
		return categoriaRepository.findAll();
	}	
	
	public Categoria encontrarCategoriaPorID(Long id) {
		return categoriaRepository.findById(id).orElse(null);
	} 
	
	public Categoria salvarCategoria(Categoria categoria) {
		return categoriaRepository.save(categoria);
	}
	
	 public Categoria atualizarCategoria(Long id, Categoria categoria) {
		 Categoria CategoriaCadastrado = encontrarCategoriaPorID(id);
		 
		 if (CategoriaCadastrado== null)
		 {
			 return null;		
		 }else {
			CategoriaCadastrado.setNome(categoria.getNome());
			return categoriaRepository.save(CategoriaCadastrado);
		}
		 
	}	 
	 public void deletarCategoria(Long id) {
	        categoriaRepository.deleteById(id);
	    }
	
		

}