package gridworld;
import java.awt.Color;
import info.gridworld.actor.Actor;
import info.gridworld.grid.Location;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.actor.ActorWorld;

public class MoveLeftActorRunner_WillRawlings
{
	public static void main(String[] args)
	{
		ActorWorld world = new ActorWorld();
		MoveLeftActor_WillRawlings actor= new MoveLeftActor_WillRawlings();
		world.add(new Location(5,5),actor);
		world.show();
		
	}
}