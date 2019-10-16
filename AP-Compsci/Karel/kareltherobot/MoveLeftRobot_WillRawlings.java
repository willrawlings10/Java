
package kareltherobot;

import java.awt.Color;

public class MoveLeftRobot_WillRawlings extends BetterRobot_WillRawlings
{
	public MoveLeftRobot_WillRawlings (int st, int av, Direction dir, int beeps) 
	{
		super(st, av, dir, beeps);		
	}

	public void move()
	{
		turnLeft();
		super.move();
		turnRight();
		
		
		
		
	}
	
}