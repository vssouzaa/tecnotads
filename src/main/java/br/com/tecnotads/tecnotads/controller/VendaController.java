package br.com.tecnotads.tecnotads.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.tecnotads.tecnotads.domain.dto.VendaDTO;
import br.com.tecnotads.tecnotads.domain.entity.Venda;
import br.com.tecnotads.tecnotads.service.VendaService;

@RestController
@RequestMapping(value = "vendas", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class VendaController {

	@Autowired
	private VendaService vendaService;

	@GetMapping
	public List<Venda> getAll() {

		return vendaService.findAll();
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Venda> findById(@PathVariable Integer id) {
		Venda venda = vendaService.findById(id);
		return ResponseEntity.ok().body(venda);
	}

	@PostMapping
	public ResponseEntity<Venda> insert(@RequestBody Venda venda) {
//		Venda venda = new Venda();

		venda = vendaService.insert(venda);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(venda.getId()).toUri();
		return ResponseEntity.created(uri).body(venda);
	}

}