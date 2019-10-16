package gridworld;
import info.gridworld.actor.Actor;
import info.gridworld.grid.UnboundedGrid;
import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

import java.awt.Color;

/**
 * This class runs a world that contains box bugs. <br />
 * This class is not tested on the AP CS A and AB exams.
 */
public class MultiSpiralBugRunner_WillRawlings
{
    public static void main(String[] args)
    {
        UnboundedGrid grid = new UnboundedGrid<Actor>();
    	ActorWorld world = new ActorWorld(grid);
    	
	// original sidelength, finish length, row increment, column increment
    	MultiSpiralBug_WillRawlings alice = new MultiSpiralBug_WillRawlings(3,9,10,-10);

        alice.setColor(Color.ORANGE);
        world.add(new Location(7, 8), alice);
        world.show();
    }
}