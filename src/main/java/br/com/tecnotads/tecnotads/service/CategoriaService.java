package br.com.tecnotads.tecnotads.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tecnotads.tecnotads.domain.entity.Categoria;
import br.com.tecnotads.tecnotads.repository.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public List<Categoria> findAll(){
//		CategoriaRepository categoriaRepository = new CategoriaRepository();	
		return categoriaRepository.findAll();
	}

	public Categoria findById(Integer id) {
		Optional<Categoria> obj = categoriaRepository.findById(id);
		return obj.get();
	}
	
}