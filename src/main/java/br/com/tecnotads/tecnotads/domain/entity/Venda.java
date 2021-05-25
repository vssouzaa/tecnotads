package br.com.tecnotads.tecnotads.domain.entity;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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

	@JoinColumn(name = "ID_ENDERECO", referencedColumnName = "ID")
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private Endereco endereco;

	@JoinColumn(name = "ID_FORMA_DE_PAGAMENTO", referencedColumnName = "ID")
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
	private FormaPagamento formaPagamento;

	@Column(name = "CODIGO_VENDA")
	private String codigoVenda;

	@OneToMany(mappedBy = "venda", targetEntity = ItemVenda.class, orphanRemoval = true, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Set<ItemVenda> itensVenda;

	public Venda() {
		super();
	}

	public Venda(Integer id, LocalDate dataVenda, String cliente, float totalVenda, Endereco endereco,
			FormaPagamento formaPagamento, String codigoVenda, Set<ItemVenda> itensVenda) {
		super();
		this.id = id;
		this.dataVenda = dataVenda;
		this.cliente = cliente;
		this.totalVenda = totalVenda;
		this.endereco = endereco;
		this.formaPagamento = formaPagamento;
		this.codigoVenda = codigoVenda;
		this.itensVenda = itensVenda;
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

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public FormaPagamento getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(FormaPagamento formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	public String getCodigoVenda() {
		return codigoVenda;
	}

	public void setCodigoVenda(String codigoVenda) {
		this.codigoVenda = codigoVenda;
	}

	public Set<ItemVenda> getItemVenda() {
		return itensVenda;
	}

	public void setItemVenda(Set<ItemVenda> itensVenda) {
		this.itensVenda = itensVenda;
	}

}
