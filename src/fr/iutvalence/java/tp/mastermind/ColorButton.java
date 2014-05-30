package fr.iutvalence.java.tp.mastermind;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.SwingConstants;

import fr.iutvalence.java.tp.mastermind.Color;

/**
 * @author vignalfa
 *Class qui permet de créer un bouton coloré
 */
public class ColorButton extends JButton implements ActionListener
{
	/**
	 * Attribut couleur d'un bouton
	 */
	private Color colorOfTheButton;
	/**
	 * variable qui permet de se placer dans un tableau de couleur
	 */
	private int index =0;


	/**
	 * Construit un bouton avec une couleur
	 */
	public ColorButton()
	{
		this.colorOfTheButton= Color.values()[this.index];
	}
	
	/**
	 * méthode qui permet de changer de couleur de bouton au clic
	 */
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
	
	/**
	 * Permet de convertir les couleurs de notre classe color en couleurs java.awt.Color
	 * @param pegColor un pion de couleur
	 * @return une couleur
	 */
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
	/**
	 * Méthode qui permet de colorer le bouton
	 */
	
	public void paintComponent(Graphics g){
		Graphics2D g2d = (Graphics2D)g;
		g2d.setColor(this.colorConverter(this.colorOfTheButton));
		g2d.fillRect(0, 0, this.getWidth(), this.getHeight()); //Si on veut un bouton rectangulaire
		//g.fillOval(20, 20, 75, 75); plus tard nous mettrons la partie colorée du bouton dans un oval le reste du bouton n'apparaîtra pas. Nous devons changer les dimensions de l'oval 
	}
}
