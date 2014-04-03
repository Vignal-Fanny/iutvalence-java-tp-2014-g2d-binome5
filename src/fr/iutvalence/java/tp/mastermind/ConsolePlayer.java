/**
 * 
 */
package fr.iutvalence.java.tp.mastermind;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author vignalfa
 *
 */
public class ConsolePlayer implements Player
{
	
	/**
	 * création d'un lecteur pour récupérer les données entrées par le joueur
	 */
	private BufferedReader consoleReader;
	
	/**
	 * crée un joueur console
	 */
	public ConsolePlayer()
	{
		this.consoleReader = new BufferedReader(new InputStreamReader(System.in));
	}
	
	@Override
	public Code obtainCode()
	{
		String textLine = null;
		try
		{
			textLine = this.consoleReader.readLine();
			if (textLine == null) return null;
			if (textLine.length() != Code.NUMBER_OF_PEGS_IN_THE_CODE) return null;
		}
		catch (IOException e)
		{
			return null;
		}
		Peg[] pegs = new Peg[Code.NUMBER_OF_PEGS_IN_THE_CODE];
		
		for (int charNumber=0;charNumber<textLine.length(); charNumber++)
		{
			Color color = Color.parseColor(textLine.charAt(charNumber));
			if (color == null) return null;
			pegs[charNumber] = new Peg(color);
		}
		return new Code(pegs);
	}

}
