package javaConcepts;

import javax.swing.JFrame;

public class FaceViewer_WillRawlings
{
	public static void main(String [] args)
	{
		JFrame frame = new JFrame();	//Instantiate new frame	
		frame.setSize(300, 400);		//Set frame size
		frame.setTitle("Alien Face");		//Set frame title
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FaceComponent_WillRawlings component = new FaceComponent_WillRawlings();  //Instantiate component
		frame.add(component);		//Add component to frame
		frame.setVisible(true);		//Set frame visible
	}
}