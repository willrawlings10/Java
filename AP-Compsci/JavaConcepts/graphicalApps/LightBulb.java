package graphicalApps;

import java.awt.BasicStroke;
import java.awt.Color;		//color class 
import java.awt.Graphics;	//primitive graphics class 
import java.awt.Graphics2D; 	//Extends Graphics class
import java.awt.Polygon;
import java.awt.Rectangle;	//Rectangles class
import java.awt.geom.Ellipse2D;  //Ellipse and circle class
import java.awt.geom.Line2D; 	//Line class
import java.awt.geom.QuadCurve2D;

import javax.swing.JPanel;
import javax.swing.JComponent;

public class LightBulb extends JComponent {
	
	
		//Place drawing instructions inside this method
		public void paintComponent(Graphics g)
		{
			Graphics2D g2 = (Graphics2D) g;  //Make graphics 2D

			drawGrid(g2);  //Draw grid to make it easier to create component
			
			g2.setColor(Color.BLACK);
			Screw(g2);
			Light(g2);

}
		public void Screw(Graphics2D g2)
		{
			g2.setStroke(new BasicStroke(8));
			g2.setColor(Color.gray);
			QuadCurve2D firstLine = new QuadCurve2D.Double(36, 220, 22, 247, 36, 285);
			QuadCurve2D firstLine2 = new QuadCurve2D.Double(58, 202, 30, 247, 58, 300);
			QuadCurve2D firstLine3 = new QuadCurve2D.Double(73, 202, 47, 247, 73, 300);
			QuadCurve2D firstLine4 = new QuadCurve2D.Double(91, 202, 67, 247, 91, 300);
		    Ellipse2D.Double screw1 = new Ellipse2D.Double(100, 150, 140, 200);
		    Rectangle screw2 = new Rectangle(175, 150, 100, 200);
			g2.draw(firstLine);
			g2.draw(firstLine2);
			g2.draw(firstLine3);
			g2.draw(firstLine4);
			g2.draw(screw1);
			g2.fill(screw1);
			g2.draw(screw2);
			g2.fill(screw2);
			
			
}
		public void Light(Graphics2D g2)
		{
			g2.setColor(Color.yellow);
			Polygon light1 = new Polygon();
			light1.addPoint(395, 150);
			light1.addPoint(475, 120);
			light1.addPoint(530, 370);
			light1.addPoint(450, 395);
			g2.draw(light1);
			g2.fill(light1);
			 
			Ellipse2D.Double light2 = new Ellipse2D.Double(500, 90, 80, 80);
			 g2.draw(light2);
			 g2.fill(light2);
			 
			 Polygon light3 = new Polygon();
				light3.addPoint(530, 250);
				light3.addPoint(610, 230);
				light3.addPoint(640, 360);
				light3.addPoint(560, 380);
				g2.draw(light3);
				g2.fill(light3);
				
				Polygon light4 = new Polygon();
				light4.addPoint(630, 140);
				light4.addPoint(700, 120);
				light4.addPoint(760, 365);
				light4.addPoint(678, 380);
				g2.draw(light4);
				g2.fill(light4);
			
		}
		
		public void drawGrid(Graphics2D g2)
		{
			// The following two for loops draw a grid on the screen to help you 
			// position your object.  Once you have finished your object, you can 
			// comment out the two for loops
			
			//Draw horizontal lines
			g2.setColor(Color.LIGHT_GRAY);									
			for (int i=50; i<=1200; i=i+50)
			{
				g2.drawString(""+i, 5, i);
				Line2D.Double horizonalLine = new Line2D.Double(5, i, 700, i);	
				g2.draw(horizonalLine);
			}
			//Draw vertical lines
			for (int i=50; i<=1200; i=i+50)
			{
				g2.drawString(""+i, i, 10);
				Line2D.Double horizonalLine = new Line2D.Double(i, 10, i, 700);	
				g2.draw(horizonalLine);
			}
			g2.setColor(Color.BLACK);									
			//**End of grid
		}
	}

