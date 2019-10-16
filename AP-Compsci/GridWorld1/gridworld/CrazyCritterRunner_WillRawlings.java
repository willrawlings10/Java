package gridworld;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Flower;
import info.gridworld.actor.Bug;
import java.awt.Color;

public class CrazyCritterRunner_WillRawlings
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        CrazyCritter_WillRawlings crazy = new CrazyCritter_WillRawlings();
        crazy.setDirection(45);
        world.add(new Location(4,4), crazy);
        world.add(new Location(5,5), new Rock(Color.GREEN));
        world.add(new Location(3,5), new Bug(Color.BLUE));
        world.add(new Location(4,5), new Rock(Color.RED));
        world.add(new Location(4,3), new Actor());
        //world.add(new Location(2,6), new Rock(Color.RED));
        world.add(new Location(5,7), new Flower(Color.GREEN));
        world.add(new Location(6,2), new Rock(Color.GREEN));
        Actor actor = new Actor();
        actor.setColor(Color.GREEN);
        world.add(new Location(3,3), actor);
        world.add(new Location(5,3), new Flower(Color.RED));
        world.add(new Location(5,4), new Actor());
        world.add(new Location(1,2), new Bug(Color.RED));
        world.show();
    }
}
