
package gridworld;

import info.gridworld.grid.Grid;
import info.gridworld.world.World;
import info.gridworld.grid.Location;
import info.gridworld.grid.BoundedGrid;

// This class should take any string and display that string in a square grid fit to hold the string.  


public class WordSquare_WillRawlings 
{
	// Create instance variables for the grid and World (not ActorWorld), and the string being passed to it.

	private World <String> wordWorld;
	private String string;
	private BoundedGrid<String> grid;
	private int count;
	private double squareRoot;
	private int sideLength;
	private int length;
	
	public WordSquare_WillRawlings(String s)
	{
		
		string=s;
		length= string.length();
		squareRoot= Math.sqrt(length);
		sideLength= (int)Math.ceil(squareRoot);
		 grid= new BoundedGrid(sideLength,sideLength);
		 wordWorld= new World <String>(grid);
		count=0;
		grid= (BoundedGrid<String>) wordWorld.getGrid();
		
		for (int r=0; r< grid.getNumRows(); r++)
		{
			for (int c=0; c<grid.getNumCols();c++)
			{
				
				if (count<string.length())
				{
					grid.put(new Location (r,c),string.substring(count,count+1));
					
				}
				else
				{
					grid.put(new Location (r,c),string.substring(s.length()-1,s.length()));
				}
				count++;
		}

	}
	
	}

	public void show()
	{
		// Set the title and show the world with the string displayed
		wordWorld.setMessage("Word Square World!");   	  			
		wordWorld.show();			
	}
}
