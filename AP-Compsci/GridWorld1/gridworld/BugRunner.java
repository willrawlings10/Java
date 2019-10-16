package gridworld;

import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Rock;
import info.gridworld.actor.Actor;

/**
 * This class runs a world that contains a bug and a rock, added at random
 * locations. Click on empty locations to add additional actors. Click on
 * populated locations to invoke methods on their occupants. <br />
 * To build your own worlds, define your own actors and a runner class. See the
 * BoxBugRunner (in the boxBug folder) for an example. <br />
 * This class is not tested on the AP CS A and AB exams.
 */
public class BugRunner
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        world.add(new Bug());
        world.add(new Rock());
        for (int i=0; i<5; i++)
		{
			world.add(new Location(4,i), new Actor());
		}
		
		
        world.show();
    }
}

/*public class ActorPlacer
{
	public static void main(String[] args)
	{
		ActorWorld earth = new ActorWorld();
		for (int i=0; i<5; i++)
		{
			earth.add(new Location(4,i), new Actor());
		}
		
		earth.show();
	}
}
*/