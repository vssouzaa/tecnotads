package br.com.tecnotads.tecnotads.domain.entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "VENDA")
public class Venda {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "DATA_VENDA")
	private LocalDate dataVenda;
	
	@Column(name = "CLIENTE")
	private String cliente;
	
	@Column(name = "TOTAL_VENDA")
	private float totalVenda;
	
	@Column(name = "ID_ENDERECO")
	private Integer idEndereco;
	
	
	@JoinColumn(name = "ID_FORMA_DE_PAGAMENTO", referencedColumnName = "ID")
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private FormaPagamento formaPagamento;

	public Venda() {
		super();
	}
	
	public Venda(Integer id, LocalDate dataVenda, String cliente, float totalVenda, Integer idEndereco, FormaPagamento formaPagamento) {
		super();
		this.id = id;
		this.dataVenda = dataVenda;
		this.cliente = cliente;
		this.totalVenda = totalVenda;
		this.idEndereco = idEndereco;
		this.formaPagamento = formaPagamento;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public Integer getIdEndereco() {
		return idEndereco;
	}

	public void setIdEndereco(Integer idEndereco) {
		this.idEndereco = idEndereco;
	}

	public FormaPagamento getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(FormaPagamento formaPagamento) {
		this.formaPagamento = formaPagamento;
	}
}
