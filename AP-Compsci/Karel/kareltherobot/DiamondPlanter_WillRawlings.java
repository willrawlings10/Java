package kareltherobot;
import kareltherobot.*;

public class DiamondPlanter_WillRawlings extends BetterRobot_WillRawlings
{
	public DiamondPlanter_WillRawlings (int st, int av, Direction dir, int beeps) 
	{
		super(st, av, dir, beeps);
	}

	public void plantDiamond()
	{
		putBeeper();
		moveDiagionalUpRight();
		putBeeper();
		moveDiagionalUpLeft();
		putBeeper();
		moveDiagionalDownLeft();
		putBeeper();
		moveDiagionalDownRight();
		turnLeft();
		turnOff();
		

	}
	
	public void moveDiagionalUpRight()
	{
		turnRight();
		move();
		turnLeft();
		move();
	}
	public void moveDiagionalUpLeft()
	{
		move();
		turnLeft();
		move();
		
	}

	public void moveDiagionalDownLeft()
	{
       move();
      turnLeft();
     move();
	}
	
	public void moveDiagionalDownRight()
	{
      move();
      turnLeft();
      move();

	}



















	

}




