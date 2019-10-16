package graphicalApps;

import javax.swing.JFrame;

public class TexturePaintViewer
{
	public static void main(String [] args)
	{
		JFrame frame = new JFrame();	//Instantiate new frame	
		frame.setSize(600, 900);		//Set frame size
		frame.setTitle("TexturePaint Examples");		//Set frame title
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		TexturePaintComponent component = new TexturePaintComponent();  //Instantiate component
		frame.add(component);		//Add component to frame
		frame.setVisible(true);		//Set frame visible
	}
}