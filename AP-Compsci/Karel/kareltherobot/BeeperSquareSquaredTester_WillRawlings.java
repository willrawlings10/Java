package kareltherobot;

import java.awt.Color;

//Ch6 Exercise - for loops - create square of beepers
public class BeeperSquareSquaredTester_WillRawlings implements Directions
{
	public static void main(String args[])  
	{
		World.setVisible(true);
		World.setSize(50, 50);
		World.setStreetColor(Color.WHITE);
		//World.setDelay(0);
		World.showSpeedControl(true);
		
		
		BeeperSquareSquared_WillRawlings squareMaker;
		squareMaker =  new BeeperSquareSquared_WillRawlings(2, 2, East, infinity);
		squareMaker.drawSquareSquared();
		squareMaker.setVisible(false);	}	
}


