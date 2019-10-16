package graphicalApps;

import javax.swing.JFrame;

public class RepeatingRectangleViewer
{
	public static void main(String [] args)
	{
		JFrame frame = new JFrame();	//Instantiate new frame	
		frame.setSize(500, 500);		//Set frame size
		frame.setTitle("Repeating Shape");		//Set frame title
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		RepeatingRectangleComponent component = new RepeatingRectangleComponent();  
		frame.add(component);		//Add component to frame
		frame.setVisible(true);		//Set frame visible
	}
}