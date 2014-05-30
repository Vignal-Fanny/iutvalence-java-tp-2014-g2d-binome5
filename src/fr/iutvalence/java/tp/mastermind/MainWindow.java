package fr.iutvalence.java.tp.mastermind;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import javax.swing.JPanel;


/**
 * @author Woerly Moussier Joachim, Vignal Fanny
 * Classe MainWindow qui permet de créer une nouvelle fenêtre d'application. 
 */
public class MainWindow extends JFrame
{
	private ColorButton button; 
	
	private Lines[] windowsLines;
	
	private JPanel mainPanel= new JPanel();
	
	/**
	 * Construit une nouvelle fenêtre
	 */
	public MainWindow()
	{
		this.setTitle("Window with a button");
		this.setSize(500, 400);
		
		this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		this.mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.PAGE_AXIS));
		this.add(this.mainPanel);
		
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
