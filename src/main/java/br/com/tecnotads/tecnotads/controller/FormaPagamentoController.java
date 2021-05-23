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

import br.com.tecnotads.tecnotads.domain.entity.FormaPagamento;
import br.com.tecnotads.tecnotads.service.FormaPagamentoService;

@RestController
@RequestMapping("formas-pagamento")
public class FormaPagamentoController {

	@Autowired
	private FormaPagamentoService c;

	@GetMapping
	public List<FormaPagamento> getAll() {

		return c.findAll();
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<FormaPagamento> findById(@PathVariable Integer id){
		FormaPagamento obj = c.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
	@PostMapping
	public ResponseEntity<FormaPagamento> insert(@RequestBody FormaPagamento obj){
		obj = c.insert(obj);
		return ResponseEntity.ok().body(obj);
	}

}