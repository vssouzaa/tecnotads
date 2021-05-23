package br.com.tecnotads.tecnotads.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tecnotads.tecnotads.domain.entity.Endereco;
import br.com.tecnotads.tecnotads.service.EnderecoService;

@RestController
@RequestMapping("enderecos")
public class EnderecoController {

	@Autowired
	private EnderecoService c;

	@GetMapping
	public List<Endereco> getAll() {

		return c.findAll();
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Endereco> findById(@PathVariable Integer id){
		Endereco obj = c.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
	@PostMapping
	public ResponseEntity<Endereco> insert(@RequestBody Endereco obj){
		obj = c.insert(obj);
		return ResponseEntity.ok().body(obj);
	}

}