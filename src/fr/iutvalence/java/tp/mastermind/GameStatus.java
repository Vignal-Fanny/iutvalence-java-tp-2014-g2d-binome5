package fr.iutvalence.java.tp.mastermind;

/**
 * énumération des différents états du jeu.
 * @author Vignal Fanny & Woerly-Moussier Joachim
 *
 */
public enum GameStatus
{
	/**
	 * le jeu n'est pas en cours.
	 */
	NOT_RUNNING, 
	/**
	 * Le jeu est en cours.
	 */
	RUNNING, 
	/**
	 * La partie a été gagnée.
	 */
	WON, 
	/**
	 * La partie a été perdue. 
	 */
	LOST;
}
