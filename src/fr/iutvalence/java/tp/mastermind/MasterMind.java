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
	private Master master;

	/**
	 * nombre maximum possible de tours pour une partie.
	 */
	public final static int MAXIMUM_NUMBER_OF_TURNS = 10;

	private Code toBeGuessedCode;

	private int numberOfTurns;

	private GameStatus gameStatus;

	// TODO écrire un commentaire plus précis (comment est initailisée la partie
	// ?)
	/**
	 * Crée une partie de Mastermind prête à être jouée. Définit tous les
	 * éléments nécessaires à la partie.
	 */

	public MasterMind()
	{
		this.master = new Master();
		this.player = new Player();
		this.toBeGuessedCode = null;
		this.numberOfTurns = 0;
		this.gameStatus = GameStatus.NOT_RUNNING;
	}

	/**
	 * un tour de jeu.
	 * 
	 * @return état du jeu à la fin du tour.
	 */
	private void playTurnAndUpdateGameStatus()
	{
		if (this.numberOfTurns > MAXIMUM_NUMBER_OF_TURNS)
		{
			this.gameStatus = GameStatus.LOST;
			return;
		}
		
		Code attemptToGuessTheCode = this.player.obtainCode();
		System.out.println(attemptToGuessTheCode);

		ResultOfCodeComparison codeComparison = this.toBeGuessedCode.compareWith(attemptToGuessTheCode);
		
		if (codeComparison.areSameCodes())
			this.gameStatus = GameStatus.WON;
		
		// comparison.getWellPlaced();
		//  comparison.getMisplaced();
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
		System.out.println(toBeGuessedCode);

		while (this.gameStatus == GameStatus.RUNNING)
		{
			this.playTurnAndUpdateGameStatus();
		}

		// faire quelque chose à la fin de la partie

		if (gameStatus == GameStatus.LOST)
		{
			System.out.println("Game status = YOU LOST THE GAME !! POOR LITTLE THING è_é ");
		}
		if (gameStatus == GameStatus.WON)
		{
			System.out
					.println("Game status = 'Success ! You won ! Such a good boy <3 <or girl, yeah we didn't forget you>");
		}
	}

}
