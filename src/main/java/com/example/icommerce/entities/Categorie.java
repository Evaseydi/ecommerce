package com.example.icommerce.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity(name="Categorie")

public class Categorie implements Serializable {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idCategorie;
	private String nom;
	private String decription;
	@OneToMany(mappedBy="categorie")
	private Collection<Produit> produit;
	public Categorie() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return idCategorie;
	}
	public void setId(long id) {
		this.idCategorie = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getDecription() {
		return decription;
	}
	public void setDecription(String decription) {
		this.decription = decription;
	}

	public long getIdCategorie() {
		return idCategorie;
	}

	public void setIdCategorie(long idCategorie) {
		this.idCategorie = idCategorie;
	}

	public Collection<Produit> getProduit() {
		return produit;
	}

	public void setProduit(Collection<Produit> produit) {
		this.produit = produit;
	}

	public Categorie(String nom, String decription) {
		super();
		this.nom = nom;
		this.decription = decription;
	}



}
