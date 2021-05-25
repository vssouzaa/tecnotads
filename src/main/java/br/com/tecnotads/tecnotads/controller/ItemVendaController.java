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

import br.com.tecnotads.tecnotads.domain.entity.ItemVenda;
import br.com.tecnotads.tecnotads.service.ItemVendaService;

@RestController
@RequestMapping("itens-Venda")
public class ItemVendaController {

	@Autowired
	private ItemVendaService c;

	@GetMapping
	public List<ItemVenda> getAll() {

		return c.findAll();
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<ItemVenda> findById(@PathVariable Integer id){
		ItemVenda obj = c.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
	@PostMapping
	public ResponseEntity<ItemVenda> insert(@RequestBody ItemVenda obj){
		obj = c.insert(obj);
		return ResponseEntity.ok().body(obj);
	}
}