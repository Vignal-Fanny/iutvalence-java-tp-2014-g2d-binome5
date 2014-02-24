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
		int colorOne = randomNumberGenerator.nextInt() % 9;
		int colorTwo = randomNumberGenerator.nextInt() % 9;
		int colorThree = randomNumberGenerator.nextInt() % 9;
		int colorFour = randomNumberGenerator.nextInt() % 9;
		this.code[0] = new Pawn(colorOne);
		this.code[1] = new Pawn(colorTwo);
		this.code[2] = new Pawn(colorThree);
		this.code[3] = new Pawn(colorFour);
	}
}

