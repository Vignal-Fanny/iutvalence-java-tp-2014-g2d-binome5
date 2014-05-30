package fr.iutvalence.java.tp.mastermind;

import java.awt.Color;

import javax.swing.BoxLayout;
import javax.swing.JPanel;
import fr.iutvalence.java.tp.mastermind.ResultOfCodeComparison;
import fr.iutvalence.java.tp.mastermind.CorrectingPeg;
public class ResultPanel extends JPanel
{
	private CorrectingPeg[] correctingPeg;
	
	public ResultPanel()
	{
		this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		this.setBackground(Color.GREEN);
		this.correctingPeg= new CorrectingPeg[5];
		for(int i=0;i<this.correctingPeg.length;i++)
		{
			this.correctingPeg[i] = new CorrectingPeg();
		}
		for(int i=0; i<this.correctingPeg.length;i++)
		{
			this.add(this.correctingPeg[i]);
		}
	}
	public void updateColorOfCorrectingPeg(ResultOfCodeComparison compResult){
		 int i=0;
		 for(int j=0;j<compResult.getNumberOfWellPlacedPegs();j++){
			 correctingPeg[i].updateColorInWhite();
		 }
		 i++;
		 for(int j=0;j<compResult.getNumberOfMisplacedPegs();j++)
		 {
			correctingPeg[i].updateColorInRED(); 
		 }
	 }
}
