package com.example.icommerce.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Stock  implements Serializable{
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idStock;
	private int quantite;
	public Stock() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Stock(int quantite) {
		super();
		this.quantite = quantite;
	}
	public Long getIdStock() {
		return idStock;
	}
	public void setIdStock(Long idStock) {
		this.idStock = idStock;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	public Collection<Produit> getProduits() {
		return produits;
	}
	public void setProduits(Collection<Produit> produits) {
		this.produits = produits;
	}
	@OneToMany(mappedBy="stock",fetch = FetchType.LAZY)
	private Collection<Produit> produits;

}
