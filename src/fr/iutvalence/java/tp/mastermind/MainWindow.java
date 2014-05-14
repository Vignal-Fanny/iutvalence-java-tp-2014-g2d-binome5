package fr.iutvalence.java.tp.mastermind;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 * @author Woerly Moussier Joachim, Vignal Fanny
 * Classe MainWindow qui permet de créer une nouvelle fenêtre d'application. 
 */
public class MainWindow
{
	
	private JButton button; 
	/**
	 * La fenêtre de l'application
	 */
	private JFrame window;

	/**
	 * Construit une nouvelle fenêtre
	 */
	public MainWindow()
	{
	this.window = new JFrame();
	this.window.setTitle("Window with a button");
	this.window.setSize(500, 400);
	this.window.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	this.button =  new ColorButton();
	this.window.getContentPane().add(button);
	this.window.setVisible(true);
	
	}
	
	/**
	 * Fonction qui permet d'obtenir une fenêtre
	 * @return une fenêtre
	 */
	public JFrame getWindow()
	{
		return this.window;
	}
	
}
