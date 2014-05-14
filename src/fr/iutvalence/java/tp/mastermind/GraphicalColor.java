package fr.iutvalence.java.tp.mastermind;
import fr.iutvalence.java.tp.mastermind.Color;

public class GraphicalColor
{
	String stringColor;
	private java.awt.Color color;
  public GraphicalColor(Color pegColor)
  {
	  this.stringColor = pegColor.toString();
	  if (this.stringColor.equals("VIOLET"))
		  this.stringColor = "PURPLE";
	  this.color = java.awt.Color.decode(this.stringColor);
  }
  
 
}
