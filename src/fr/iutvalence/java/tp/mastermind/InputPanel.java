package fr.iutvalence.java.tp.mastermind;

import java.awt.Color;

import javax.swing.BoxLayout;
import javax.swing.JPanel;
import java.awt.Color;

public class InputPanel extends JPanel
{
	
	private ColorButton[] colorButtons;
	
	public InputPanel()
	{
		this.setLayout(new BoxLayout(this, BoxLayout.LINE_AXIS));
		this.setBackground(Color.CYAN);
		
		this.colorButtons = new ColorButton[5];
		for(int i=0;i<this.colorButtons.length;i++)
		{
			this.colorButtons[i] = new ColorButton();
			this.colorButtons[i].addActionListener(this.colorButtons[i]);
		}
		for(int i=0; i<this.colorButtons.length;i++)
		{
			this.add(this.colorButtons[i]);
		}
		
	}
}
