
package kareltherobot;

import java.awt.Color;

public class DiagonalRightRobot_WillRawlings extends BetterRobot_WillRawlings
{
	public DiagonalRightRobot_WillRawlings (int st, int av, Direction dir, int beeps) 
	{
		super(st, av, dir, beeps);		
	}

	public void move()
	{
		turnRight();
		super.move();
		turnLeft();
		super.move();
	}

}