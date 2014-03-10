package fr.iutvalence.java.tp.mastermind;
import java.util.Random;
/**
 * Représente un code. 
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
	public Pegs[] code;
	
	/**
	 * Constructeur de la classe Code, qui génère un code formé de 4 pions, de
	 * différentes (ou non) couleurs, choisis aléatoirement.  
	 */
	public Code()
	{
		this.code = new Pegs[NUMBER_OF_PEGS_IN_THE_CODE];
		Random randomNumberGenerator = new Random();
		for ( int i = 0; i <= 3; i++)
		{
			this.code[i] = new Pegs(randomNumberGenerator.nextInt() % 9);
		}
		

	}
	
}

