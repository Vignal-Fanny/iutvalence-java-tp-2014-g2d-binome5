package fr.iutvalence.java.tp.mastermind;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import javax.swing.JPanel;



/**
 * @author Woerly Moussier Joachim, Vignal Fanny
 * Classe MainWindow qui permet de cr�er une nouvelle fen�tre d'application. 
 */
public class MainWindow extends JFrame
{
	private ColorButton button; 
	private JFrame menuWindow;
	
	private Lines[] windowsLines;
	
	private JPanel mainPanel= new JPanel();
	
	/**
	 * Construit une nouvelle fen�tre
	 */
	public MainWindow()
	{
		this.setTitle("Window with a button");
		this.setSize(1000, 800);
		this.setJMenuBar(new Menu(this.menuWindow));
		this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		this.mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.PAGE_AXIS));
		this.add(this.mainPanel);
		JFrame fenetreJComboBox = new JFrame("Une liste de choix");
		fenetreJComboBox.setSize(300, 100);
		JComboBox jComboBox = new JComboBox(new String[] { "facile", "moyen", "difficile" });
		fenetreJComboBox.getContentPane().add(jComboBox);
		fenetreJComboBox.setVisible(true);
		this.windowsLines = new Lines[15];
		for(int i=0;i<this.windowsLines.length;i++)
		{
			this.windowsLines[i] = new Lines();
		}
				
		for(int i=0;i<this.windowsLines.length;i++){
			this.mainPanel.add(this.windowsLines[i]);
		}
		
		this.setVisible(true);
	}
	

}
