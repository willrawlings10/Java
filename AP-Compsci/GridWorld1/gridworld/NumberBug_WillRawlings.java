package gridworld;

import java.awt.Color;
import java.util.ArrayList;

import info.gridworld.grid.Grid;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;

// Extend the Bug class to make a NumberBug that will move around the grid just like 
// a Bug.  NumberBug will drop increasing numbers instead of Flowers.  If the 
// NumberBug cannot move, but one of its adjacent locations is open, the NumberBug 
// should simply turn (like a normal Bug).  However, if the NumberBug is surrounded 
// on all sides by objects, then it should move to the first open location in the grid.  
// In this case, if there are no open locations in the grid, then it should simply turn.  
// You may need to override the act(), move(), and turn() methods. 
//
public class NumberBug_WillRawlings extends Bug
{
	// The number instance variable keeps track of the Number object that the bug drops
	private Number_WillRawlings number;
	private int startNumber;
	private Color textColor;
	private Color bugColor;
	// This constructor method with no parameters will create an orange bug.  
	// Number starts as 0.
	public NumberBug_WillRawlings()
	{
		super(Color.ORANGE);
		number = new Number_WillRawlings(0, getColor());
	}
	
	// This constructor method with one parameter will create an orange bug.  
	// Integer parameter num is the starting number.
	public NumberBug_WillRawlings(int num)
	{
		startNumber=num;

	}

	// This constructor method with two parameters will create a bug of the color specified.  
	// Integer parameter num is the starting number.
	public NumberBug_WillRawlings(int num, Color color)
	{
		startNumber=num;
		bugColor=color;
		

	}
	
	// This constructor method with 3 parameters will create a bug of the color specified.  
	// Integer parameter num is the starting number.
	// txtColor is the color of the number
	public NumberBug_WillRawlings(int num, Color color, Color txtColor)
	{
		startNumber=num;
		bugColor=color;
		textColor=txtColor;

	}	
	
	// This method is used to drop the number behind the NumberBug when it moves away from a cell.
	// It also should construct a new Number object using 3 parameters.
	public void leaveNumberBehind(Grid<Actor> grid, Location loc)
	{
		Number_WillRawlings numb = new Number_WillRawlings( startNumber, bugColor, textColor);
		numb.putSelfInGrid(grid, loc);
		startNumber++;
	}
	
	// Override the act() method if necessary
	public void act()
	{
		if (canMove())
		{
			move();
		}
		
		else 
			if( getGrid().getEmptyAdjacentLocations(getLocation()).size()!=0)
			{
				turn();
				
			}
			else
			{
				Location loc=getLocation();
				for (int r=0;r<getGrid().getNumRows();r++)
				{
					for (int c=0;c<getGrid().getNumCols();c++)
					{
						Location empty= new Location(r,c);
						Actor maybeActor= getGrid().get(empty);
						if(maybeActor==null)
						{
							moveTo(empty);
							leaveNumberBehind(getGrid(),loc);
							return;
						}
						
					}
					
				}
			}


	}
	
	// Override the move method if necessary
	public void move()
	{
		Grid<Actor> gr=getGrid();
		if (gr==null)
			return;
		Location loc =getLocation();
		Location next=loc.getAdjacentLocation(getDirection());
		if (gr.isValid(next))
			moveTo(next);
		else
			removeSelfFromGrid();
		leaveNumberBehind(gr,loc);
		



	}
	
	/* Override the turn method if necessary.  This might be the right place to see
	 if there are any empty cells around this NumberBug.
	public void turn()
	{

		check for emptyAdjacentLocations
		if the Array List,size==0 , then must 
		Location loc= getFirstEmptyLocation();
		moveTo(loc);
		else 
		turn();



	}

	// Create this method to return the first empty location in the grid.  This method
	// should only be called if the NumberBug is stuck (has no empty cells around it).
	public Location getFirstEmptyLocation()
	{
		
		Location loc=getLocation();
	for (int r=0;r<getGrid().getNumRows()-1;r++)
	{
		for (int c=0;c<getGrid().getNumCols()-1;c++)
		{
			Location empty= new Location(r,c);
			if (the area is empty)
			{
				loc=empty;
				break;
			}
		}
		if (loc.equals(empty))
		{
			break;
		}
	}
	
	return loc;




	}

*/
}