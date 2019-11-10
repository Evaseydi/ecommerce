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
public class Role implements Serializable{
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idRole;
	private String nom;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idUtilisateur")
    private Utilisateur utilisateur;
	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Role(String nom) {
	super();
	this.nom = nom;
}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}
	public void setUtilisateur(Utilisateur utilisateur) {
		utilisateur = utilisateur;
	}


	
	

}
