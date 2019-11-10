package com.example.icommerce.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity (name="Achat")
public class Achat implements Serializable{
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idAchat;
	private  String status;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idDetailAchat")
	private DetailAchat detailAchat;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public DetailAchat getDetailAchat() {
		return detailAchat;
	}
	public void setDetailAchat(DetailAchat detailAchat) {
		this.detailAchat = detailAchat;
	}
	
	public Achat() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Achat(double quantite, double prixinitial, double prixtotale) {
		super();
		this.quantite = quantite;
		this.prixinitial = prixinitial;
		this.prixtotale = prixtotale;
	}
	public long getIdAchat() {
		return idAchat;
	}
	public void setIdAchat(long idAchat) {
		this.idAchat = idAchat;
	}
	public double getQuantite() {
		return quantite;
	}
	public void setQuantite(double quantite) {
		this.quantite = quantite;
	}
	public double getPrixinitial() {
		return prixinitial;
	}
	public void setPrixinitial(double prixinitial) {
		this.prixinitial = prixinitial;
	}
	public double getPrixtotale() {
		return prixtotale;
	}
	public void setPrixtotale(double prixtotale) {
		this.prixtotale = prixtotale;
	}
	public Collection<Produit> getProduits() {
		return produits;
	}
	public void setProduits(Collection<Produit> produits) {
		this.produits = produits;
	}
	public Collection<Client> getClients() {
		return clients;
	}
	public void setClients(Collection<Client> clients) {
		this.clients = clients;
	}
	public Collection<Facture> getFactures() {
		return factures;
	}
	public void setFactures(Collection<Facture> factures) {
		this.factures = factures;
	}
	private double quantite;
	private double prixinitial;
	private double prixtotale;
	@OneToMany(mappedBy="achat",fetch = FetchType.LAZY)
	private Collection <Produit> produits;
	@OneToMany(mappedBy="achat",fetch = FetchType.LAZY)
	private Collection <Client> clients;
	@OneToMany(mappedBy="achat",fetch = FetchType.LAZY)
	private Collection <Facture> factures;

	
}
