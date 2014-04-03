package fr.iutvalence.java.tp.mastermind;

/**
 * Représente une partie de MasterMind
 * 
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
	private Player master;

	/**
	 * nombre maximum possible de tours pour une partie.
	 */
	public final static int MAXIMUM_NUMBER_OF_TURNS = 10;

	/**
	 * le code à deviner.
	 */
	private Code toBeGuessedCode;

	/**
	 * le nombre de tours.
	 */
	private int numberOfTurns;

	/**
	 * l'état du jeu.
	 */
	private GameStatus gameStatus;
	
	/**
	 * l'afficheur du jeu.
	 */
	private Display display;

	// TODO écrire un commentaire plus précis (comment est initailisée la partie
	// ?)
	/**
	 * Crée une partie de Mastermind prête à être jouée. Définit tous les
	 * éléments nécessaires à la partie.
	 */

	/**
	 * @param master le joueur entrant le code
	 * @param player le joueur devant trouver le code
	 * @param display l'afficheur du jeu
	 */
	public MasterMind(Player master, Player player, Display display)
	{
		this.master = master;
		this.player = player;
		this.toBeGuessedCode = null;
		this.numberOfTurns = 0;
		this.gameStatus = GameStatus.NOT_RUNNING;
		this.display = display;
				
	}

	/**
	 * un tour de jeu.
	 * 
	 */
	private void playTurnAndUpdateGameStatus()
	{
		if (this.numberOfTurns > MAXIMUM_NUMBER_OF_TURNS)
		{
			this.gameStatus = GameStatus.LOST;
			this.display.notifyEndOfGame(this.gameStatus, this.toBeGuessedCode);
			return;
		}

		Code attemptToGuessTheCode;
		while (true)
		{
			this.display.notifyNewTurn(this.numberOfTurns);
			attemptToGuessTheCode = this.player.obtainCode();
			if (attemptToGuessTheCode != null)
				break;
		}
		ResultOfCodeComparison codeComparison = this.toBeGuessedCode.compareWith(attemptToGuessTheCode);
		TurnInfo turnInfo = new TurnInfo(attemptToGuessTheCode, codeComparison);
		this.display.displayTurnInfo(turnInfo);
		if (codeComparison.areSameCodes())
			this.gameStatus = GameStatus.WON;
		this.numberOfTurns++;
	}

	/**
	 * méthode permettant de jouer en cherchant le code.
	 */
	public void play()
	{
		this.gameStatus = GameStatus.RUNNING;
		this.numberOfTurns = 1;
		this.toBeGuessedCode = this.master.obtainCode();
		
		while (this.gameStatus == GameStatus.RUNNING)
		{
			this.playTurnAndUpdateGameStatus();
		}

	
	}

}
