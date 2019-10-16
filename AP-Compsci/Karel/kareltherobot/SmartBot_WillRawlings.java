package kareltherobot;

public class SmartBot_WillRawlings extends BetterRobot_WillRawlings
{
	public SmartBot_WillRawlings (int st, int av, Direction dir, int beeps)
	{
		super(st, av, dir, beeps);
	}

	public boolean beeperIsToLeft()  
	{
		turnLeft();
		move();
			if( nextToABeeper())
		
			{
				turnLeft(); 
				turnLeft();
				move();
				turnLeft();
				return true;
				
		}
			else
			{ 
			turnLeft();
			turnLeft();
			move();
			turnLeft();
			return false;
		}
		
		
	
	}
	
	public boolean beeperIsToRight() 
	{
		turnRight();
		move();
		if( nextToABeeper())
		
		
		{turnLeft(); 
		turnLeft();
		move();
		turnRight();
		return true; 
		}
		{ 
			turnLeft();
			turnLeft();
			move();
			turnRight();
			return false;
		}
	}

	public boolean twoBeepersOrMoreOnCorner() 
	{
		if (nextToABeeper())
		{   pickBeeper();
		
		if (nextToABeeper())
		{   putBeeper();
		return true;} 
		
		{putBeeper();
		return false; 
		}
		}
		
		return false;	}
		
	
	
	public void faceEast()
	{
		if (facingNorth())
			{
			turnRight();
			}
	
		if (facingSouth())
			{
			turnLeft();
			}
		
		if (facingWest())
			{
			turnAround();
			}
	}

	public void faceWest()
	{
		if (facingNorth())
			{
			turnRight();
			}
		
		if (facingEast())
			{
			turnAround();
			}
		
		if (facingSouth())
			{
			turnLeft();
			}
		
	}

	public void faceSouth()
	{
		if (facingNorth())
			{
			turnAround();
			}
		
		if (facingEast())
			{
			turnRight();
			}
		
		
		if (facingWest())
			{
			turnLeft();
			}
	}
	
	public void faceNorth()
	{
	
			if (facingEast())
			turnLeft();
		
		if (facingSouth())
			turnAround();
			
		
		if (facingWest())
			turnRight();
	}
	
	public boolean rightIsClear()
	{
		turnRight();
		{ 
			if (frontIsClear())
			{
				turnLeft();
				return true;
			}
			else
	
			{
				turnLeft();
				return false;
			}
		
		}
		
	}	
	
	public boolean leftIsClear()
	{
		turnLeft();
		{ 
			if (frontIsClear())
			{
				turnRight();
				return true;
			}
			else
	
			{
				turnRight();
				return false;
			}
		
		}
		
	}	
	public boolean backIsClear()
	{
		turnAround();
		{ 
			if (frontIsClear())
			{
				turnAround();
				return true;
			}
			else
	
			{
				turnAround();
				return false;
			}
		
		}
		
	}	
	
	
	
}