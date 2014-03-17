package fr.iutvalence.java.tp.mastermind;

/**
 * Il s'agit de la classe du joueur qui va devoir deviner le code du Master durant la partie. 
 * @author Woerly-Moussier Joachim, Vignal Fanny
 *
 */
public class Player
{
	/**
	 * méthode permettant de générer aléatoirement un code (temporaire, on passera à une méthode 
	 * permettant d'écrire soi même le code)
	 * @return le code généré
	 */
	public Code obtainCode()
	{
		return new Code();
	}
}
