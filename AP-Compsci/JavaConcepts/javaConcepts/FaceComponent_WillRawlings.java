package javaConcepts;

import java.awt.Color;		//color class 
import java.awt.Graphics;	//primitive graphics class 
import java.awt.Graphics2D; 	//Extends Graphics class
import java.awt.Rectangle;	//Rectangles class
import java.awt.geom.Ellipse2D;  //Ellipse and circle class
import java.awt.geom.Line2D; 	//Line class
import javax.swing.JPanel;
import javax.swing.JComponent;

public class FaceComponent_WillRawlings extends JComponent
{
	//Place drawing instructions inside this method
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;  //Make graphics 2D

		drawGrid(g2);  //Draw grid to make it easier to create component
		
		Ellipse2D.Double head = new Ellipse2D.Double(5, 10, 100, 150); //Construct oval head (x, y, width, height)
		g2.draw(head);             //Draw head
		Line2D.Double eye1 = new Line2D.Double(25, 70, 45, 90); 	//Construct left eye (x1, y1, x2, y2)
		g2.draw(eye1);
		Line2D.Double eye2 = new Line2D.Double(85, 70, 65, 90);	 //Construct right eye (x1, y1, x2, y2)
		g2.draw(eye2);
		Rectangle mouth = new Rectangle(30, 130, 50, 5);	 	//Construct mouth (x, y, width, height)
		g2.setColor(Color.RED);			//Color of mouth
		g2.fill(mouth);				//Fill mouth with red
		g2.setColor(Color.BLUE);			
		g2.drawString("Hello, Class!!!", 5, 175);		//Draw greeting (“message”, x, y)

	}

	public void drawGrid(Graphics2D g2)
	{
		// The following two for loops draw a grid on the screen to help you 
		// position your object.  Once you have finished your object, you can 
		// comment out the call to this method.
		
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
