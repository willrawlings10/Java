package kareltherobot;
import kareltherobot.Directions.Direction;
public class MileWalker extends UrRobot 
{ 
	public MileWalker (int st, int av, Direction dir, int beeps)
	{
		super(st, av, dir, beeps);
	}

public void moveMile()
{ move();
	move();
	move();
	move();
	move();
	move();
	move();
	move();
}




}
