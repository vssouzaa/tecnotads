package br.com.tecnotads.tecnotads.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tecnotads.tecnotads.domain.entity.Endereco;
import br.com.tecnotads.tecnotads.repository.EnderecoRepository;

@Service
public class EnderecoService {
	
	@Autowired
	private EnderecoRepository enderecoRepository;
	
	public List<Endereco> findAll(){
//		EnderecoRepository enderecoRepository = new EnderecoRepository();	
		return enderecoRepository.findAll();
	}
	
	public Endereco findById(Integer id) {
		Optional<Endereco> obj = enderecoRepository.findById(id);
		return obj.get();
	}
	
	public Endereco insert(Endereco obj) {
		return enderecoRepository.save(obj);
	}

}