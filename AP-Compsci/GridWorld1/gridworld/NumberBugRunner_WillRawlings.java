package gridworld;

import java.awt.Color;
import info.gridworld.grid.Location;
import info.gridworld.actor.ActorWorld;

// This driver will create a world and add NumberBugs to it.
public class NumberBugRunner_WillRawlings
{
	public static void main(String[] args)
	{
		ActorWorld world = new ActorWorld();
		world.add(new Location(4,3), new NumberBug_WillRawlings(1));		
		world.add(new Location(2,1), new NumberBug_WillRawlings(5, Color.GREEN));		
		world.add(new Location(7,6), new NumberBug_WillRawlings(-144, Color.RED, Color.WHITE));		
		world.show(); 
	}
}
