package fr.iutvalence.java.tp.mastermind;

import java.awt.Color;

import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import java.awt.Color;
/**
 * Conteneur contenant des boutons de choix pour le code à deviner
 * @author Naffy
 *
 */
public class InputPanel extends JPanel
{
	/**
	 * Un tableau de color buttons 
	 */
	private ColorButton[] colorButtons;
	/**
	 * Construit un Input panel
	 */
	public InputPanel()
	{
		this.setLayout(new BoxLayout(this, BoxLayout.LINE_AXIS));
		this.setBackground(Color.CYAN);
		this.colorButtons = new ColorButton[Code.NUMBER_OF_PEGS_IN_THE_CODE];
		
		
		for(int i=0;i<Code.NUMBER_OF_PEGS_IN_THE_CODE;i++)
		{
			this.colorButtons[i] = new ColorButton();
			this.add(this.colorButtons[i]);
			this.colorButtons[i].addActionListener(this.colorButtons[i]);
			
		}
				
	}
}
