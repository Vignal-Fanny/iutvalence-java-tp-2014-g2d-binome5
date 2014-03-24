package fr.iutvalence.java.tp.mastermind;

/**
 * Classe test pour vérifier l'algorithme de comparaison des codes.
 * @author Sebastien Jean
 */
public class TestCodeComparison
{

	/**
	 * fonction test pour l'algorithme de comparaison des codes.
	 * @param args les arguments usuels de la fonction main.
	 */
	public static void main(String[] args)
	{
		Peg[] allBluePegs = new Peg[] {new Peg(Color.BLUE), new Peg(Color.BLUE), new Peg(Color.BLUE), new Peg(Color.BLUE)};
		Peg[] halfBlueHalfYellowPegs = new Peg[] {new Peg(Color.BLUE), new Peg(Color.YELLOW), new Peg(Color.BLUE), new Peg(Color.YELLOW)};
		Peg[] halfYellowHalfBluePegs = new Peg[] {new Peg(Color.YELLOW), new Peg(Color.BLUE), new Peg(Color.YELLOW), new Peg(Color.BLUE)};
		Peg[] allRedPegs = new Peg[] {new Peg(Color.RED), new Peg(Color.RED), new Peg(Color.RED), new Peg(Color.RED)};
		Peg[] singleBluePegs = new Peg[] {new Peg(Color.RED), new Peg(Color.GREEN), new Peg(Color.BLUE), new Peg(Color.PINK)};
		System.out.println("Expected 4/0");
		System.out.println(new Code(allBluePegs).compareWith(new Code(allBluePegs)));
		System.out.println("Expected 0/0");
		System.out.println(new Code(allBluePegs).compareWith(new Code(allRedPegs)));
		System.out.println("Expected 2/0");
		System.out.println(new Code(allBluePegs).compareWith(new Code(halfBlueHalfYellowPegs)));
		System.out.println("Expected 2/0");
		System.out.println(new Code(halfBlueHalfYellowPegs).compareWith(new Code(allBluePegs)));
		System.out.println("Expected 0/4");
		System.out.println(new Code(halfBlueHalfYellowPegs).compareWith(new Code(halfYellowHalfBluePegs)));
		System.out.println("Expected 0/4");
		System.out.println(new Code(halfYellowHalfBluePegs).compareWith(new Code(halfBlueHalfYellowPegs)));
		System.out.println("Expected 1/0");
		System.out.println(new Code(allBluePegs).compareWith(new Code(singleBluePegs)));
		System.out.println("Expected 1/0");
		System.out.println(new Code(singleBluePegs).compareWith(new Code(allBluePegs)));
		

	}

}
