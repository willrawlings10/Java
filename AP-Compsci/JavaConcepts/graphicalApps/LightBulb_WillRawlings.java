package graphicalApps;

import java.awt.BasicStroke;
import java.awt.Color;		
import java.awt.Graphics;	
import java.awt.Graphics2D; 	
import java.awt.Polygon;
import java.awt.Rectangle;	
import java.awt.geom.Ellipse2D; 
import java.awt.geom.Line2D; 	
import java.awt.geom.QuadCurve2D;

import javax.swing.JPanel;
import javax.swing.JComponent;

public class LightBulb_WillRawlings extends JComponent {
	
	
		
		public void paintComponent(Graphics g)
		{
			Graphics2D g2 = (Graphics2D) g;  

			// drawGrid(g2);  
			
			g2.setColor(Color.BLACK);
			Screw(g2);
			Light(g2);
			WeirdLightPart(g2);

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
			light1.addPoint(414, 150);
			light1.addPoint(495, 122);
			light1.addPoint(549, 366);
			light1.addPoint(470, 384);
			g2.draw(light1);
			g2.fill(light1);
			 
			Ellipse2D.Double light2 = new Ellipse2D.Double(530, 90, 80, 80);
			 g2.draw(light2);
			 g2.fill(light2);
			 
			 Polygon light3 = new Polygon();
				light3.addPoint(551, 250);
				light3.addPoint(630, 230);
				light3.addPoint(659, 360);
				light3.addPoint(583, 378);
				g2.draw(light3);
				g2.fill(light3);
				
			Polygon light4 = new Polygon();
				light4.addPoint(645, 146);
				light4.addPoint(720, 122);
				light4.addPoint(780, 365);
				light4.addPoint(698, 380);
				g2.draw(light4);
				g2.fill(light4);
				
		Ellipse2D.Double light5 = new Ellipse2D.Double(550, 200, 82, 80);
			g2.draw(light5);
			g2.fill(light5);
			
		Ellipse2D.Double light6 = new Ellipse2D.Double(580.5, 330, 81, 80);
			g2.draw(light6);
			g2.fill(light6);
			
		Ellipse2D.Double light7 = new Ellipse2D.Double(413.5, 95, 84.9, 80);
			g2.draw(light7);
			g2.fill(light7);
		
		Ellipse2D.Double light8 = new Ellipse2D.Double(468.5, 331, 81.5, 80);
			g2.draw(light8);
			g2.fill(light8);
			
		Ellipse2D.Double light9 = new Ellipse2D.Double(644, 99, 80, 80);
			g2.draw(light9);
			g2.fill(light9);
			
		Ellipse2D.Double light10 = new Ellipse2D.Double(700, 338, 81, 80);
			g2.draw(light10);
			g2.fill(light10);
			
		Ellipse2D.Double light11 = new Ellipse2D.Double(708, 210, 81, 80);
			g2.draw(light11);
			g2.fill(light11);
			
		
		}
		
		
		
		
	public void WeirdLightPart(Graphics2D g2)
		{ 
			
			g2.drawRoundRect(293, 180, 20, 125, 10, 10);
			g2.fillRoundRect(293, 180, 20, 125, 10, 10);
			
			
			
			
			g2.setStroke(new BasicStroke(40));
		
		
			QuadCurve2D firstLine = new QuadCurve2D.Double(315, 225, 410, 240, 390, 175);
		g2.draw(firstLine);
		
		g2.setStroke(new BasicStroke(40));
		
	QuadCurve2D secondLine = new QuadCurve2D.Double(315, 255, 390, 280, 390, 360);
		g2.draw(secondLine);
		
		g2.setStroke(new BasicStroke(10));
		
		g2.drawRoundRect(375, 360, 73, 20, 23, 10);
		g2.fillRoundRect(375 , 360, 73, 20, 23, 10);
		
	Polygon light1 = new Polygon();
		light1.addPoint( 446, 360);
		light1.addPoint(430, 375);
		light1.addPoint(410, 295);
		light1.addPoint(430, 290);
		g2.draw(light1);
		g2.fill(light1);
		
		
		/*
		Polygon light1 = new Polygon();
			light1.addPoint(320, 208);
			light1.addPoint(340, 200);
			light1.addPoint(350, 192);
			light1.addPoint(360, 180);
			light1.addPoint(380, 155);
			light1.addPoint(390, 205);
			light1.addPoint(370, 230);
			light1.addPoint(350, 240);
			light1.addPoint(340, 245);
			light1.addPoint(320, 250);
			g2.draw(light1);
			g2.fill(light1);
		
			QuadCurve2D firstLine = new QuadCurve2D.Double(315, 225, 327.5, 240, 340, 155);
			g2.draw(firstLine);
			*/
		
			
		}
		
		public void drawGrid(Graphics2D g2)
		{
			
			g2.setColor(Color.LIGHT_GRAY);									
			for (int i=50; i<=1200; i=i+50)
			{
				g2.drawString(""+i, 5, i);
				Line2D.Double horizonalLine = new Line2D.Double(5, i, 700, i);	
				g2.draw(horizonalLine);
			}
			
			for (int i=50; i<=1200; i=i+50)
			{
				g2.drawString(""+i, i, 10);
				Line2D.Double horizonalLine = new Line2D.Double(i, 10, i, 700);	
				g2.draw(horizonalLine);
			}
			g2.setColor(Color.BLACK);									
			
		}
	}

