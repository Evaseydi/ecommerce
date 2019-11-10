package com.example.icommerce.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class Facture implements Serializable {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idFacture;
	private String Description;
	private  String nomclient;
	@ManyToOne
	@JoinColumn(name="idAchat")
	private Achat achat;
	public Facture() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Facture(String description, String nomclient) {
		super();
		Description = description;
		this.nomclient = nomclient;
	}
	public long getIdFacture() {
		return idFacture;
	}
	public void setIdFacture(long idFacture) {
		this.idFacture = idFacture;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getNomclient() {
		return nomclient;
	}
	public void setNomclient(String nomclient) {
		this.nomclient = nomclient;
	}
	public Achat getAchat() {
		return achat;
	}
	public void setAchat(Achat achat) {
		this.achat = achat;
	}

}
