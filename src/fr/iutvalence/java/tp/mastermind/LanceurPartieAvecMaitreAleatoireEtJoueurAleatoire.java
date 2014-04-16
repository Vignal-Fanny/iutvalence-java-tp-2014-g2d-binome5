package fr.iutvalence.java.tp.mastermind;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

/**
 * Fait débuter la partie
 */
public class LanceurPartieAvecMaitreAleatoireEtJoueurAleatoire
{
	/**
	 * Fonction principale du jeu. C'est la base du jeu. 
	 * @param args (nécessaire dans la fonction main)
	 * @throws UnsupportedEncodingException blabla
	 * @throws FileNotFoundException blabla
	 */
	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException
	{	
		MasterMind game = new MasterMind(new RandomPlayer(), new RandomPlayer(), new FileDisplay());
		
		game.play();
	}

}
