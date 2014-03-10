package fr.iutvalence.java.tp.mastermind;

/**
 * Définit un objet Pion à partir d'une couleur. 
 * @author Woerly-Moussier Joachim, Vignal Fanny
 *
 */
public class Peg
{
	private final Color color;
	
	/**
	 * construit un pion à partir d'un numéro qui définit la couleur du pion.
	 * @param initialColor la couleur du pion définie via l'énumération Color.
	 */
	
	public Peg(Color initialColor)
	{
		this.color = initialColor;
	}

	@Override
	public String toString()
	{
		return this.color.toString();
	}
	
	

}


