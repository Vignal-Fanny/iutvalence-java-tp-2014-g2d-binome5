package fr.iutvalence.java.tp.mastermind;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

/**
 * Barre de menu pour le Mastermind
 * 
 * @author vignal fanny joachim woerly-moussier
 * 
 */
@SuppressWarnings("serial")
public class Menu extends JMenuBar implements ActionListener
{
	/**
	 * une fenetre permettant d'ouvrir le menu
	 */
	private JFrame menuWindow;

	/**
	 * L'item de rubrique "Concerning MasterMind"
	 */
	private JMenuItem MenuItemConcerningMasterMind;

	/**
	 * L'item de rubrique "Close"
	 */
	private JMenuItem HowToPlay;

	/**
	 * Creation de la barre de menu
	 * 
	 * @param menuWindow
	 * une fenetre permettant d'ouvrir le menu
	 */
	public Menu(JFrame menuWindow)
	{
		this.menuWindow = menuWindow;
		JMenu menu = new JMenu("Menu");
		this.MenuItemConcerningMasterMind = new JMenuItem("Concerning MasterMind ?");
		this.HowToPlay = new JMenuItem("How to play ?");
		menu.add(this.MenuItemConcerningMasterMind);
		menu.add(this.HowToPlay);
		this.MenuItemConcerningMasterMind.addActionListener(this);
		this.HowToPlay.addActionListener(this);
		this.add(menu);
	}

	/**
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent event)
	{
		JMenuItem selectedItem = (JMenuItem) event.getSource();

		if (selectedItem == this.MenuItemConcerningMasterMind)
		{
			JOptionPane.showMessageDialog(this.menuWindow, "This is a MasterMind game created by Vignal Fanny et Woerly Moussier Joachim from IUT Valence. \n It is our Java project.", "Concerning MasterMind ?", JOptionPane.INFORMATION_MESSAGE);
			return;
		}

		if (selectedItem == this.HowToPlay)
		{
			JOptionPane.showMessageDialog(this.menuWindow, "You must find the entire hidden code \n by choising colors thanks to the colored buttons. \n You've only got 15 turns ! Try your best !", "How to play ?", JOptionPane.INFORMATION_MESSAGE);
			return;
		}
	}
}
