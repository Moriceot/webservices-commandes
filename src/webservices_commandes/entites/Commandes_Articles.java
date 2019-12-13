package webservices_commandes.entites;

import javax.persistence.OneToMany;

public class Commandes_Articles {
	//Attributs*********************************************************
	@OneToMany(mappedBy = "id")
	private int idCde;
	@OneToMany(mappedBy = "id")
	private int idArt;
	
	//Constructeurs*********************************************************
	public Commandes_Articles(int idCde, int idArt) {
		super();
		this.idCde = idCde;
		this.idArt = idArt;
	}
	public Commandes_Articles() {
		super();
	}
	
	//Getters & Setter*********************************************************
	/**
	 * @return the idCde
	 */
	public int getIdCde() {
		return idCde;
	}
	/**
	 * @return the idArt
	 */
	public int getIdArt() {
		return idArt;
	}
}
