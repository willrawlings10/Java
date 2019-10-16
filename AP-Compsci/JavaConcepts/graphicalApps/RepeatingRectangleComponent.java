package graphicalApps;

import java.awt.Color;		//color class 
import java.awt.Graphics;	//primitive graphics class 
import java.awt.Graphics2D; 	//Extends Graphics class
import java.awt.Rectangle;	//Rectangles class
import java.awt.geom.Ellipse2D;  //Ellipse and circle class
import java.awt.geom.Line2D; 	//Line class
import javax.swing.JPanel;
import javax.swing.JComponent;

public class RepeatingRectangleComponent extends JComponent
{
	//Place drawing instructions inside this method
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;  //Make graphics 2D

		drawGrid(g2);  //Draw grid to make it easier to create component
		
		int x=30;
		int y=130;
		Rectangle shape;
		g2.setColor(Color.RED);			//Color of mouth

		for (int i = 1; i<=5; i++)
		{
			shape = new Rectangle(x, y, 50, 30);
			g2.fill(shape);
			x+=75;
		}
	}

	public void drawGrid(Graphics2D g2)
	{
		// The following two for loops draw a grid on the screen to help you 
		// position your object.  Once you have finished your object, you can 
		// comment out the two for loops
		
		//Draw horizontal lines
		g2.setColor(Color.LIGHT_GRAY);									
		for (int i=50; i<=600; i=i+50)
		{
			g2.drawString(""+i, 5, i);
			Line2D.Double horizonalLine = new Line2D.Double(5, i, 700, i);	
			g2.draw(horizonalLine);
		}
		//Draw vertical lines
		for (int i=50; i<=600; i=i+50)
		{
			g2.drawString(""+i, i, 10);
			Line2D.Double horizonalLine = new Line2D.Double(i, 10, i, 700);	
			g2.draw(horizonalLine);
		}
		g2.setColor(Color.BLACK);									
		//**End of grid
	}
}
