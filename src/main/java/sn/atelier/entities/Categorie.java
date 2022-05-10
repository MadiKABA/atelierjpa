package sn.atelier.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Categorie {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		@Column(length = 50)
		private String libelle;
		@OneToMany(mappedBy = "idCat")
		private List<Produit> produits=new ArrayList<Produit>();
		
		public Categorie() {
			super();
		}

		public Categorie(String libelle) {
			super();
			this.libelle = libelle;
		}

		public String getLibelle() {
			return libelle;
		}

		public void setLibelle(String libelle) {
			this.libelle = libelle;
		}
		
		
		
}
