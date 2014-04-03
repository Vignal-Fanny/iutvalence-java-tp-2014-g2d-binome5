package fr.iutvalence.java.tp.mastermind;

/**
 * Afficheur console
 * @author vignalfa
 *
 */
public abstract class ConsoleDisplay implements Display
{
	/**
	 * @see fr.iutvalence.java.tp.mastermind.Display#displayTurnInfo(fr.iutvalence.java.tp.mastermind.TurnInfo)
	 */
	public void displayTurnInfo(TurnInfo turnInfo)
	{
		System.out.println(turnInfo.getCode());
		System.out.println(turnInfo.getCodeComparison());
	}

	@Override
	public void notifyNewTurn(int TurnNumber)
	{
		System.out.println(TurnNumber+"/"+MasterMind.MAXIMUM_NUMBER_OF_TURNS);
		
	}

	@Override
	public void notifyEndOfGame(GameStatus status, Code toBeGuessedCode)
	{
		if (status == GameStatus.LOST)
		{
			System.out.println("Game status = YOU LOST THE GAME !! POOR LITTLE THING è_é The code was : "+toBeGuessedCode);
		}
		if (status == GameStatus.WON)
		{
			System.out
					.println("Game status = 'Success ! You won ! Such a good boy <3 <or girl, yeah we didn't forget you>");
		}
		
	}
}
