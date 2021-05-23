package br.com.tecnotads.tecnotads.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.tecnotads.tecnotads.domain.entity.Venda;

@Repository
public interface VendaRepository extends JpaRepository<Venda, Integer> {

}
