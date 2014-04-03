package fr.iutvalence.java.tp.mastermind;

/**
 * Implémentation de l'interface joueur, où le code proposé est généré aléatoirement
 * @author Woerly-Moussier Joachim, Vignal Fanny
 *
 */
public class RandomPlayer implements Player
{
	
	/**
	 * Retourne un code généré aléatoirement
	 * @see fr.iutvalence.java.tp.mastermind.Player#obtainCode()
	 */
	public Code obtainCode()
	{
		return new Code();
	}
}
