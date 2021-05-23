package br.com.tecnotads.tecnotads.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tecnotads.tecnotads.domain.entity.FormaPagamento;
import br.com.tecnotads.tecnotads.repository.FormaPagamentoRepository;

@Service
public class FormaPagamentoService {
	
	@Autowired
	private FormaPagamentoRepository formaPagamentoRepository;
	
	public List<FormaPagamento> findAll(){
//		CategoriaRepository categoriaRepository = new CategoriaRepository();	
		return formaPagamentoRepository.findAll();
	}
	
	public FormaPagamento findById(Integer id) {
		Optional<FormaPagamento> obj = formaPagamentoRepository.findById(id);
		return obj.get();
	}
	
	public FormaPagamento insert(FormaPagamento obj) {
		return formaPagamentoRepository.save(obj);
	}

}