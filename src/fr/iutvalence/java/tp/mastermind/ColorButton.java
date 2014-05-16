package fr.iutvalence.java.tp.mastermind;

import java.awt.Graphics;
import java.awt.Graphics2D;
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
		if(this.index<Color.values().length)
			this.colorOfTheButton = Color.values()[this.index++];
		else this.index = 0;
		
	}
	
	public java.awt.Color colorConverter(Color pegColor)
		  {
			if(pegColor==Color.BLUE) return java.awt.Color.BLUE;
			if(pegColor==Color.RED) return java.awt.Color.RED;
			if(pegColor==Color.GREEN) return java.awt.Color.GREEN;
			if(pegColor==Color.YELLOW) return java.awt.Color.YELLOW;
			if(pegColor==Color.ORANGE) return java.awt.Color.ORANGE;
			if(pegColor==Color.PINK) return java.awt.Color.PINK;
			if(pegColor==Color.VIOLET) return new java.awt.Color(120,0,120);
			return java.awt.Color.WHITE;
			
		  }	
	
	public void paintComponent(Graphics g){
		Graphics2D g2d = (Graphics2D)g;
		g2d.setColor(this.colorConverter(this.colorOfTheButton));
		g2d.fillRect(0, 0, this.getWidth(), this.getHeight());
	}
}
