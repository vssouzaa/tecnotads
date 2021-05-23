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

import br.com.tecnotads.tecnotads.domain.entity.Venda;
import br.com.tecnotads.tecnotads.service.VendaService;

@RestController
@RequestMapping("vendas")
public class VendaController {

	@Autowired
	private VendaService c;

	@GetMapping
	public List<Venda> getAll() {

		return c.findAll();
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Venda> findById(@PathVariable Integer id){
		Venda obj = c.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
	@PostMapping
	public ResponseEntity<Venda> insert(@RequestBody Venda obj){
		obj = c.insert(obj);
		return ResponseEntity.ok().body(obj);
	}
	
	
	
	
	
	
}