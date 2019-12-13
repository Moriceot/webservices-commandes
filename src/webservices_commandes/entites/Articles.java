package webservices_commandes.entites;

import java.io.Serializable;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="articles")
@Access(AccessType.FIELD)
@NamedQuery(name = "articles.getById",
			query ="SELECT a FROM Articles a WHERE a.id LIKE :id" )
public class Articles implements Serializable{
		//Attributs*********************************************************
		@Id @GeneratedValue(strategy = GenerationType.IDENTITY) private long id;
		private String nom;
		private int stock;
		private double prix;
		
		//Constructeurs*********************************************************
		public Articles(String nom, int stock, double prix) {
			super();
			this.nom = nom;
			this.stock = stock;
			this.prix = prix;
		}
		public Articles() {
			super();
		}
		
		//Getters & Setters*********************************************************
		/**
		 * @return the id
		 */
		public long getId() {
			return id;
		}
		/**
		 * @param id the id to set
		 */
		public void setId(int id) {
			this.id = id;
		}
		/**
		 * @return the nom
		 */
		public String getNom() {
			return nom;
		}
		/**
		 * @param nom the nom to set
		 */
		public void setNom(String nom) {
			this.nom = nom;
		}
		/**
		 * @return the stock
		 */
		public int getStock() {
			return stock;
		}
		/**
		 * @param stock the stock to set
		 */
		public void setStock(int stock) {
			this.stock = stock;
		}
		/**
		 * @return the prix
		 */
		public double getPrix() {
			return prix;
		}
		/**
		 * @param prix the prix to set
		 */
		public void setPrix(double prix) {
			this.prix = prix;
		}
		
		
}
