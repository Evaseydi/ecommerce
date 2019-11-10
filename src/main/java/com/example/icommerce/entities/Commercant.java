package com.example.icommerce.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Commercant  implements Serializable
{
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idcommercant;
	private String nom;
	private String prenom;
	private String email;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idboutique")
	private Boutique boutique;
	
	public Commercant() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Commercant(String nom, String prenom, String email) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
	}
	public long getIdcommercant() {
		return idcommercant;
	}
	public void setIdcommercant(long idcommercant) {
		this.idcommercant = idcommercant;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Boutique getBoutique() {
		return boutique;
	}
	public void setBoutique(Boutique boutique) {
		this.boutique = boutique;
	}

}
