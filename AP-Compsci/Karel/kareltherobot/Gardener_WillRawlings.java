package kareltherobot;

import java.awt.Color;

public class Gardener_WillRawlings extends BetterRobot_WillRawlings
{
	public Gardener_WillRawlings (int st, int av, Direction dir, int beeps) 
	{
		super(st, av, dir, beeps);		
	}

	
	public void timeToGarden()
	{
		moveFourPlantFour();
		turnLeft();
		moveFourPlantThree();
		
		
	}
	
	
	
	public void moveFourPlantFour()
	{
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
	}

	public void moveFourPlantThree()
	{
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
		
		
		
	}









}


