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

import com.example.icommerce.entities.Commune;
import com.example.icommerce.entities.Quartier;
import com.example.icommerce.entities.Region;
@Entity

public class Departement  implements Serializable {
	
		@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
		private long idDepartement;
		private String nom;
		
		
		@OneToMany(mappedBy="departement",fetch = FetchType.LAZY)
		private Collection <Commune> commune;
		@ManyToOne(fetch=FetchType.LAZY)
		@JoinColumn(name="idRegion")
		private Region region;
		public Departement() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Departement(String nom) {
			super();
			this.nom = nom;
		}
		public long getIdDepartement() {
			return idDepartement;
		}
		public void setIdDepartement(long idDepartement) {
			this.idDepartement = idDepartement;
		}
		public String getNom() {
			return nom;
		}
		public void setNom(String nom) {
			this.nom = nom;
		}
		public Collection<Commune> getCommune() {
			return commune;
		}
		public void setCommune(Collection<Commune> commune) {
			this.commune = commune;
		}
		

}
