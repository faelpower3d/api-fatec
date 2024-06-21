package Categoriaa;

import java.util.List;
import java.util.stream.Collectors;

public class Mapper {
	public static Categoria toEntity (CategoriaDTO dto) {
		Categoria cat = new Categoria();
		cat.setId(dto.getId());
		cat.setNome(dto.getNome());
		return cat;
	}
	public static CategoriaDTO toDTO (Categoria categoria) {
		CategoriaDTO dto = new CategoriaDTO();
		dto.setId(categoria.getId());
		dto.setNome(categoria.getNome());
		return dto;
	}
	public static List<CategoriaDTO> toDTOList(List<Categoria>categorias){
		return categorias.stream().map(Mapper::toDTO).collect(Collectors.toList());
	}
	
}
