package fr.iutvalence.java.tp.mastermind;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import fr.iutvalence.java.tp.mastermind.Color;

public class ColorButton extends JButton implements ActionListener
{
	private Color colorOfTheButton;
	private int index =0;


	public ColorButton()
	{
		this.colorOfTheButton= Color.values()[this.index];
	}
	
	public void onClick()
	{
		this.index ++;
		this.colorOfTheButton = Color.values()[this.index];
	}

	@Override
	public void actionPerformed(ActionEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}
	
	public java.awt.Color colorConverter(Color pegColor)
		  {
			  String stringColor = pegColor.toString();
			  if (stringColor.equals("VIOLET"))
				  stringColor = "PURPLE";
			  java.awt.Color color = java.awt.Color.decode(stringColor);
			return color;
			
		  }
	

}
