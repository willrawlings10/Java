package kareltherobot;

import java.awt.Color;

public class DiagonalLeftRobot_WillRawlings extends BetterRobot_WillRawlings
{
	public DiagonalLeftRobot_WillRawlings (int st, int av, Direction dir, int beeps) 
	{
		super(st, av, dir, beeps);		
	}

	public void move()
	{
		
		turnLeft();
		super.move();
		turnRight();
		super.move();
	}
	
}