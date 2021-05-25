package br.com.tecnotads.tecnotads.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tecnotads.tecnotads.domain.entity.Produto;
import br.com.tecnotads.tecnotads.repository.ProdutoRepository;

@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository produtoRepository;
	
	public List<Produto> findAll(){
//		ProdutoRepository produtoRepository = new ProdutoRepository();	
		return produtoRepository.findAll();
	}
	
	public Produto findById(Integer id) {
		Optional<Produto> obj = produtoRepository.findById(id);
		return obj.get();
	}
	
	public Produto insert(Produto obj) {
		return produtoRepository.save(obj);
	}
	
}




