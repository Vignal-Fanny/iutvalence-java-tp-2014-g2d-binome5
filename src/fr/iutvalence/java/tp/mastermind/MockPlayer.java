package fr.iutvalence.java.tp.mastermind;

/**
 * Implémentation de l'interface joueur, où le code proposé est généré aléatoirement
 * @author Woerly-Moussier Joachim, Vignal Fanny
 *
 */
public class MockPlayer implements Player
{
	/**
	 * blablabla
	 */
	private final Code codeToBeReturned;
	

	/**
	 * blabla
	 * @param codeToBeReturned blablabla
	 */
	public MockPlayer(Code codeToBeReturned)
	{
		this.codeToBeReturned = codeToBeReturned;
	}


	/**
	 * Retourne un code généré aléatoirement
	 * @see fr.iutvalence.java.tp.mastermind.Player#obtainCode()
	 */
	public Code obtainCode()
	{
		return this.codeToBeReturned;
	}
}
