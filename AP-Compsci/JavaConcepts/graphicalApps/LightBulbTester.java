package graphicalApps;

import java.awt.Component;
import java.awt.geom.QuadCurve2D;

import javax.swing.JFrame;

public class LightBulbTester
{
	public static void main(String [] args)
	{
		JFrame frame = new JFrame();	//Instantiate new frame	
		frame.setSize(1200, 600);		//Set frame size
		frame.setTitle("LightBulb");		//Set frame title
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		LightBulb component  = new LightBulb();  //Instantiate component
		frame.add(component);		//Add component to frame
		frame.setVisible(true);		//Set frame visible
	}
}