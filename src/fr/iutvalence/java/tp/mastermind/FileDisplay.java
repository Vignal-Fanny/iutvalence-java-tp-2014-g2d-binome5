package fr.iutvalence.java.tp.mastermind;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

/**
 * Classe permettant l'affichage dans un fichier
 * @author vignalfa
 *
 */
public class FileDisplay implements Display
{
	/**
	 * 
	 */
	private PrintStream ps;

	/**
	 * @throws UnsupportedEncodingException problème d'encodage
	 * @throws FileNotFoundException problème si pas de fichier
	 * @see fr.iutvalence.java.tp.mastermind.Display#displayTurnInfo(fr.iutvalence.java.tp.mastermind.TurnInfo)
	 */
	
	public FileDisplay() throws FileNotFoundException, UnsupportedEncodingException
	{
		this.ps = new PrintStream("G:\\Documents\\testMastermind.txt", "UTF-8");
	}
	
	public void displayTurnInfo(TurnInfo turnInfo)
	{
		this.ps.println(turnInfo.getCode());
		this.ps.println(turnInfo.getCodeComparison());
	}

	/**
	 * dit qu'il y a un nouveau tour
	 * @param TurnNumber numéro du tour
	 */
	@Override
	public void notifyNewTurn(int TurnNumber)
	{
		this.ps.println("Turn "+TurnNumber+"/"+MasterMind.MAXIMUM_NUMBER_OF_TURNS);
		this.ps.println("Enter your proposition");
		
		
		
	}

	@Override
	public void notifyEndOfGame(GameStatus status, Code toBeGuessedCode)
	{
		if (status == GameStatus.LOST)
		{
			this.ps.println("Game status = YOU LOST THE GAME !! POOR LITTLE THING è_é The code was : "+toBeGuessedCode);
		}
		if (status == GameStatus.WON)
		{
			this.ps.println("Game status = 'Success ! You won ! Such a good boy <3 <or girl, yeah we didn't forget you>");
		}
		
	}
}