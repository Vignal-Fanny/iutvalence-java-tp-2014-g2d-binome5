package fr.iutvalence.java.tp.mastermind;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JPanel;


public class Lines extends JPanel
{
	private ResultPanel resultPanel = new ResultPanel();
	private InputPanel inputPanel = new InputPanel();
	private JButton confirmButton = new JButton();
	
	public Lines()
	{
		this.setLayout(new BorderLayout());
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
