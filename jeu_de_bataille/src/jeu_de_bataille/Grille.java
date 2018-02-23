package jeu;

import jeu.Case;

/**
 * @author zineb lahlaoi
 *
 */
public class Grille {
	/**
	 * attribut de type tableau de cases
	 */
	
	public  Case[][] tableauCase=new Case[10][10];
	
	
     
	/**
	 * constructeur Grille qui fait appel au constructeur de case 
	 * et intialise les 100 case a false tant que les
	 *  tires ne sont pas encors effectu2
	 * @param tableauCase
	 */
	
	

	
	public Grille() {
		// TODO Auto-generated constructor stub
		super();
		int i,j;
		for(i=0;i<10;i++)
		{
			for(j=0;j<10;j++)
			{
				this.tableauCase[i][j]=new Case(false);
				
			  	
			}
		}
	}


	/**
	 * fonction qui met la case [x][y] a l etat true au cas de tire
	 * 
	 * @param x
	 * @param y
	 */
	
	public void tir(int x,int y)
	{
		this.tableauCase[x][y].setEtat(true);
	}
	
	
	/**
	 * La méthode afficheTirs() affiche dans le terminal le caractère
	 *  o pour toute case ayant fait l'objet d'un tir et un espace pour
	 *   les autres cases.

	 */
    public void afficheTirs()
    {
    	
 
    	
    	//remplir les tirs par 'o'
    int i,j;
    
    for(i=0;i<10;i++)
	{
		for(j=0;j<10;j++)
		{
			if(this.tableauCase[i][j].isEtat()==true) 
			{
				System.out.print("o");
				
			}else {
				System.out.print(" ");
			}	
		
		}
		System.out.println();
	}
    
  
    
   
    
    }
	
	
	

}