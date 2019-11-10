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
public class DetailAchat implements Serializable {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idDetailAchat;
	public Long getIdDetailAchat() {
		return idDetailAchat;
	}
	public void setIdDetailAchat(Long idDetailAchat) {
		this.idDetailAchat = idDetailAchat;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	public int getPrixUnitaire() {
		return prixUnitaire;
	}
	public void setPrixUnitaire(int prixUnitaire) {
		this.prixUnitaire = prixUnitaire;
	}
	public Collection<Produit> getProduits() {
		return produits;
	}
	public void setProduits(Collection<Produit> produits) {
		this.produits = produits;
	}
	public Collection<Achat> getAchats() {
		return achats;
	}
	public void setAchats(Collection<Achat> achats) {
		this.achats = achats;
	
	}
	public DetailAchat(int quantite, int prixUnitaire) {
		super();
		this.quantite = quantite;
		this.prixUnitaire = prixUnitaire;
	}
	public DetailAchat() {
		super();
		// TODO Auto-generated constructor stub
	}
	private int quantite;
	private int prixUnitaire;
	@OneToMany(mappedBy="detailAchat",fetch = FetchType.LAZY)
	private Collection <Produit> produits;
	@OneToMany(mappedBy="detailAchat",fetch = FetchType.LAZY)
	private Collection <Achat>achats;
    
    
}
