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

	// TODO écrire un commentaire plus précis
	/**
	 * Crée une partie de Mastermind prête à être jouée.
	 */
	public MasterMind()
	{
		this.master = new Master();
		this.player = new Player();
	}
	
	/**
	 * méthode permettant de jouer
	 */
	public void jouer()
	{
		master.placerPions();
	}

}
