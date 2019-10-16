
package kareltherobot;

import java.awt.Color;

public class LetterRobot_WillRawlings extends BetterRobot_WillRawlings
{
	public LetterRobot_WillRawlings (int st, int av, Direction dir, int beeps) 
	{
		super(st, av, dir, beeps);		
	}

	public void drawH()
	{
		
	draw5VertLine();
	turnRight();
	move3Blocks();
	turnRight();
	draw5VertLine();
	turnAround();
	move2Blocks();
	turnLeft();
	draw2HorizontalLine();
	
	
	
	}

	public void drawE()
	{
	 draw5VertLine();
	 turnRight();
	 draw3HorizontalLine();
	 turnRight();
	 move2Blocks();
	 turnRight();
	 draw2HorizontalLine();
	 turnLeft();
	 move2Blocks();
	 turnLeft();
	 draw3HorizontalLine();
	 move();

	}

   public void draw5VertLine()
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
       
   }

   public void draw3HorizontalLine()
   {
	   move();
       putBeeper();
       move();
       putBeeper();
       move();
       putBeeper();
   }
   
   public void draw2HorizontalLine()
   {  
	   move();
       putBeeper();
       move();
       putBeeper();
       move();
   }
   
   public void move2Blocks()
   {
	   move();
	   move();
   }
   
 public void move3Blocks()
 {  
	 move();
	 move();
	 move();
 }
   
   
   
   
   
}