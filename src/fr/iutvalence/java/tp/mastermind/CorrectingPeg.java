package fr.iutvalence.java.tp.mastermind;

import javax.swing.JButton;
import java.awt.Color;


public class CorrectingPeg extends JButton
{
	 private Color colorOfCorrectingPeg;
	 public CorrectingPeg(){
		 this.colorOfCorrectingPeg= Color.BLACK;
		 this.setBackground(Color.BLACK);
		 this.setEnabled(false);
		 
	 }
	 public void updateColorInWhite(){
		 this.colorOfCorrectingPeg=Color.WHITE;
		 this.setBackground(Color.WHITE);
	 }
	 public void updateColorInRED(){
		 this.colorOfCorrectingPeg=Color.RED;
		 this.setBackground(Color.RED);
	 }
	 
}
