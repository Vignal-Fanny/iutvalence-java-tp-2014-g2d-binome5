package fr.iutvalence.java.tp.mastermind;

/**
 * Fait débuter la partie
 */
public class LanceurPartieAvecMaitreDeterministeEtJoueurConsole
{
	/**
	 * Fonction principale du jeu. C'est la base du jeu. 
	 * @param args (nécessaire dans la fonction main)
	 */
	public static void main(String[] args)
	{	
		MasterMind game = new MasterMind(new MockPlayer(Code.parseCode("ROPO")), new ConsolePlayer(), new ConsoleDisplay());
		game.play();
	}

}
