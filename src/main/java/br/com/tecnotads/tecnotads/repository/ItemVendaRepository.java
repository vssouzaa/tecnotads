package br.com.tecnotads.tecnotads.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.tecnotads.tecnotads.domain.entity.ItemVenda;

@Repository
public interface ItemVendaRepository extends JpaRepository<ItemVenda, Integer> {

	List<ItemVenda> findByVendaId(Integer vendaId);

}
