package com.example.icommerce.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Utilisateur implements Serializable {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idUtilisateur ;
	 private String nom;
	 private String prenom;
	 private Date datenaiss;
	 private String nationalite;
	 private String email;
	 private String password;
	 @OneToMany(mappedBy="utilisateur",fetch = FetchType.LAZY)
	 private Collection<Role> roles;
	public Utilisateur() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Utilisateur(String nom, String prenom, Date datenaiss, String nationalite, String email, String password) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.datenaiss = datenaiss;
		this.nationalite = nationalite;
		this.email = email;
		this.password = password;
	}
	public long getIdUtilisateur() {
		return idUtilisateur;
	}
	public void setIdUtilisateur(long idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
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
	public Date getDatenaiss() {
		return datenaiss;
	}
	public void setDatenaiss(Date datenaiss) {
		this.datenaiss = datenaiss;
	}
	public String getNationalite() {
		return nationalite;
	}
	public void setNationalite(String nationalite) {
		this.nationalite = nationalite;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Collection<Role> getRoles() {
		return roles;
	}
	public void setRoles(Collection<Role> roles) {
		this.roles = roles;
	}
	 
	 
	 

}
