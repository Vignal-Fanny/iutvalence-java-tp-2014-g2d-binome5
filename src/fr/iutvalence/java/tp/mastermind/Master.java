package fr.iutvalence.java.tp.mastermind;

/**
 * Il s'agit de la classe Master, celle du joueur qui va décider du code à deviner en 
 * début de partie. Le code est pour le moment généré aléatoirement.
 *  
 * @author Woerly-Moussier Joachim, Vignal Fanny
 *
 */
public class Master
{
	// TODO écrire un commentaire plus précis (en fonction de l'implémentation actuelle)
	/**
	 * génération du code
	 * @return le code généré
	 */
	public Code obtainCode()
	{
		return new Code();
	}
}
