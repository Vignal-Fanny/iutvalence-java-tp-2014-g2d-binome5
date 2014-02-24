package fr.iutvalence.java.tp.mastermind;

/**
 *  Représente une partie de MasterMind
 * @author vignalfa
 *
 */
public class MasterMind
{
	
	/**
	 * Le joueur principal (il doit décrypter le code)
	 */
	private Player player;
	
	/**
	 * Le maitre du jeu (il choisit le code)
	 */
	private Master master;

	/**
	 * Crée une partie de Mastermind prête à être jouée. Défini tous les éléments
	 *  nécessaires à la partie. 
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
		Code toBeGuessedCode = this.master.obtainCode();
	}

}
