package br.com.tecnotads.tecnotads.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tecnotads.tecnotads.domain.entity.Categoria;
import br.com.tecnotads.tecnotads.service.CategoriaService;

@RestController
@RequestMapping("categorias")
public class CategoriaController {

	@Autowired
	private CategoriaService c;
	
	@GetMapping
	public List<Categoria> getAll(){
		
		return c.findAll();
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Categoria> findById(@PathVariable Integer id){
		Categoria obj = c.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
}
