package fr.iutvalence.java.tp.mastermind;

/**
 * Implémentation de l'interface joueur, où le code proposé est généré aléatoirement
 * @author Woerly-Moussier Joachim, Vignal Fanny
 *
 */
public class MockPlayer implements Player
{
	private final Code codeToBeReturned;
	

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
