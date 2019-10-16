package space;

import java.awt.Color;

import info.gridworld.grid.Location;

public class RightBullet extends Bullet
{
//This bullet is used by the user and extends the Bullet abstract class	
	public RightBullet()
	{

	}

	@Override
	//it only goes right
	public void move() 
	{
		int row = getLocation().getRow();
		int col = getLocation().getCol();
		if(col<getGrid().getNumCols()-1)
		{
			moveTo(new Location(row, col+1));
		}
		else
		{
			removeSelfFromGrid();
		}		
	}
	//overrides Actor's color
	public Color getColor()
	{
		return null;
	}

}
