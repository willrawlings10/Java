package gridworld;

import info.gridworld.actor.Bug;


public class DancingBug_WillRawlings extends Bug
{
	private int turnAmt;
	private int[] turn;

	public DancingBug_WillRawlings(int[] turns) 
	{
		turn= turns;
		turnAmt=0;
		
	}
	
	  public void act()
	    {
		 if (canMove())
			  
		 
		  {
			 if (turnAmt==turn.length)
			 {
				 turnAmt=0;
			 }
				  
				  	for (int j=0; j<turn[turnAmt]; j++)
				  	{
				  		turn();
				  	}
				  	
				super.act();
				turnAmt++;
			  
			
		  }
	        
	    
	       
		  }
	    }
