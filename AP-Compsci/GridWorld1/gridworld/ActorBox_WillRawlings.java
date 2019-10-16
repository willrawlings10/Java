package gridworld;

import info.gridworld.grid.Location;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Critter;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Rock;
import info.gridworld.actor.Flower;
import java.awt.Color;


public class ActorBox_WillRawlings
{
	public static void main(String[] args)
	{
		ActorWorld world = new ActorWorld();
		int i=0;
		 for ( i=0; i<10; i++)
			{
			 	if ( (0<i) && (i<9))
			 		 {world.add(new Location(i,0), new Actor());}
			 	if ( (0<i) && (i<9))
			 		{world.add(new Location(0,i), new Critter());}
			 	if ( (0<i) && (i<9))
		 			{world.add(new Location(i,9), new Bug());}
			 	if ( (0<i) && (i<9))
		 			{world.add(new Location(9,i), new Flower());}
			 	if ( (0<i) && (i<9))
		 			{world.add(new Location(i,i), new Rock());}
		 	
			 	world.add(new Location(i,i), new Rock());
			 	world.add(new Location(i,9-i), new Rock());
			}
			
			
	        world.show();


				
			}
}