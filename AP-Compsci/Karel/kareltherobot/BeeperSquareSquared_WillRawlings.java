package kareltherobot;

import kareltherobot.Directions.Direction;

//Ch6 Exercise - for loops - create square of beepers
public class BeeperSquareSquared_WillRawlings extends BeeperSquare_WillRawlings
{
	public BeeperSquareSquared_WillRawlings (int st, int av, Direction dir, int beeps)
	{
		super(st, av, dir, beeps);
	}
	
	public void drawSquareSquared()
	{
		drawFiveSquareSide(1);
		drawFourSquareSide(2);
		drawThreeSquareSide(1);
	}
	
	
	
	
	public void drawThreeSquareSide(int numMoves)
	{
		for (int i=0; i<numMoves;i++)
		{
			drawSquareSide(3);
			moveBack();
		}
	}
	
	
	public void drawFourSquareSide(int numMoves)
	{
		for (int i=0; i<numMoves;i++)
		{
			drawSquareSide(4);
			moveBack();
		}
	}
	
	public void drawFiveSquareSide(int numMoves)
	{
		for (int i=0; i<numMoves;i++)
		{
			drawSquareSide(5);
			moveBack();
		}
	}
	
	
	
	
	public void drawSquareSide(int numMoves)
	{
		for (int i=0; i<numMoves;i++)
		
		{
			drawSquare();
			moveToPosition();
		}
	}
		
		
		
	
	public void moveToPosition()
	
	{
		
		
		moveStraight(5);
			
	}

			public void moveStraight(int numMoves)
			{
				for (int i=0; i<numMoves;i++)
				{
					move();
				}
			}
	public void moveBack()
	{
		
		{
			turnAround();
			move();
			turnRight();
			moveToPosition();
		}
	}






}
