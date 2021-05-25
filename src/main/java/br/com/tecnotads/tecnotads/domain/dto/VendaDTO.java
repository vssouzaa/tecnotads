package br.com.tecnotads.tecnotads.domain.dto;

import java.time.LocalDate;

public class VendaDTO {

	private LocalDate dataVenda;

	private String cliente;

	private float totalVenda;

	public VendaDTO(LocalDate dataVenda, String cliente, float totalVenda) {
		super();
		this.dataVenda = dataVenda;
		this.cliente = cliente;
		this.totalVenda = totalVenda;
	}

	public LocalDate getDataVenda() {
		return dataVenda;
	}

	public void setDataVenda(LocalDate dataVenda) {
		this.dataVenda = dataVenda;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public float getTotalVenda() {
		return totalVenda;
	}

	public void setTotalVenda(float totalVenda) {
		this.totalVenda = totalVenda;
	}
	
	

}
