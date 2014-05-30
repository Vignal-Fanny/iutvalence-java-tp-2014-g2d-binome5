package fr.iutvalence.java.tp.mastermind;

import javax.swing.JButton;
import java.awt.Color;

/**
 * Classe de pions de corrections qui sont des JButton
 * @author Naffy
 *
 */
public class CorrectingPeg extends JButton
{
	/**
	 * Un pion de correction de couleur
	 */
	 private Color colorOfCorrectingPeg;
	 /**
	  * Construit un pion de correction de couleur noir par défaut
	  */
	 public CorrectingPeg(){
		 this.colorOfCorrectingPeg= Color.BLACK;
		 this.setBackground(Color.BLACK);
		 this.setEnabled(false);
		 
	 }
	 
	 /**
	  * attribut une coleur blanche aux pour les pions bien placés
	  */
	 public void updateColorInWhite(){
		 this.colorOfCorrectingPeg=Color.WHITE;
		 this.setBackground(Color.WHITE);
	 }
	 /**
	  * attribut une coleur rouge aux pour les pions bien placés
	  */
	 public void updateColorInRED(){
		 this.colorOfCorrectingPeg=Color.RED;
		 this.setBackground(Color.RED);
	 }
	 
}
