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
public class Commune implements Serializable {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idCommune;
	private String nom;
	 @ManyToOne(fetch=FetchType.LAZY)
		@JoinColumn(name="idDepartement")
	private Departement departement;
	 
	public Departement getDepartement() {
		return departement;
	}
	public void setDepartement(Departement departement) {
		this.departement = departement;
	}
	@OneToMany(mappedBy="commune",fetch = FetchType.LAZY)
	private Collection <Quartier> quartiers;
	public Commune() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Commune(String nom) {
		super();
		this.nom = nom;
	}
	public long getIdCommune() {
		return idCommune;
	}
	public void setIdCommune(long idCommune) {
		this.idCommune = idCommune;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Collection<Quartier> getQuartiers() {
		return quartiers;
	}
	public void setQuartiers(Collection<Quartier> quartiers) {
		this.quartiers = quartiers;
	}

}
