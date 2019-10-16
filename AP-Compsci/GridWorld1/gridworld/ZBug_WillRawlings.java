package gridworld;

import info.gridworld.actor.Bug;


public class ZBug_WillRawlings extends Bug
{
	private int steps;
	private int zLength;
	private int turns;

	public ZBug_WillRawlings(int length) 
	{
		turns=0;
		steps=0;
		zLength= length;
	}
	
	  public void act()
	    {
		  if (canMove())
			  
		  {
	        if (steps < zLength && canMove() )
	        {
	            move();
	            steps++;
	        }
	        else if (turns==0)
	        {
	            turn();
	            turn();
	            turn();
	            steps = 0;
	            turns=1;
	        }
	        
	        else if (turns==1)
	        {
	        	turn();
	        	turn();
	        	turn();
	        	turn();
	        	turn();
	        	steps=0;
	        	turns=2;
	        	move();
	       
	        
		  }
	       
		  }
	    }

}
