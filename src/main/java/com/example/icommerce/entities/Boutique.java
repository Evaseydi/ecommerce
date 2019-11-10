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
public class Boutique  implements Serializable{
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private  long idboutique;
	private  String nom;
	private String adresse;

	@OneToMany(mappedBy="boutique",fetch = FetchType.LAZY)
	private  Collection  <Commercant> commercants;

	@ManyToOne
	@JoinColumn(name="idquartier")
	private Quartier quartier;
	public Boutique() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Boutique(String nom, String adresse) {
		super();
		this.nom = nom;
		this.adresse = adresse;
	}
	public long getIdboutique() {
		return idboutique;
	}
	public void setIdboutique(long idboutique) {
		this.idboutique = idboutique;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public Collection<Commercant> getCommercants() {
		return commercants;
	}
	public void setCommercants(Collection<Commercant> commercants) {
		this.commercants = commercants;
	}

}
