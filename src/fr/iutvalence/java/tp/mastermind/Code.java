package fr.iutvalence.java.tp.mastermind;

/**
 * Représente un code.
 * 
 * @author Woerly-Moussier Joachim, Vignal Fanny
 * 
 */
/**
 * @author vignalfa
 *
 */
/**
 * @author vignalfa
 *
 */
public class Code
{
	/**
	 * constante définissant le nombre de pions dans un code.
	 */
	public final static int NUMBER_OF_PEGS_IN_THE_CODE = 5;

	/**
	 * Un code, c'est un tableau de pions.
	 */
	private Peg[] pegs;

	/**
	 * Constructeur de la classe Code, qui génère un code formé de 4 pions, de
	 * différentes (ou non) couleurs, choisis aléatoirement.
	 * @param pegs créer un code à partir d'un tableau de pions.
	 */
	public Code(Peg[] pegs)
	{
		this.pegs = pegs;
	}
	
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

	/**
	 * Pour générer un code.
	 * @return un code.
	 */
	public Code createCode()
	{
		
		Code theCode = new Code();
		return theCode;
	}
	
	@Override
	public String toString()
	{
		String result = "";
		for (int pegNumber = 0; pegNumber < NUMBER_OF_PEGS_IN_THE_CODE; pegNumber++)
			result = result + this.pegs[pegNumber].toString();

		return result;
	}

	/**
	 * comparaison de code
	 * @param attemptToGuessTheCode le code avec lequel on se compare
	 * @return un objet de type ResultOfCodeComparison
	 */
	public ResultOfCodeComparison compareWith(Code attemptToGuessTheCode)
	{
		boolean[] pegsToProcessInCurrentCode = new boolean[NUMBER_OF_PEGS_IN_THE_CODE];
		boolean[] pegsToProcessInAttempToGuessTheCode = new boolean[NUMBER_OF_PEGS_IN_THE_CODE];
		
		for (int pegNumber=0; pegNumber<NUMBER_OF_PEGS_IN_THE_CODE; pegNumber++)
		{
			pegsToProcessInCurrentCode[pegNumber] = true;
			pegsToProcessInAttempToGuessTheCode[pegNumber] = true;
		}
		
		int numberOfWellPlacedPegs = 0;
		int numberOfMisplacedPegs = 0;
		
		// search for well placed pegs
		for (int pegNumber=0; pegNumber<NUMBER_OF_PEGS_IN_THE_CODE; pegNumber++)
		{
			if (this.pegs[pegNumber].getColor() == attemptToGuessTheCode.pegs[pegNumber].getColor())
			{
				numberOfWellPlacedPegs++;
				pegsToProcessInCurrentCode[pegNumber] = false;
				pegsToProcessInAttempToGuessTheCode[pegNumber] = false;
			}
		}
		
		// search for misplaced pegs
		for (int pegNumberInCurrentCode=0; pegNumberInCurrentCode<NUMBER_OF_PEGS_IN_THE_CODE; pegNumberInCurrentCode++)
		{
			if (!pegsToProcessInCurrentCode[pegNumberInCurrentCode]) continue;
			
			for (int pegNumberInAttemptToGuessCode=0; pegNumberInAttemptToGuessCode<NUMBER_OF_PEGS_IN_THE_CODE; pegNumberInAttemptToGuessCode++)
			{
				if (!pegsToProcessInAttempToGuessTheCode[pegNumberInAttemptToGuessCode]) continue;
				if (this.pegs[pegNumberInCurrentCode].getColor() == attemptToGuessTheCode.pegs[pegNumberInAttemptToGuessCode].getColor())
				{
					numberOfMisplacedPegs++;
					pegsToProcessInCurrentCode[pegNumberInCurrentCode] = false;
					pegsToProcessInAttempToGuessTheCode[pegNumberInAttemptToGuessCode] = false;
					break;
				}
			}
		}
				
		return new ResultOfCodeComparison(numberOfWellPlacedPegs, numberOfMisplacedPegs);
	}

	/**
	 * Fonction retournant un code à partir d'une ligne de texte
	 * @param textLine la ligne de texte entrée en paramètre à transformer en code
	 * @return Un code 
	 */
	public static Code parseCode(String textLine)
	{
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
