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
	 * Un code, c'est un tableau de pions.
	 */
	public Pawn[] code;
	/**
	 * Constructeur de la classe Code, qui génère un code formé de 4 pions, de
	 * différentes (ou non) couleurs, choisis aléatoirement.  
	 */
	public Code()
	{
		this.code = new Pawn[4];
		Random randomNumberGenerator = new Random();
		for ( int i = 0; i <= 3; i++)
		{
			this.code[i] = new Pawn(randomNumberGenerator.nextInt() % 9);
		}
		

	}
	
}

