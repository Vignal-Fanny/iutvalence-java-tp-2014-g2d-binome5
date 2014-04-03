package fr.iutvalence.java.tp.mastermind;

/**
 * Interface définissant le comportement attendu d'un joueur
 * @author Woerly-Moussier Joachim, Vignal Fanny
 *
 */
public interface Player
{
	/**
	 * Obtenir le code proposé par le joueur
	 * @return  le code proposé par le joueur
	 */
	public Code obtainCode();
}
