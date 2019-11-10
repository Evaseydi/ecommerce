package com.example.icommerce.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.example.icommerce.entities.Departement;
@Entity
public class Region implements Serializable {
	
	
			@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
			private long idRegion;
			private String nom;
			@OneToMany(mappedBy="region",fetch = FetchType.LAZY)
			private Collection <Departement> departement;
			public Region() {
				super();
				// TODO Auto-generated constructor stub
			}
			public Region(String nom) {
				super();
				this.nom = nom;
			}
			public long getIdRegion() {
				return idRegion;
			}
			public void setIdRegion(long idRegion) {
				this.idRegion = idRegion;
			}
			public String getNom() {
				return nom;
			}
			public void setNom(String nom) {
				this.nom = nom;
			}
			public Collection<Departement> getDepartement() {
				return departement;
			}
			public void setDepartement(Collection<Departement> departement) {
				this.departement = departement;
			}

}
