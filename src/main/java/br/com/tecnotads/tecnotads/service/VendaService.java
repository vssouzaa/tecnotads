package br.com.tecnotads.tecnotads.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tecnotads.tecnotads.domain.entity.Venda;
import br.com.tecnotads.tecnotads.repository.VendaRepository;

@Service
public class VendaService {
	
	@Autowired
	private VendaRepository vendaRepository;
	
	public List<Venda> findAll(){
		return vendaRepository.findAll();
	}
	
	public Venda findById(Integer id) {
		Optional<Venda> obj = vendaRepository.findById(id);
		return obj.get();
	}
	
	public Venda insert(Venda obj) {
		return vendaRepository.save(obj);
	}
}