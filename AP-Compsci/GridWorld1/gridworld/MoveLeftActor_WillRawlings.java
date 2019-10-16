package gridworld;
import java.awt.Color;
import info.gridworld.grid.Grid;
import info.gridworld.actor.Actor;
import info.gridworld.grid.Location;
import info.gridworld.actor.ActorWorld;

public class MoveLeftActor_WillRawlings extends Actor
{
	public void act()
	{
		setDirection(270);
		int col= getLocation().getCol();
		int row= getLocation().getRow();
		moveTo(new Location(row, col-1));
	}
}