package fr.iutvalence.java.tp.mastermind;

/**
 * Fait débuter la partie
 */
public class LanceurPartieAvecMaitreAleatoireEtJoueurConsole
{
	/**
	 * Fonction principale du jeu. C'est la base du jeu. 
	 * @param args (nécessaire dans la fonction main)
	 */
	public static void main(String[] args)
	{	
		MasterMind game = new MasterMind(new RandomPlayer(), new ConsolePlayer(), null);
		
		game.play();
	}

}
