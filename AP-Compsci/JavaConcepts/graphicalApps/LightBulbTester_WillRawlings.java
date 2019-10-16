package graphicalApps;

import java.awt.Component;
import java.awt.geom.QuadCurve2D;

import javax.swing.JFrame;

public class LightBulbTester_WillRawlings
{
	public static void main(String [] args)
	{
		JFrame frame = new JFrame();		
		frame.setSize(900, 500);		
		frame.setTitle("LightBulb");		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		LightBulb_WillRawlings component  = new LightBulb_WillRawlings();  
		frame.add(component);		
		frame.setVisible(true);		
	}
}