package br.com.api.fatec.apifatec.p2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("/api/categoria")
public class CategoriaController {
	@Autowired
	private CategoriaService categoriaService;
	
	@GetMapping
	public ResponseEntity<List<Categoria>> listarCategoria() {
		List<Categoria> categoria = categoriaService.listarCategoria();
		return new ResponseEntity<>(categoria,HttpStatus.OK);
	}
	@GetMapping("/{id}")
	public ResponseEntity<Categoria> encontrarCategoriaPorId(@PathVariable Long id){
		Categoria categoria = categoriaService.encontrarCategoriaPorID(id);
		return categoria!= null? new ResponseEntity<>(categoria,HttpStatus.OK)
				:new ResponseEntity<>(HttpStatus.NOT_FOUND);
		
	}
	
	@PostMapping()
	public ResponseEntity<Categoria> salvarCategoria (@RequestBody Categoria categoria){
		Categoria categoriaSalvo= categoriaService.salvarCategoria(categoria);
		return new ResponseEntity<>(categoriaSalvo, HttpStatus.CREATED);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deletarCategoria(@PathVariable Long id) {
		categoriaService.deletarCategoria(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Categoria> AtualizarCategoria(@PathVariable Long id, @RequestBody Categoria categoria) {
		Categoria categoriaAtualizado = categoriaService.atualizarCategoria(id, categoria);
		return new ResponseEntity<>(categoriaAtualizado, HttpStatus.OK);
	}


}
