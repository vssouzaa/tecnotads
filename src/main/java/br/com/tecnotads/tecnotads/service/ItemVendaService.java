package br.com.tecnotads.tecnotads.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tecnotads.tecnotads.domain.entity.ItemVenda;
import br.com.tecnotads.tecnotads.repository.ItemVendaRepository;

@Service
public class ItemVendaService {
	
	@Autowired
	private ItemVendaRepository itemVendaRepository;
	
	public List<ItemVenda> findAll(){
//		CategoriaRepository categoriaRepository = new CategoriaRepository();	
		return itemVendaRepository.findAll();
	}
	
	public ItemVenda findById(Integer id) {
		Optional<ItemVenda> obj = itemVendaRepository.findById(id);
		return obj.get();
	}
	
	public ItemVenda insert(ItemVenda obj) {
		return itemVendaRepository.save(obj);
	}
}