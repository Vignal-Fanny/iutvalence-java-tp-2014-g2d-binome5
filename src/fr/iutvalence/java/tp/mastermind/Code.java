package fr.iutvalence.java.tp.mastermind;

// TODO écrire un commentaire plus précis
/**
 * Représente un code.
 * 
 * @author Woerly-Moussier Joachim, Vignal Fanny
 * 
 */
public class Code
{
	/**
	 * constante définissant le nombre de pions dans un code.
	 */
	public final static int NUMBER_OF_PEGS_IN_THE_CODE = 4;

	/**
	 * Un code, c'est un tableau de pions.
	 */
	private Peg[] pegs;

	/**
	 * Constructeur de la classe Code, qui génère un code formé de 4 pions, de
	 * différentes (ou non) couleurs, choisis aléatoirement.
	 */
	public Code()
	{
		this.pegs = new Peg[NUMBER_OF_PEGS_IN_THE_CODE];

		for (int pegNumber = 0; pegNumber < NUMBER_OF_PEGS_IN_THE_CODE; pegNumber++)
			this.pegs[pegNumber] = new Peg(Color.getRandomColor());
	}

	@Override
	public String toString()
	{
		String result = "";
		for (int pegNumber = 0; pegNumber < NUMBER_OF_PEGS_IN_THE_CODE; pegNumber++)
			result = result + this.pegs[pegNumber].toString();

		return result;
	}

	public ResultOfCodeComparison compareWith(Code attemptToGuessTheCode)
	{
		int numberOfWellPlacedPegs = 0;
		int numberOfMisplacedPegs = 0;
		int i,j;
		i=0;
		j=0;
		
		while(i<this.NUMBER_OF_PEGS_IN_THE_CODE)
		{
			while(j<this.NUMBER_OF_PEGS_IN_THE_CODE)
			{
				if(this.pegs[i] == attemptToGuessTheCode.pegs[i])
					numberOfWellPlacedPegs++;
			}
		}
		
		return new ResultOfCodeComparison(numberOfWellPlacedPegs, numberOfMisplacedPegs);
	}

}
