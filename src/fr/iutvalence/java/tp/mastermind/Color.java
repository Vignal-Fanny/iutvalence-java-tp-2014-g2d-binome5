package fr.iutvalence.java.tp.mastermind;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author Vignal Fanny and Woerly-Moussier Joachim énumération des couleurs des
 *         pions jouables
 */

public enum Color
{
	/**
	 * la couleur bleue
	 */
	BLUE("B"),
	/**
	 * la couleur rouge
	 */
	RED("R"),
	/**
	 * la couleur verte
	 */
	GREEN("G"),
	/**
	 * la couleur jaune
	 */
	YELLOW("Y"),
	/**
	 * la couleur orange
	 */
	ORANGE("O"),
	/**
	 * la couleur rose
	 */
	PINK("P"),
	/**
	 * la couleur violette
	 */
	VIOLET("V");

	/**
	 * colorText va nous permettre de donner à nos couleurs une représentation texte qui s'affichera
	 */
	private String colorText;

	/**
	 * @param colorText Constructeur qui permet de contruire colorText
	 */
	private Color(String colorText)
	{
		this.colorText = colorText;
	}

	/**
	 * @return Permet d'obtenir une couleur de manière aléatoire parmis les couleurs de l'énumération.
	 */
	public static Color getRandomColor()
	{
		int random = new Random().nextInt(Color.values().length);
		return (Color.values()[random]);
	}

	@Override
	public String toString()
	{
		return this.colorText;
	}
	
	
}
