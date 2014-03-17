package fr.iutvalence.java.tp.mastermind;

public class ResultOfCodeComparison
{
	private final int numberOfWellPlacedPegs;
	
	private final int numberOfMisplacedPegs;
	
	
	public ResultOfCodeComparison(int numberOfWellPlacedPegs, int numberOfMisplacedPegs)
	{
		this.numberOfWellPlacedPegs = numberOfWellPlacedPegs;
		this.numberOfMisplacedPegs = numberOfMisplacedPegs;
	}


	public boolean areSameCodes()
	{
		return (this.numberOfWellPlacedPegs == Code.NUMBER_OF_PEGS_IN_THE_CODE);
	}


	public int getNumberOfWellPlacedPegs()
	{
		return this.numberOfWellPlacedPegs;
	}


	public int getNumberOfMisplacedPegs()
	{
		return this.numberOfMisplacedPegs;
	}
	
	
}
