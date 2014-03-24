package fr.iutvalence.java.tp.mastermind;

/**
 * @author Vignal Fanny & Woerly-Moussier Joachim
 * Les résultats des comparaisons de code sont sous cette forme.
 */
public class ResultOfCodeComparison
{
	/**
	 * le nombre de pions bien placés.
	 */
	private final int numberOfWellPlacedPegs;
	
	/**
	 * le nombre de pions justes mais mal placés.
	 */
	private final int numberOfMisplacedPegs;
	
	
	/**
	 * constructeur prenant en paramètre le nombre de pions bien placés et le nombre de pions mal placés.
	 * @param numberOfWellPlacedPegs le nombre de pions bien placés.
	 * @param numberOfMisplacedPegs le nombre de pions mal placés.
	 */
	public ResultOfCodeComparison(int numberOfWellPlacedPegs, int numberOfMisplacedPegs)
	{
		this.numberOfWellPlacedPegs = numberOfWellPlacedPegs;
		this.numberOfMisplacedPegs = numberOfMisplacedPegs;
	}


	/**
	 * Détermine si les codes sont identiques.
	 * @return la réponse à la question "ces codes sont ils identiques ?"
	 */
	public boolean areSameCodes()
	{
		return (this.numberOfWellPlacedPegs == Code.NUMBER_OF_PEGS_IN_THE_CODE);
	}


	/**
	 * accesseur au nombre de pions bien placés.
	 * @return le nombre de pions bien placés.
	 */
	public int getNumberOfWellPlacedPegs()
	{
		return this.numberOfWellPlacedPegs;
	}


	/**
	 * accesseur au nombre de pions mal placés.
	 * @return le nombre de pions mal placés.
	 */
	public int getNumberOfMisplacedPegs()
	{
		return this.numberOfMisplacedPegs;
	}


	@Override
	public String toString()
	{
		return "ResultOfCodeComparison [numberOfWellPlacedPegs=" + this.numberOfWellPlacedPegs + ", numberOfMisplacedPegs="
				+ this.numberOfMisplacedPegs + "]";
	}
	
}
