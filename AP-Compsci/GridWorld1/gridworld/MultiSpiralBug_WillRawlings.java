package gridworld;
import info.gridworld.actor.Bug;
import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;
import java.awt.Color;

public class MultiSpiralBug_WillRawlings extends Bug
{
    private int steps;
    private int side;
    private int startLength;
    private int endLength;
    private int row;
    private int column;
    //  add other instance variables as needed (you may need 5-6 instance variables in this class)

    public MultiSpiralBug_WillRawlings (int length, int finLen, int rowIncrement, int columnIncrement)
    {
    	side=0;
        steps = 0;
        startLength = length;
        endLength= finLen;
        row = rowIncrement;
        column= columnIncrement;
        steps=startLength;
        
	// add other lines of code to initialize your instance variables

    }

    public void act()
    {
	if (canMove())
	{
		if (steps<=endLength)
		{
			if (side<steps)
			{
				move();
				side++;
			}
			else
			{
				steps++;
				side=0;
				turn();
				turn();
			}
		}
		
		
		
	else
		{
		moveTo(new Location( (getLocation().getRow() +row),(getLocation().getCol())+column));
			side=0;
			steps=startLength;
			setDirection(0);
		}

		
   
	
	}
	}
	}

