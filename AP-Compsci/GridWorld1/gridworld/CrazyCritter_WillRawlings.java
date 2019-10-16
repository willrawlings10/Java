package gridworld;



import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import java.awt.Color;

import java.util.ArrayList;

public class CrazyCritter_WillRawlings extends Critter
{
	Grid<Actor> gr;	
	
	public CrazyCritter_WillRawlings()
	{
		setColor(Color.GREEN);
	}
	
	//getActors will return all actors around this critter that are directly in front, 
	//directly behind, directly right or directly left of where CrazyCritter is facing
	public ArrayList<Actor> getActors()
	{
		ArrayList<Actor> actors= new ArrayList<Actor>();
		Grid<Actor> grid = getGrid();
		Location front = getLocation().getAdjacentLocation(getDirection());
		Location right = getLocation().getAdjacentLocation(getDirection() + 90);
		Location behind = getLocation().getAdjacentLocation(getDirection() + 180);
		Location left = getLocation().getAdjacentLocation(getDirection() - 90);
		
		if (grid.isValid(front) && grid.get(front)!= null)
		{
			actors.add(grid.get(front));
		}
		
		if (grid.isValid(behind) && grid.get(behind)!= null)
		{
			actors.add(grid.get(behind));
		}
		if (grid.isValid(right) && grid.get(right)!= null)
		{
			actors.add(grid.get(right));
		}
		if (grid.isValid(left) && grid.get(left)!= null)
		{
			actors.add(grid.get(left));
		}
		
		return actors;
	}
    
	//If the selected actors have the same color as CrazyCritter, CrazyCritter will make 
	//them turn 90 degrees.  If any of the selected actors are not the same color as CrazyCritter, 
	//then make them move two locations away from CrazyCritter, in the direction that CrazyCritter 
	//would have to go to get to the actor.  If the actor cannot move two locations away from CrazyCritter 
	//because the location is occupied or there is a wall, then it should turn orange instead.	
	public void processActors(ArrayList<Actor> actors)
	{
		gr=getGrid();
		for (Actor a: actors)
		{
			if (a.getColor() == getColor())
			{
				a.setDirection(getDirection()+90);
			}
			
			
			Location critterLoc = getLocation();
			Location actorLoc = a.getLocation();
			int target = critterLoc.getDirectionToward(actorLoc);
			Location loc =getLocation().getAdjacentLocation(target);
			
			Actor maybeActor = gr.get(loc);
			
			
			if ((a.getColor() != getColor()) && (maybeActor==null) && (loc != null) )
			{
				a.moveTo(loc);
			}
		
			else if ((a.getColor() != getColor()) && ((maybeActor != null) || (loc == null)) )
			{
				a.setColor(Color.ORANGE);
			}
		}
		


	}
}

