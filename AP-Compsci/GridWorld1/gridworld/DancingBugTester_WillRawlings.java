package gridworld;

import java.awt.Color;

import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

public class DancingBugTester_WillRawlings {

	public static void main(String[] args) {
		 ActorWorld world = new ActorWorld(new BoundedGrid(45,45));
		 
		// int[] turns = { 2,3,3,5,6,0,8};
		 int[] turns = { 10,9,8,7,6,5,4,3,2,1,0};
		 
	        DancingBug_WillRawlings alice = new DancingBug_WillRawlings(turns);
	        alice.setColor(Color.ORANGE);
	        world.add(new Location(17, 17), alice);
	        world.show();

	}

}