package FinalProject;

import info.gridworld.actor.Actor;

public abstract class Bullet extends Actor
{

	public Bullet()
	{
		
	}
	
	public void act()
	{
		move();
	}
	
	public abstract void move();
}
