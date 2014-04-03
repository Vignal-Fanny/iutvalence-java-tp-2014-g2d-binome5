package fr.iutvalence.java.tp.mastermind;

/**
 * Fait débuter la partie
 */
public class LanceurPartieAvecMaitreAleatoireEtJoueurAleatoire
{
	/**
	 * Fonction principale du jeu. C'est la base du jeu. 
	 * @param args (nécessaire dans la fonction main)
	 */
	public static void main(String[] args)
	{	
		MasterMind game = new MasterMind(new RandomPlayer(), new RandomPlayer(), null);
		
		game.play();
	}

}
