package fr.iutvalence.java.tp.mastermind;

/**
 *  Représente une partie de MasterMind
 * @author vignalfa
 *
 */
public class MasterMind
{
	
	/**
	 * le joueur principal (il doit décrypter le code)
	 */
	private Player player;
	/**
	 * le maitre du jeu (il choisit le code)
	 */
	private Master master;

	/**
	 * crée une partie de Mastermind prête à être jouée.
	 */
	public MasterMind()
	{
		this.master = new Master();
		this.player = new Player();
	}
	
	/**
	 * méthode permettant de jouer
	 */
	public void play()
	{
		master.placerPions();
		
	}
	
			
	
}
