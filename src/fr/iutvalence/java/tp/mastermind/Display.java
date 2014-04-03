package fr.iutvalence.java.tp.mastermind;

/**
 * interface définissant les différents messages à afficher
 * @author vignalfa
 *
 */
public interface Display
{

	/**
	 * afficher les informations d'un tour
	 * @param turnInfo les informations d'un tour
	 */
	void displayTurnInfo(TurnInfo turnInfo);
	
	/**
	 * prévient le joueur d'un nouveau tour
	 * @param TurnNumber le nombre de tours actuel
	 */
	void notifyNewTurn(int TurnNumber);
	
	/**
	 * résume le résultat du jeu
	 * @param status le statut du jeu
	 * @param toBeGuessedCode le code à deviner
	 */
	void notifyEndOfGame(GameStatus status, Code toBeGuessedCode);

}
