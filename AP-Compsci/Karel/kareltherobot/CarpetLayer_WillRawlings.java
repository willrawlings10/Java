package kareltherobot;

import kareltherobot.*;

// Ch5 ex. 11 (pages 133-134) - Carpet small rooms
public class CarpetLayer_WillRawlings extends SmartBot_WillRawlings
{
	public CarpetLayer_WillRawlings (int st, int av, Direction dir, int beeps)
	{
		super(st, av, dir, beeps);
	}
	
	// The layCarpet() method should lay carpet (put down a beeper) if there is a small room
	public void layCarpet()
	{
        faceNorth();
        move();
	
		if (! frontIsClear() && (! leftIsClear()) && (! rightIsClear())                        )
		{
			putBeeper();
		}
		
		turnAround();
		move();
		faceEast();
		move();





	}
}