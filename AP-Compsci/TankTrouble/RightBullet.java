package FinalProject;

import info.gridworld.grid.Location;

public class RightBullet extends Bullet
{
	
	public RightBullet()
	{

	}

	@Override
	public void move() 
	{
		int row = getLocation().getRow();
		int col = getLocation().getCol();
		if(col<getGrid().getNumCols())
		{
			moveTo(new Location(row, col+1));
		}
		else
		{
			removeSelfFromGrid();
		}		
	}

}
