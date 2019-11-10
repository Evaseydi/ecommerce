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
@Entity
public class Quartier implements Serializable {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idQuartier;
	 private String nom;
	 private String adresse;
	 public Commune getCommune() {
		return commune;
	}
	public void setCommune(Commune commune) {
		this.commune = commune;
	}
	@ManyToOne(fetch=FetchType.LAZY)
		@JoinColumn(name="idCommune")
	 private Commune commune;
	 @OneToMany(mappedBy="quartier",fetch=FetchType.LAZY)
	 private Collection <Boutique>boutiques;
	public Quartier(String nom, String adresse) {
		super();
		this.nom = nom;
		this.adresse = adresse;
	}
	public long getIdQuartier() {
		return idQuartier;
	}
	public void setIdQuartier(long idQuartier) {
		this.idQuartier = idQuartier;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Quartier() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public Collection<Boutique> getBoutiques() {
		return boutiques;
	}
	public void setBoutiques(Collection<Boutique> boutiques) {
		this.boutiques = boutiques;
	}

}
