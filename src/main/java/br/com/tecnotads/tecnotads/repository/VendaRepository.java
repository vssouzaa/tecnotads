package br.com.tecnotads.tecnotads.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.tecnotads.tecnotads.domain.entity.Venda;

@Repository
public interface VendaRepository extends JpaRepository<Venda, Integer> {

//	@Query("SELECT v FROM Venda v " //
//			+ "INNER JOIN FETCH v.endereco " //
//			+ "INNER JOIN FETCH v.formaPagamento " 
//			+ "INNER JOIN FETCH v.itensVenda ")
//	List<Venda> findFetchAll();

}
