package com.example.icommerce.entities;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

@Entity
@Table(name = "Produit")
public class Produit  implements Serializable{
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String nom;
	private String designation;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idDetailAchat")
	private DetailAchat detailAchat;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idStock")
	private Stock stock;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idAchat")
	private Achat achat;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idCategorie")
	private Categorie categorie;
	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Produit(long id, String nom, String designation, double prix) {
		super();
		this.id = id;
		this.nom = nom;
		this.designation = designation;
		this.prix = prix;
	}
	public DetailAchat getDetailAchat() {
		return detailAchat;
	}
	public void setDetailAchat(DetailAchat detailAchat) {
		this.detailAchat = detailAchat;
	}
	public Stock getStock() {
		return stock;
	}
	public void setStock(Stock stock) {
		this.stock = stock;
	}
	public Achat getAchat() {
		return achat;
	}
	public void setAchat(Achat achat) {
		this.achat = achat;
	}
	public Categorie getCategorie() {
		return categorie;
	}
	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}
	private double prix;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}





}
