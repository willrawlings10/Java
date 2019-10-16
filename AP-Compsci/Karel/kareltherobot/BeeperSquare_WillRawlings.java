package kareltherobot;

import kareltherobot.*;

// Ch6 Exercise - for loops - create a 6x6 square of beepers
public class BeeperSquare_WillRawlings extends SmartBot_WillRawlings
{
	public BeeperSquare_WillRawlings (int st, int av, Direction dir, int beeps)
	{
		super(st, av, dir, beeps);
	}
	
	// You need to use at least one for loop to create the square
	public void drawSquare()
	{
		for (int i=0; i<4; i++)
		{
			drawSide(4);
			turnLeft();
		}	


	}

	public void drawSide(int numMoves)
	
	{
		for (int i=0; i<numMoves; i++)
		{
			move();
			putBeeper();
		}
	
		
		
		
	}
	
	
}
	
	
	
