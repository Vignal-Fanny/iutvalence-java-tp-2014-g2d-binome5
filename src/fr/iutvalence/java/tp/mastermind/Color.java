package fr.iutvalence.java.tp.mastermind;

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
	 * colorText donne une représentation texte aux couleurs.
	 */
	private String colorText;


	/**
	 * Constructeur qui permet de construire colorText à partir d'une lettre de couleur.
	 * @param colorText la lettre de la couleur.
	 */
	private Color(String colorText)
	{
		this.colorText = colorText;
	}


	/**
	 * Permet d'obtenir une couleur de manière aléatoire parmis les couleurs de l'énumération.
	 * @return la couleur récupérée aléatoirement
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
