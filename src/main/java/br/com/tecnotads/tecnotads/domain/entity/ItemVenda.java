package br.com.tecnotads.tecnotads.domain.entity;

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

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "ITEM_VENDA")
public class ItemVenda {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@JoinColumn(name = "ID_PRODUTO", referencedColumnName = "ID")
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
	private Produto produto;

	@Column(name = "QUANTIDADE")
	private Integer quantidade;

	@JsonIgnore
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "ID_VENDA")
	private Venda venda;

	public ItemVenda() {
		super();
	}

	public ItemVenda(Integer id, Produto produto, Integer quantidade, Venda venda) {
		super();
		this.id = id;
		this.produto = produto;
		this.quantidade = quantidade;
		this.venda = venda;
	}

	@OneToMany()
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Venda getVenda() {
		return venda;
	}

	public void setVenda(Venda venda) {
		this.venda = venda;
	}

}