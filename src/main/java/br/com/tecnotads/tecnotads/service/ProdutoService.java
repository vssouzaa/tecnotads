package br.com.tecnotads.tecnotads.service;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import br.com.tecnotads.tecnotads.domain.entity.Produto;
import br.com.tecnotads.tecnotads.repository.ProdutoRepository;
import br.com.tecnotads.tecnotads.service.exceptions.DatabaseException;
import br.com.tecnotads.tecnotads.service.exceptions.ResourceNotFoundException;

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
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
	}
	
	public Produto insert(Produto obj) {
		return produtoRepository.save(obj);
	}
	
	public void delete(Integer id) {
		try {
		produtoRepository.deleteById(id);
		} catch (EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException(id);
		} catch (DataIntegrityViolationException e) {
			throw new DatabaseException(e.getMessage());
		}
	}
	
	public Produto update(Integer id, Produto obj) {
		try {
			Produto produto = produtoRepository.getOne(id);
			updateData(produto, obj);
			return produtoRepository.save(produto);
		} catch (EntityNotFoundException e){
			throw new ResourceNotFoundException(id);
		}
		
	}

	private void updateData(Produto produto, Produto obj) {

		produto.setNome(obj.getNome());
		produto.setDescricao(obj.getDescricao());
		produto.setQuantidade(obj.getQuantidade());
		produto.setPreco(obj.getPreco());
		produto.setCategoria(obj.getCategoria());
		produto.setFoto(obj.getFoto());
	}
	
}




