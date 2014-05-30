package fr.iutvalence.java.tp.mastermind;

import java.awt.BorderLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;

/**
 * Creer un conteneur lignes qui contient lui même d'autre conteneur
 * @author Naffy
 *
 */
public class Lines extends JPanel
{
	/**
	 * Un contenur où seront placé les pions résultats
	 */
	private ResultPanel resultPanel = new ResultPanel();
	/**
	 * Un conteneur où l'on choisira les couleurs des pions
	 */
	private InputPanel inputPanel = new InputPanel();
	/**
	 * Un bouton de confirmation
	 */
	private JButton confirmButton = new JButton();
	
	/**
	 * Conctruit une Ligne
	 */
	public Lines()
	{	
		this.setLayout(new BorderLayout());
		this.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
		this.add(resultPanel,BorderLayout.WEST);
		this.add(inputPanel,BorderLayout.CENTER);
		this.add(confirmButton,BorderLayout.EAST);
		
	}

	public ResultPanel getResultPanel()
	{
		return resultPanel;
	}

	public InputPanel getInputPanel()
	{
		return inputPanel;
	}

	public JButton getConfirmButton()
	{
		return confirmButton;
	}
	
	
}
