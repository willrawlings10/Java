package kareltherobot;
import kareltherobot.Directions.Direction;
public class BetterRobot_WillRawlings extends Robot 
{ 
	public BetterRobot_WillRawlings (int st, int av, Direction dir, int beeps)
	{
		super(st, av, dir, beeps);
	} 
	
	
	public void turnRight()
	{ 
	  turnLeft();
	  turnLeft();
	  turnLeft();
	}

	public void moveBackward()
	{
		turnLeft();
		turnLeft();
		move();
		turnLeft();
		turnLeft();
	}

   public void turnAround()
   { 
	   turnLeft();
	   turnLeft();
	   
   }
   
   public void moveMile()
   { move();
   	move();
   	move();
   	move();
   	move();
   	move();
   	move();
   	move();
   }
   
   public void moveDecaMile()
   {
	   moveMile();
	   moveMile();
	   moveMile();
	   moveMile();
	   moveMile();
	   moveMile();
	   moveMile();
	   moveMile();
	   moveMile();
	   moveMile();
   }
   
   
   public void draw5BeeperLine()
   {
	   putBeeper();
	   move();
	   putBeeper();
	   move();
	   putBeeper();
	   move();
	   putBeeper();
	   move();
	   putBeeper();
	   move();
	     }
   





}




