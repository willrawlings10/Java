package kareltherobot;

//Ch6 Exercise - for loops - create square of beepers
public class BeeperSquareTester_WillRawlings implements Directions
{
	public static void main(String args[])  
	{
		World.setVisible(true);
		World.showSpeedControl(true);
		
		BeeperSquare_WillRawlings squareMaker;
		squareMaker = new BeeperSquare_WillRawlings(2, 2, East, infinity);
		squareMaker.drawSquare();
		squareMaker.setVisible(false);

		squareMaker = new BeeperSquare_WillRawlings(4, 4, East, infinity);
		squareMaker.drawSquare();
		squareMaker.setVisible(false);
		World.repaint();
	}	
}


