package jeu;
/**
 * 
 */

import jeu.Grille;

/**
 * @author zineb lahlaoi
 *
 */
public class Joueur {
	
	/**
	 * attribut nom qui contient le nom du joueur
	 */
	private String nom;
	
	
    public Grille newGrille;
    

	
	/**
	 * Constructeur de Joueur appelle le constructeur de Grille
	 *  pour créer une nouvelle instance propre à chaque joueur. 
	 *  
	 * @param nom
	 */
	public Joueur(String nom) {
		super();
		this.newGrille=new Grille();
		this.nom = nom;
		
		
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
	 * @return the newGrille
	 */
	public Grille getGrille() {
		return newGrille;
	}


	/**
	 * @param newGrille the newGrille to set
	 */
	public void setGrille(Grille newGrille) {
		this.newGrille = newGrille;
	}
	
	
	
	

}
