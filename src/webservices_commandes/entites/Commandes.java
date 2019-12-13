package webservices_commandes.entites;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "commandes")
@Access(AccessType.FIELD)
public class Commandes implements Serializable{
	
	//Attributs*********************************************************
	@Id@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String numero;
	@OneToMany(cascade = CascadeType.PERSIST)
	@JoinTable(name = "commandes_articles",
		joinColumns= @JoinColumn(name = "id_Cde"), inverseJoinColumns=@JoinColumn(name="id_Article"))
	private List<Articles> articles;
	
	//Constructeurs*********************************************************
	public Commandes(int id, String numero) {
		super();
		this.id = id;
		this.numero = numero;
	}
	public Commandes() {
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
	 * @return the numero
	 */
	public String getNumero() {
		return numero;
	}
	/**
	 * @param numero the numero to set
	 */
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	
}
