package gridworld;

import java.awt.Color;

import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Location;

public class ZBugTester_WillRawlings {

	public static void main(String[] args) {
		 ActorWorld world = new ActorWorld(new BoundedGrid(15,15));
	        ZBug_WillRawlings alice = new ZBug_WillRawlings(3);
	        alice.setColor(Color.ORANGE);
	        ZBug_WillRawlings bob = new ZBug_WillRawlings(7);
	        ZBug_WillRawlings rob = new ZBug_WillRawlings(7);
	        world.add(new Location(1,4), bob);
	        world.add(new Location(11,11), rob);
	        rob.setDirection(180);
	        bob.setDirection(90);
	        world.add(new Location(5, 6), alice);
	        world.show();

	}

}
